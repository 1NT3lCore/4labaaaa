package lab4.plotter.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class GraphPlot {
    private String title;
    private double xMin, xMax, yMin, yMax;
    private final List<Function> functions = new ArrayList<>();

    public void setTitle(String title) { this.title = title; }
    public void setRange(double xMin, double xMax, double yMin, double yMax) {
        this.xMin = xMin;
        this.xMax = xMax;
        this.yMin = yMin;
        this.yMax = yMax;
    }
    public void addFunction(Function function) {
        functions.add(function);
        function.calculatePoints(xMin, xMax, 5);
    }
    public List<Function> getFunctions() { return new ArrayList<>(functions); }
}