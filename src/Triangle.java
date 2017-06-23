public class Triangle extends Figure implements Print {

    private double firstSideLength, secondSideLength, thirdSideLength;

    Triangle(double firstSideLength, double secondSideLength, double thirdSideLength) {
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.thirdSideLength = thirdSideLength;
        if (this.firstSideLength < 0 || this.secondSideLength < 0 || this.thirdSideLength < 0)
            throw new IllegalArgumentException("cannot be < 0");
        if ( ( ( this.firstSideLength + this.secondSideLength + this.thirdSideLength ) -
               ( Math.abs(this.firstSideLength + this.secondSideLength - this.thirdSideLength) +
                 Math.abs(this.secondSideLength + this.thirdSideLength - this.firstSideLength) +
                 Math.abs(this.firstSideLength + this.thirdSideLength - this.secondSideLength) ) ) <= 0 )
            throw new IllegalArgumentException("not a triangle!");
    }

    public void print() {
        System.out.println("first side length = " + firstSideLength +
                           "\nsecond side length = " + secondSideLength +
                           "\nthird side length = " + thirdSideLength +
                           "\narea = " + calculateArea() +
                           "\nperimeter = " + calculatePerimeter());
    }

    double calculateArea() {
        double semiperimeter = (firstSideLength + secondSideLength + thirdSideLength) / 2;
        double result = Math.sqrt(semiperimeter * (semiperimeter - firstSideLength) * (semiperimeter - secondSideLength) * (semiperimeter - thirdSideLength));
        return result;
    }

    double calculatePerimeter() {
        return firstSideLength + secondSideLength + thirdSideLength;
    }

}