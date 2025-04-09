package lab4.carcarcar;

public abstract class Car {
    protected String registrationNumber;
    protected final String brand;
    protected String color;
    protected final Engine engine;
    protected final int wheelCount;

    public Car(String brand, String color, Engine engine, int wheelCount) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.wheelCount = wheelCount;
    }

    public Car(String brand, String color, Engine engine,
               int wheelCount, String registrationNumber) {
        this(brand, color, engine, wheelCount);
        setRegistrationNumber(registrationNumber);
    }

    // Геттеры и сеттеры
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public abstract boolean isValidLicensePlate(String plate);

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !isValidLicensePlate(registrationNumber)) {
            throw new IllegalArgumentException("Неверный формат регистрационного знака");
        }
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "registrationNumber='" + (registrationNumber != null ? registrationNumber : "отсутствует") + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", wheelCount=" + wheelCount +
                '}';
    }
}