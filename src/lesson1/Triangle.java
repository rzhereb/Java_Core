package lesson1;

public class Triangle extends PerimeterAndSquareCalculation {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int perimeter() {
        return a + b + c;
    }

    @Override
    public int square() {
        return a * b * (a / b);
    }

    @Override
    public void paint() {
        System.out.println("I'm red triangle");
    }
}
