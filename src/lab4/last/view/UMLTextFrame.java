package lab4.last.view;

import lab4.last.model.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UMLTextFrame extends Frame {
    private TextArea textArea;
    private GraphPlot plot;

    public UMLTextFrame(GraphPlot plot) {
        super("UML Class Diagram Viewer");
        this.plot = plot;
        setupUI();
        displayUMLDiagram();
    }

    private void setupUI() {
        setSize(1000, 800);
        setLayout(new BorderLayout());

        textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        add(textArea, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    private void displayUMLDiagram() {
        StringBuilder sb = new StringBuilder();

        // Отображаем статическую UML диаграмму
        sb.append("=== UML CLASS DIAGRAM ===\n\n");
        sb.append("┌──────────────────────┐       ┌─────────────────┐       ┌──────────────────┐\n");
        sb.append("│      GraphPlot       │<>---->│    Function     │<>---->│      Point       │\n");
        sb.append("├──────────────────────┤       ├─────────────────┤       ├──────────────────┤\n");
        sb.append("│ -title: String       │       │ -name: String   │       │ -x: double       │\n");
        sb.append("│ -xMin, xMax: double  │       │ -color: Color   │       │ -y: double       │\n");
        sb.append("│ -yMin, yMax: double  │       │ -points: List   │       └──────────────────┘\n");
        sb.append("│ -functions: List     │       │   <Point>       │                 ^\n");
        sb.append("├──────────────────────┤       ├─────────────────┤                 |\n");
        sb.append("│ +setTitle(String)    │       │ +calculatePoints│         ┌─────────────────┐\n");
        sb.append("│ +setRange(...)       │       │ +getName():     │         │    FunctionType  │\n");
        sb.append("│ +addFunction(Func)   │       │   String        │         ├─────────────────┤\n");
        sb.append("└──────────────────────┘       └─────────────────┘         │ LINEAR          │\n");
        sb.append("             ^                         ^                   │ QUADRATIC       │\n");
        sb.append("             |                         |                   │ EXPONENTIAL     │\n");
        sb.append("┌──────────────────────┐    ┌──────────────────────┐       └─────────────────┘\n");
        sb.append("│        Main          │    │  MathFunction        │                 ^\n");
        sb.append("├──────────────────────┤    ├──────────────────────┤                 |\n");
        sb.append("│ +main(String[]):void │    │ -functionType:       │    ┌──────────────────────┐\n");
        sb.append("└──────────────────────┘    │   FunctionType       │    │      UMLDiagram      │\n");
        sb.append("                            └──────────────────────┘    ├──────────────────────┤\n");
        sb.append("                                    ^                   │ +printUMLDiagram():  │\n");
        sb.append("                    ┌──────────────┴───────┐            │   void               │\n");
        sb.append("        ┌──────────────────────┐  ┌──────────────────────┐└──────────────────────┘\n");
        sb.append("        │  LinearFunction      │  │  QuadraticFunction   │\n");
        sb.append("        ├──────────────────────┤  ├──────────────────────┤\n");
        sb.append("        │ +evaluate(x): x      │  │ +evaluate(x): x²     │\n");
        sb.append("        └──────────────────────┘  └──────────────────────┘\n");
        sb.append("                    ▲                           ▲\n");
        sb.append("                    └──────────────┬────────────┘\n");
        sb.append("                                   ▼\n");
        sb.append("                        ┌──────────────────────┐\n");
        sb.append("                        │  ExponentialFunction │\n");
        sb.append("                        ├──────────────────────┤\n");
        sb.append("                        │ +evaluate(x): 2^x    │\n");
        sb.append("                        └──────────────────────┘\n\n");

        // Добавляем информацию о текущих функциях, если plot не null
        if (plot != null && plot.getFunctions() != null) {
            sb.append("=== CURRENT FUNCTIONS ===\n");
            for (Function func : plot.getFunctions()) {
                sb.append("• ").append(func.getClass().getSimpleName())
                        .append(" '").append(func.getName()).append("'")
                        .append(" (color: ").append(func.getColorName())
                        .append(", points: ").append(func.getPoints().size()).append(")\n");
            }
        } else {
            sb.append("=== NO FUNCTIONS LOADED ===\n");
        }

        textArea.setText(sb.toString());
    }
}