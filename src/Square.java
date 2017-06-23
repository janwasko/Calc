public class Square extends Figure implements Print {

    private double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
        if (this.sideLength < 0)
            throw new IllegalArgumentException("cannot be < 0");
    }

    public void print() {
        System.out.println("side length = " + sideLength +
                           "\narea = " + calculateArea() +
                           "\nperimeter = " + calculatePerimeter());
    }

    double calculateArea() {
        return sideLength * sideLength;
    }

    double calculatePerimeter() {
        return 4 * sideLength;
    }
}