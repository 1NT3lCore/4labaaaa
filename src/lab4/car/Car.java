package lab4.car;

import java.util.regex.Pattern;

public class Car {
    private String registrationNumber; // может быть null
    private final String brand;
    private final VehicleType type;
    private String color;
    private double enginePower;
    private final int wheelCount;

    // Паттерн для проверки регистрационного знака согласно ГОСТ Р 50577-2018
    private static final Pattern LICENSE_PLATE_PATTERN =
            Pattern.compile("^[АВЕКМНОРСТУХ]\\d{3}(?<!000)[АВЕКМНОРСТУХ]{2}\\d{2,3}RUS$");

    public Car(String brand, VehicleType type, String color, double enginePower, int wheelCount) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.enginePower = enginePower;
        this.wheelCount = wheelCount;
    }

    public Car(String brand, VehicleType type, String color, double enginePower,
               int wheelCount, String registrationNumber) {
        this(brand, type, color, enginePower, wheelCount);
        setRegistrationNumber(registrationNumber);
    }

    // Геттеры
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public VehicleType getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    // Сеттеры для изменяемых полей
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !isValidLicensePlate(registrationNumber)) {
            throw new IllegalArgumentException("Неверный формат регистрационного знака");
        }
        this.registrationNumber = registrationNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    // Проверка валидности регистрационного знака
    private boolean isValidLicensePlate(String plate) {
        return LICENSE_PLATE_PATTERN.matcher(plate).matches();
    }

    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber='" + (registrationNumber != null ? registrationNumber : "отсутствует") + '\'' +
                ", brand='" + brand + '\'' +
                ", type=" + type +
                ", color='" + color + '\'' +
                ", enginePower=" + enginePower +
                ", wheelCount=" + wheelCount +
                '}';
    }
}