package by.training.java.module_4.programming_with_classes.task07;

public class Triangle {

    private double ab;
    private double bc;
    private double ac;
    private double perimeter;
    private double area;

    public Triangle(Coordinate a, Coordinate b, Coordinate c) {
        ab = Coordinate.side(a, b);
        bc = Coordinate.side(b, c);
        ac = Coordinate.side(a, c);
    }

    public double getArea() {
        double halfPerimeter = perimeter / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - ab) * (halfPerimeter - bc) * (halfPerimeter - ac));
        return area;
    }

    public double getPerimeter() {
        perimeter = ab + bc + ac;
        return perimeter;
    }

    public String medianCrossPoint(Coordinate a, Coordinate b, Coordinate c) {
        Coordinate coordinate4 = new Coordinate((a.getX() + b.getX() + c.getX()) / 3, (a.getY() + b.getY() + c.getY()) / 3);
        return "x: " + coordinate4.getX() + ", " + "y: " + coordinate4.getY();
    }
}
