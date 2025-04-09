package lab4.caranti;

public abstract class Car {
    private String registrationNumber;
    private final String brand;
    private String color;
    private final Engine engine;
    private final int wheelCount;

    // Защищенный конструктор - только для наследников
    protected Car(String brand, String color, Engine engine, int wheelCount) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.wheelCount = wheelCount;
    }

    protected Car(String brand, String color, Engine engine,
                  int wheelCount, String registrationNumber) {
        this(brand, color, engine, wheelCount);
        setRegistrationNumber(registrationNumber);
    }

    // Финальные методы, которые нельзя переопределять
    public final String getRegistrationNumber() {
        return registrationNumber;
    }

    public final String getBrand() {
        return brand;
    }

    public final Engine getEngine() {
        return engine;
    }

    public final int getWheelCount() {
        return wheelCount;
    }

    // Методы, которые можно переопределять
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract boolean isValidLicensePlate(String plate);

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !isValidLicensePlate(registrationNumber)) {
            throw new IllegalArgumentException("Неверный формат регистрационного знака");
        }
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "registrationNumber='" + (registrationNumber != null ? registrationNumber : "отсутствует") + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", wheelCount=" + wheelCount;
    }
}