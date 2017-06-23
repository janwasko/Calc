import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        String str;

        do {
            System.out.println("triangle / square / circle ?");
            String choice = scanner.nextLine();
            switch (choice) {
                case "triangle":
                    double a, b, c;
                    System.out.println("write first side length:");
                    a = scan.nextDouble();
                    System.out.println("write second side length:");
                    b = scan.nextDouble();
                    System.out.println("write third side length:");
                    c = scan.nextDouble();
                    Triangle triangle = new Triangle(a, b, c);
                    triangle.print();
                    break;
                case "square":
                    double s;
                    System.out.println("write side length:");
                    s = scan.nextDouble();
                    Square square = new Square(s);
                    square.print();
                    break;
                case "circle":
                    double r;
                    System.out.println("write radius:");
                    r = scan.nextDouble();
                    Circle circle = new Circle(r);
                    circle.print();
                    break;
                default:
                    System.out.println("error");
            }
            System.out.println("do you want to continue? (y/n)");
            str = scanner.nextLine();
        } while (str.equals("y"));
    }
}