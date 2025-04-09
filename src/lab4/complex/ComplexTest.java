package lab4.complex;

public class ComplexTest {
    public static void main(String[] args) {
        // Создание комплексных чисел
        Complex z1 = new Complex(3, 4);  // 3 + 4i
        Complex z2 = new Complex(1, -2); // 1 - 2i
        Complex realNum = new Complex(5); // 5 + 0i

        System.out.println("z1 = " + z1.toAlgebraicForm());
        System.out.println("z2 = " + z2.toAlgebraicForm());
        System.out.println("realNum = " + realNum.toAlgebraicForm());

        // Операции
        System.out.println("\nСумма z1 + z2: " + z1.add(z2));
        System.out.println("Разность z1 - z2: " + z1.subtract(z2));
        System.out.println("Произведение z1 * z2: " + z1.multiply(z2));
        System.out.println("Частное z1 / z2: " + z1.divide(z2));
        System.out.println("Сопряженное для z1: " + z1.conjugate());

        // Операции с действительным числом
        System.out.println("\nz1 + 5: " + z1.add(5));
        System.out.println("z1 * 2: " + z1.multiply(2));
        System.out.println("z1 / 2: " + z1.divide(2));

        // Представления числа
        System.out.println("\nТригонометрическая форма z1: " + z1.toTrigonometricForm());
        System.out.println("Модуль z1: " + z1.magnitude());
        System.out.println("Аргумент z1: " + z1.argument() + " радиан");

        // Проверка равенства
        Complex z3 = new Complex(3, 4);
        System.out.println("\nz1 equals z3: " + z1.equals(z3));
        System.out.println("z1 equals z2: " + z1.equals(z2));
    }
}