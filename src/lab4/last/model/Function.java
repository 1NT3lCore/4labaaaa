package lab4.last.model;

import java.awt.Color;
import java.util.List;

public abstract class Function {
    protected String name;
    protected Color color;
    protected List<Point> points;

    public Function(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public abstract void calculatePoints(double xMin, double xMax, int pointsCount);

    public String getName() { return name; }
    public Color getColor() { return color; }
    public List<Point> getPoints() { return points; }

    public String getColorName() {
        if (color.equals(Color.RED)) return "RED";
        if (color.equals(Color.BLUE)) return "BLUE";
        if (color.equals(Color.GREEN)) return "GREEN";
        return "CUSTOM";
    }
}