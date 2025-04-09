package lab4.complex;

public class Complex {
    private final double real; // действительная часть
    private final double imaginary; // мнимая часть

    // Конструктор для создания комплексного числа
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Конструктор для действительного числа (мнимая часть = 0)
    public Complex(double real) {
        this(real, 0.0);
    }

    // Геттеры
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Сложение комплексных чисел
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Сложение с действительным числом
    public Complex add(double real) {
        return new Complex(this.real + real, this.imaginary);
    }

    // Вычитание комплексных чисел
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Вычитание действительного числа
    public Complex subtract(double real) {
        return new Complex(this.real - real, this.imaginary);
    }

    // Умножение комплексных чисел
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    // Умножение на действительное число
    public Complex multiply(double scalar) {
        return new Complex(this.real * scalar, this.imaginary * scalar);
    }

    // Деление комплексных чисел
    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(newReal, newImaginary);
    }

    // Деление на действительное число
    public Complex divide(double scalar) {
        if (scalar == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return new Complex(this.real / scalar, this.imaginary / scalar);
    }

    // Комплексное сопряжение
    public Complex conjugate() {
        return new Complex(this.real, -this.imaginary);
    }

    // Модуль комплексного числа
    public double magnitude() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Аргумент комплексного числа (в радианах)
    public double argument() {
        return Math.atan2(imaginary, real);
    }

    // Проверка на равенство
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Complex other = (Complex) obj;
        return Double.compare(other.real, real) == 0 &&
                Double.compare(other.imaginary, imaginary) == 0;
    }

    // Представление в алгебраической форме
    public String toAlgebraicForm() {
        if (imaginary == 0) return String.format("%.2f", real);
        if (real == 0) return String.format("%.2fi", imaginary);
        return String.format("%.2f %s %.2fi",
                real,
                imaginary > 0 ? "+" : "-",
                Math.abs(imaginary));
    }

    // Представление в тригонометрической форме
    public String toTrigonometricForm() {
        double r = magnitude();
        double phi = argument();
        return String.format("%.2f*(cos(%.2f) + i*sin(%.2f))", r, phi, phi);
    }

    @Override
    public String toString() {
        return toAlgebraicForm();
    }
}