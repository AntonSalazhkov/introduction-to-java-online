package by.training.java.module_4.programming_with_classes.task07;

public class Coordinate {

    private double x;
    private double y;

    public Coordinate() {
        this.x = 0;
        this.y = 0;
    }

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double getSide(Coordinate coordinateOne, Coordinate coordinateTwo) {
        double sideX = coordinateOne.x - coordinateTwo.x;
        double sideY = coordinateOne.y - coordinateTwo.y;
        return Math.sqrt(sideX * sideX + sideY * sideY);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double number) {
        x = number;
    }

    public void setY(double number) {
        y = number;
    }
}
