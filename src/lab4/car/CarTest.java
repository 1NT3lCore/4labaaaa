package lab4.car;

public class CarTest {
    public static void main(String[] args) {
        // Создаем автомобиль без регистрационного номера
        Car car1 = new Car("Toyota", VehicleType.PASSENGER, "Красный", 150.5, 4);
        System.out.println("Автомобиль 1 создан:");
        System.out.println(car1);

        // Создаем автомобиль с регистрационным номером
        Car car2 = new Car("Kamaz", VehicleType.TRUCK, "Синий", 400.0, 6, "А123ВС77RUS");
        System.out.println("\nАвтомобиль 2 создан:");
        System.out.println(car2);

        // Пытаемся задать неверный номер
        try {
            car2.setRegistrationNumber("XYZ12345");
            System.out.println("\nНовый номер установлен");
        } catch (IllegalArgumentException e) {
            System.out.println("\nОшибка при установке номера: " + e.getMessage());
        }

        // Изменяем другие характеристики
        car1.setColor("Зеленый");
        car1.setEnginePower(160.0);
        car1.setRegistrationNumber("М456ОР123RUS");

        System.out.println("\nАвтомобиль 1 после изменений:");
        System.out.println(car1);

        // Создаем автобус
        Car bus = new Car("PAZ", VehicleType.BUS, "Желтый", 200.0, 6);
        System.out.println("\nАвтобус создан:");
        System.out.println(bus);
    }
}