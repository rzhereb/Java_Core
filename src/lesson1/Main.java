package lesson1;

public class Main {

    public static void main(String[] args) {
//        lesson1.TestStatic testStatic = new lesson1.TestStatic();
//        lesson1.TestStatic testStatic1 = new lesson1.TestStatic();
//        lesson1.TestStatic.staticA = 5;
//        System.out.println(lesson1.TestStatic.staticA);

       PerimeterAndSquareCalculation[] figures = new PerimeterAndSquareCalculation[2];
       Square square1 = new Square(5);
       figures[0] = square1;
       Triangle triangle1 = new Triangle(10, 3, 4);
       figures[1] = triangle1;
        for (PerimeterAndSquareCalculation figure : figures) {
            System.out.println(figure.square());
            figure.paint();
            figure.defMethod();
        }
        System.out.println(figures);

    }



}