package task_3;

public class Triangle {

    private String name;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Double calculateSquare() {
        double halfPerimeter = calculateHalfPerimeter();
        double square = Math.sqrt((halfPerimeter *
                (halfPerimeter - side1) *
                (halfPerimeter - side2) *
                (halfPerimeter - side3)));
        return square;

    }

    private double calculateHalfPerimeter() {
        return (side1 + side2 + side3) / 2;
    }

    @Override
    public String toString() {
        String format = String.format("%.2f", calculateSquare());
        return "[Triangle " +
                name + "]: " +
                format + " cm";
    }
}
