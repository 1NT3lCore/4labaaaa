package lab4.carnumber;

public class AutoBase {
    public enum CarStatus {
        AT_BASE,    // на базе
        ON_ROUTE,   // в рейсе
        IN_REPAIR   // в ремонте
    }

    private static class CarRecord {
        Car car;
        CarStatus status;

        CarRecord(Car car) {
            this.car = car;
            this.status = CarStatus.AT_BASE;
        }

        @Override
        public String toString() {
            return car.toString() + " [Статус: " + status + "]";
        }
    }

    private final CarRecord[] parking;
    private int count;

    public AutoBase(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Вместимость должна быть положительной");
        }
        this.parking = new CarRecord[capacity];
        this.count = 0;
    }

    // Добавление автомобиля на базу
    public boolean addCar(Car car) {
        if (count >= parking.length) {
            return false;
        }
        parking[count++] = new CarRecord(car);
        return true;
    }

    // Удаление автомобиля по индексу
    public boolean removeCar(int index) {
        if (index < 0 || index >= count) {
            return false;
        }

        // Сдвигаем элементы массива
        for (int i = index; i < count - 1; i++) {
            parking[i] = parking[i + 1];
        }

        parking[--count] = null;
        return true;
    }

    // Изменение статуса автомобиля
    public boolean changeCarStatus(int index, CarStatus newStatus) {
        if (index < 0 || index >= count) {
            return false;
        }
        parking[index].status = newStatus;
        return true;
    }

    // Отправка в рейс
    public boolean sendToRoute(int index) {
        return changeCarStatus(index, CarStatus.ON_ROUTE);
    }

    // Отправка в ремонт
    public boolean sendToRepair(int index) {
        return changeCarStatus(index, CarStatus.IN_REPAIR);
    }

    // Возврат на базу
    public boolean returnToBase(int index) {
        return changeCarStatus(index, CarStatus.AT_BASE);
    }

    // Вывод списка автомобилей по статусу
    public void printCarsByStatus(CarStatus status) {
        System.out.println("\n=== Автомобили с статусом: " + status + " ===");
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (parking[i].status == status) {
                System.out.println((i+1) + ". " + parking[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Автомобилей с таким статусом нет");
        }
    }

    // Вывод информации о базе
    public void printBaseInfo() {
        System.out.println("\n=== Информация о автобазе ===");
        System.out.println("Вместимость: " + parking.length);
        System.out.println("Текущее количество: " + count);

        printCarsByStatus(CarStatus.AT_BASE);
        printCarsByStatus(CarStatus.ON_ROUTE);
        printCarsByStatus(CarStatus.IN_REPAIR);
    }
}