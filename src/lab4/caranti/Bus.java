package lab4.caranti;

import java.util.regex.Pattern;

public final class Bus extends Car {
    private static final Pattern LICENSE_PLATE_PATTERN =
            Pattern.compile("^[АВЕКМНОРСТУХ]\\d{3}(?<!000)[АВЕКМНОРСТУХ]{2}\\d{2,3}RUS$");

    public Bus(String brand, String color, Engine engine, int wheelCount) {
        super(brand, color, engine, wheelCount);
    }

    public Bus(String brand, String color, Engine engine,
               int wheelCount, String registrationNumber) {
        super(brand, color, engine, wheelCount, registrationNumber);
    }

    @Override
    public boolean isValidLicensePlate(String plate) {
        return LICENSE_PLATE_PATTERN.matcher(plate).matches();
    }
}