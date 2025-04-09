package lab4.carengine;

public class CarTest {
    public static void main(String[] args) {
        // Создаем двигатели
        Engine engine1 = new Engine("SN-123456", 150.5, 2.0, 8.5, "бензин", 4);
        Engine engine2 = new Engine("SN-654321", 400.0, 5.9, 15.0, "дизель", 6);
        Engine engine3 = new Engine("SN-987654", 200.0, 3.0, 10.5, "бензин", 6);

        // Создаем автомобили
        Car car1 = new Car("Toyota", VehicleType.PASSENGER, "Красный", engine1, 4);
        Car car2 = new Car("Kamaz", VehicleType.TRUCK, "Синий", engine2, 6, "А123ВС77RUS");
        Car bus = new Car("PAZ", VehicleType.BUS, "Желтый", engine3, 6);

        System.out.println("Автомобиль 1 создан:");
        System.out.println(car1);

        System.out.println("\nАвтомобиль 2 создан:");
        System.out.println(car2);

        System.out.println("\nАвтобус создан:");
        System.out.println(bus);

        // Изменяем характеристики
        car1.setColor("Зеленый");
        Engine newEngine = new Engine("SN-111222", 180.0, 2.5, 9.0, "бензин", 4);
        car1.setEngine(newEngine);
        car1.setRegistrationNumber("М456ОР123RUS");

        System.out.println("\nАвтомобиль 1 после изменений:");
        System.out.println(car1);

        // Пытаемся задать неверный номер
        try {
            car2.setRegistrationNumber("XYZ12345");
            System.out.println("\nНовый номер установлен");
        } catch (IllegalArgumentException e) {
            System.out.println("\nОшибка при установке номера: " + e.getMessage());
        }
    }
}