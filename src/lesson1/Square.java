package lesson1;

public class Square extends PerimeterAndSquareCalculation  {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int perimeter() {
        return a * 4;
    }

    @Override
    public int square() {
        return a * a;
    }

    @Override
    public void paint() {
        System.out.println("I'm red square");
    }

    @Override
    public void defMethod() {
        System.out.println("DefMethod from square");
    }
}
