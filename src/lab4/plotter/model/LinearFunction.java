package lab4.plotter.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class LinearFunction extends Function {
    public LinearFunction(String name, Color color) {
        super(name, color);
    }

    @Override
    public void calculatePoints(double xMin, double xMax, int pointsCount) {
        points = new ArrayList<>();
        double step = (xMax - xMin) / (pointsCount - 1);

        for (int i = 0; i < pointsCount; i++) {
            double x = xMin + i * step;
            points.add(new Point(x, x));
        }
    }
}