public class Circle extends Figure implements Print {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
        if (this.radius < 0)
            throw new IllegalArgumentException("cannot be < 0");
    }

    public void print() {
        System.out.println("radius = " + radius +
                           "\narea = " + calculateArea() +
                           "\nperimeter = " + calculatePerimeter());
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}