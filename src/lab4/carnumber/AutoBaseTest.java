package lab4.carnumber;

public class AutoBaseTest {
    public static void main(String[] args) {
        // Создаем автобазу на 3 автомобиля
        AutoBase base = new AutoBase(3);

        // Создаем автомобили
        Car car1 = new PassengerCar("Toyota", "Red",
                new Engine("SN1", 150, 2.0, 8.5, "Petrol", 4), 4, "А123ВС77RUS");

        Car car2 = new Bus("Mercedes", "Yellow",
                new Engine("SN2", 250, 5.0, 12.0, "Diesel", 6), 6);

        Car car3 = new Truck("Volvo", "Blue",
                new Engine("SN3", 400, 8.0, 15.0, "Diesel", 8), 6, "М456ОР123RUS");

        // Добавляем автомобили на базу
        base.addCar(car1);
        base.addCar(car2);
        base.addCar(car3);

        // Выводим информацию о базе
        base.printBaseInfo();

        // Отправляем автомобили в рейс и на ремонт
        base.sendToRoute(0); // Toyota в рейс
        base.sendToRepair(1); // Mercedes в ремонт

        // Выводим обновленную информацию
        base.printBaseInfo();

        // Возвращаем автомобили на базу
        base.returnToBase(0); // Toyota возвращается
        base.returnToBase(1); // Mercedes возвращается

        // Удаляем один автомобиль
        base.removeCar(1);

        // Финальный вывод информации
        base.printBaseInfo();
    }
}