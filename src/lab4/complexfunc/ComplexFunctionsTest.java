package lab4.complexfunc;

import lab4.complex.Complex;

public class ComplexFunctionsTest {
    public static void main(String[] args) {
        Complex z = new Complex(1, 1); // 1 + i

        System.out.println("z = " + z);
        System.out.println("exp(z) = " + ComplexFunctions.exp(z));
        System.out.println("sin(z) = " + ComplexFunctions.sin(z));
        System.out.println("cos(z) = " + ComplexFunctions.cos(z));
        System.out.println("tan(z) = " + ComplexFunctions.tan(z));
        System.out.println("cot(z) = " + ComplexFunctions.cot(z));
        System.out.println("sinh(z) = " + ComplexFunctions.sinh(z));
        System.out.println("cosh(z) = " + ComplexFunctions.cosh(z));
        System.out.println("tanh(z) = " + ComplexFunctions.tanh(z));
        System.out.println("coth(z) = " + ComplexFunctions.coth(z));

        double x = Math.PI / 4;
        System.out.println("\nФормула Эйлера для x=" + x + ": " + ComplexFunctions.eulerFormula(x));
    }
}