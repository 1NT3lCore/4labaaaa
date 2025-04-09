package lab4.last.model;

import java.util.ArrayList;
import java.util.List;

public class GraphPlot {
    private String title;
    private final List<Function> functions = new ArrayList<>();

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }

    public void addFunction(Function function) {
        functions.add(function);
        function.calculatePoints(-2, 2, 5); // Примерный расчет точек
    }

    public List<Function> getFunctions() {
        return new ArrayList<>(functions);
    }
}