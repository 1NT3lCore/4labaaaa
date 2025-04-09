package lab4.last;

import lab4.last.model.*;
import lab4.last.view.UMLTextFrame;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Создаем модель данных
        GraphPlot plot = new GraphPlot();
        plot.setTitle("Function Plotter Example");

        // Добавляем функции
        plot.addFunction(new LinearFunction("y = x", Color.RED));
        plot.addFunction(new QuadraticFunction("y = x^2", Color.BLUE));
        plot.addFunction(new ExponentialFunction("y = 2^x", Color.GREEN));

        // Создаем и показываем окно с UML-диаграммой
        UMLTextFrame frame = new UMLTextFrame(plot);
        frame.setVisible(true);
    }
}