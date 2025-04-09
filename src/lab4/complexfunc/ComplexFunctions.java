package lab4.complexfunc;

import lab4.complex.Complex;

public final class ComplexFunctions {
    private ComplexFunctions() {} // Запрет создания экземпляров

    // Экспонента комплексного числа
    public static Complex exp(Complex z) {
        double expX = Math.exp(z.getReal());
        return new Complex(
                expX * Math.cos(z.getImaginary()),
                expX * Math.sin(z.getImaginary())
        );
    }

    // Синус комплексного числа
    public static Complex sin(Complex z) {
        Complex iz = z.multiply(new Complex(0, 1)); // i*z
        Complex eiz = exp(iz);
        Complex eMinusIz = exp(iz.multiply(-1));
        return eiz.subtract(eMinusIz).divide(new Complex(0, 2)); // (e^(iz) - e^(-iz))/(2i)
    }

    // Косинус комплексного числа
    public static Complex cos(Complex z) {
        Complex iz = z.multiply(new Complex(0, 1)); // i*z
        Complex eiz = exp(iz);
        Complex eMinusIz = exp(iz.multiply(-1));
        return eiz.add(eMinusIz).divide(2); // (e^(iz) + e^(-iz))/2
    }

    // Тангенс комплексного числа
    public static Complex tan(Complex z) {
        Complex sinZ = sin(z);
        Complex cosZ = cos(z);
        return sinZ.divide(cosZ);
    }

    // Котангенс комплексного числа
    public static Complex cot(Complex z) {
        Complex sinZ = sin(z);
        Complex cosZ = cos(z);
        return cosZ.divide(sinZ);
    }

    // Гиперболический синус
    public static Complex sinh(Complex z) {
        Complex ez = exp(z);
        Complex eMinusZ = exp(z.multiply(-1));
        return ez.subtract(eMinusZ).divide(2); // (e^z - e^(-z))/2
    }

    // Гиперболический косинус
    public static Complex cosh(Complex z) {
        Complex ez = exp(z);
        Complex eMinusZ = exp(z.multiply(-1));
        return ez.add(eMinusZ).divide(2); // (e^z + e^(-z))/2
    }

    // Гиперболический тангенс
    public static Complex tanh(Complex z) {
        Complex sinhZ = sinh(z);
        Complex coshZ = cosh(z);
        return sinhZ.divide(coshZ);
    }

    // Гиперболический котангенс
    public static Complex coth(Complex z) {
        Complex sinhZ = sinh(z);
        Complex coshZ = cosh(z);
        return coshZ.divide(sinhZ);
    }

    // Формула Эйлера для действительного числа
    public static Complex eulerFormula(double x) {
        return new Complex(Math.cos(x), Math.sin(x));
    }
}