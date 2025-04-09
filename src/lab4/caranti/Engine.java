package lab4.caranti;

public class Engine {
    private final String serialNumber; // серийный номер
    private final double power;       // мощность в л.с.
    private final double volume;      // рабочий объем в литрах
    private final double fuelConsumption; // расход топлива (л/100км)
    private final String fuelType;    // вид топлива
    private final int cylinders;      // количество цилиндров

    public Engine(String serialNumber, double power, double volume,
                  double fuelConsumption, String fuelType, int cylinders) {
        this.serialNumber = serialNumber;
        this.power = power;
        this.volume = volume;
        this.fuelConsumption = fuelConsumption;
        this.fuelType = fuelType;
        this.cylinders = cylinders;
    }

    // Геттеры
    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPower() {
        return power;
    }

    public double getVolume() {
        return volume;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "serialNumber='" + serialNumber + '\'' +
                ", power=" + power + " hp" +
                ", volume=" + volume + "L" +
                ", fuelConsumption=" + fuelConsumption + "L/100km" +
                ", fuelType='" + fuelType + '\'' +
                ", cylinders=" + cylinders +
                '}';
    }
}