package lab4.carengine;

import java.util.regex.Pattern;

public class Car {
    private String registrationNumber;
    private final String brand;
    private final VehicleType type;
    private String color;
    private Engine engine; // Заменили power на engine
    private final int wheelCount;

    private static final Pattern LICENSE_PLATE_PATTERN =
            Pattern.compile("^[АВЕКМНОРСТУХ]\\d{3}(?<!000)[АВЕКМНОРСТУХ]{2}\\d{2,3}RUS$");

    public Car(String brand, VehicleType type, String color, Engine engine, int wheelCount) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.engine = engine;
        this.wheelCount = wheelCount;
    }

    public Car(String brand, VehicleType type, String color, Engine engine,
               int wheelCount, String registrationNumber) {
        this(brand, type, color, engine, wheelCount);
        setRegistrationNumber(registrationNumber);
    }

    // Геттеры и сеттеры
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

    public Engine getEngine() {
        return engine;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !isValidLicensePlate(registrationNumber)) {
            throw new IllegalArgumentException("Неверный формат регистрационного знака");
        }
        this.registrationNumber = registrationNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

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
                ", engine=" + engine +
                ", wheelCount=" + wheelCount +
                '}';
    }
}