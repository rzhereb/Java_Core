package consultation1;

public class A {

    private int aField;

    public A(int aField) {
        this.aField = aField;
    }

    public int getaField() {
        return aField;
    }

    public void setaField(int aField) {
        this.aField = aField;
    }

    public void aMethod() {
        System.out.println("method from A");
    }

    @Override
    public String toString() {
        return "A{" +
                "aField=" + aField +
                '}';
    }
}
