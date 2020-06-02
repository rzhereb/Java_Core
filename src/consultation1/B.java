package consultation1;

public class B extends A {

    public B(int aField) {
        super(aField);
    }

    public void bMethod() {
        System.out.println("method from B");
    }

    @Override
    public void aMethod() {
        System.out.println("method from A, but in B style");
    }

    @Override
    public String toString() {
        return "Class B";
    }
}
