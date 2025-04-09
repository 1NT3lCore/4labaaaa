package lab4.caranti;

public class CarTest {
    public static void main(String[] args) {
        // Создание объектов
        Car passenger = new PassengerCar("Toyota", "Red",
                new Engine("SN1", 150, 2.0, 8.5, "Petrol", 4), 4, "А123ВС77RUS");

        Car bus = new Bus("Mercedes", "Yellow",
                new Engine("SN2", 250, 5.0, 12.0, "Diesel", 6), 6);

        // Попытка создать экземпляр Car - ошибка компиляции
        // Car car = new Car("BMW", "Blue", engine, 4); // Нельзя!

        // Вызов методов
        System.out.println(passenger);
        System.out.println(bus);

        // Проверка финальных методов
        System.out.println("Марка автобуса: " + bus.getBrand());
        System.out.println("Кол-во колес: " + bus.getWheelCount());
    }
}