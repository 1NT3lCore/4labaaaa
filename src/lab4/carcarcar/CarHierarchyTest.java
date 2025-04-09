package lab4.carcarcar;

public class CarHierarchyTest {
    public static void main(String[] args) {
        // Создаем двигатели
        Engine carEngine = new Engine("SN-123456", 150.0, 2.0, 8.5, "бензин", 4);
        Engine truckEngine = new Engine("SN-654321", 400.0, 5.9, 15.0, "дизель", 6);
        Engine busEngine = new Engine("SN-987654", 250.0, 4.5, 12.0, "дизель", 6);
        Engine specialEngine = new Engine("SN-111222", 300.0, 3.5, 14.0, "дизель", 8);

        // Создаем автомобили разных типов
        Car passenger = new PassengerCar("Toyota", "Красный", carEngine, 4, "А123ВС77RUS");
        Car truck = new Truck("Kamaz", "Синий", truckEngine, 6, "М456ОР123RUS");
        Car bus = new Bus("PAZ", "Желтый", busEngine, 6);
        Car fireTruck = new SpecialCar("URAL", "Красный", specialEngine, 6, "пожарный", "АА12345RUS");

        System.out.println("Легковой автомобиль:");
        System.out.println(passenger);

        System.out.println("\nГрузовик:");
        System.out.println(truck);

        System.out.println("\nАвтобус:");
        System.out.println(bus);

        System.out.println("\nСпециальный транспорт:");
        System.out.println(fireTruck);

        // Проверка номеров
        testLicensePlate(passenger, "XYZ12345"); // Неверный формат
        testLicensePlate(fireTruck, "АБ12345RUS"); // Верный специальный номер
        testLicensePlate(fireTruck, "А123ВС77RUS"); // Неверный для специального
    }

    private static void testLicensePlate(Car car, String plate) {
        try {
            car.setRegistrationNumber(plate);
            System.out.println("\nНомер " + plate + " принят для " + car.getClass().getSimpleName());
        } catch (IllegalArgumentException e) {
            System.out.println("\nОшибка: " + e.getMessage() +
                    " (номер: " + plate +
                    ", тип: " + car.getClass().getSimpleName() + ")");
        }
    }
}