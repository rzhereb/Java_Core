package lesson1;

public interface FigurePainting {

    int CONSTA = 10;

    void paint();

    default void defMethod() {
        System.out.println("Def method");
    }
    default void defMethod1() {

    }
}
