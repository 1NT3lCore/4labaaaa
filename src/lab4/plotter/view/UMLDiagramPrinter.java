package lab4.plotter.view;

import lab4.plotter.model.*;

public class UMLDiagramPrinter {
    public static void printUMLDiagram() {
            System.out.println("=== UML DIAGRAM ===");
            System.out.println("┌──────────────────────┐       ┌─────────────────┐       ┌──────────────────┐");
            System.out.println("│      GraphPlot       │<>---->│    Function     │<>---->│      Point       │");
            System.out.println("├──────────────────────┤       ├─────────────────┤       ├──────────────────┤");
            System.out.println("│ -title: String       │       │ -name: String   │       │ -x: double       │");
            System.out.println("│ -xMin, xMax: double  │       │ -color: Color   │       │ -y: double       │");
            System.out.println("│ -yMin, yMax: double  │       │ -points: List   │       └──────────────────┘");
            System.out.println("│ -functions: List     │       │   <Point>       │                 ^");
            System.out.println("├──────────────────────┤       ├─────────────────┤                 |");
            System.out.println("│ +setTitle(String)    │       │ +calculatePoints│         ┌─────────────────┐");
            System.out.println("│ +setRange(...)       │       │ +getName():     │         │    FunctionType  │");
            System.out.println("│ +addFunction(Func)   │       │   String        │         ├─────────────────┤");
            System.out.println("└──────────────────────┘       └─────────────────┘         │ LINEAR          │");
            System.out.println("             ^                         ^                   │ QUADRATIC       │");
            System.out.println("             |                         |                   │ EXPONENTIAL     │");
            System.out.println("┌──────────────────────┐    ┌──────────────────────┐       └─────────────────┘");
            System.out.println("│        Main          │    │  MathFunction        │                 ^");
            System.out.println("├──────────────────────┤    ├──────────────────────┤                 |");
            System.out.println("│ +main(String[]):void │    │ -functionType:       │    ┌──────────────────────┐");
            System.out.println("└──────────────────────┘    │   FunctionType       │    │      UMLDiagram      │");
            System.out.println("                            └──────────────────────┘    ├──────────────────────┤");
            System.out.println("                                    ^                   │ +printUMLDiagram():  │");
            System.out.println("                    ┌──────────────┴───────┐            │   void               │");
            System.out.println("        ┌──────────────────────┐  ┌──────────────────────┐└──────────────────────┘");
            System.out.println("        │  LinearFunction      │  │  QuadraticFunction   │");
            System.out.println("        ├──────────────────────┤  ├──────────────────────┤");
            System.out.println("        │ +evaluate(x): x      │  │ +evaluate(x): x²     │");
            System.out.println("        └──────────────────────┘  └──────────────────────┘");
            System.out.println("                    ▲                           ▲");
            System.out.println("                    └──────────────┬────────────┘");
            System.out.println("                                   ▼");
            System.out.println("                        ┌──────────────────────┐");
            System.out.println("                        │  ExponentialFunction │");
            System.out.println("                        ├──────────────────────┤");
            System.out.println("                        │ +evaluate(x): 2^x    │");
        System.out.println("                        └──────────────────────┘");
    }
}