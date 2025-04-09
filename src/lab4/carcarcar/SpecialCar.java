package lab4.carcarcar;

import java.util.regex.Pattern;

public class SpecialCar extends Car {
    // Формат для специальных автомобилей:
    // Буква + 3 цифры + 2-3 цифры + RUS (пример: А123БВ45RUS)
    // Или специальный формат: 2 буквы + 3 цифры + RUS (пример: АБ12345RUS)
    private static final Pattern LICENSE_PLATE_PATTERN =
            Pattern.compile("^([АВЕКМНОРСТУХ]\\d{3}[АВЕКМНОРСТУХ]{2}\\d{2,3}RUS|" +
                    "[АВЕКМНОРСТУХ]{2}\\d{3,5}RUS)$");

    private final String specialType;

    public SpecialCar(String brand, String color, Engine engine,
                      int wheelCount, String specialType) {
        super(brand, color, engine, wheelCount);
        this.specialType = specialType;
    }

    public SpecialCar(String brand, String color, Engine engine,
                      int wheelCount, String specialType, String registrationNumber) {
        super(brand, color, engine, wheelCount, registrationNumber);
        this.specialType = specialType;
    }

    @Override
    public boolean isValidLicensePlate(String plate) {
        return LICENSE_PLATE_PATTERN.matcher(plate).matches();
    }

    public String getSpecialType() {
        return specialType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", specialType='" + specialType + "'}";
    }
}