package lab4.plotter;

import lab4.plotter.model.*;
import lab4.plotter.view.UMLDiagramPrinter;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // 1. Выводим UML-диаграмму
        UMLDiagramPrinter.printUMLDiagram();

        System.out.println("\n=== DEMONSTRATION ===");

        // 2. Демонстрация работы классов
        GraphPlot plot = new GraphPlot();
        plot.setTitle("Function Demo");
        plot.setRange(-2, 2, -1, 5);

        Function linear = new LinearFunction("y = x", Color.RED);
        Function quadratic = new QuadraticFunction("y = x^2", Color.BLUE);
        Function exponential = new ExponentialFunction("y = 2^x", Color.GREEN);

        plot.addFunction(linear);
        plot.addFunction(quadratic);
        plot.addFunction(exponential);

        // Выводим информацию о функциях
        for (Function func : plot.getFunctions()) {
            System.out.println("\nFunction: " + func.getName());
            System.out.println("Color: " + func.getColorName());
            System.out.println("Points:");
            func.getPoints().forEach(p -> System.out.print(p + " "));
            System.out.println();
        }
    }
}