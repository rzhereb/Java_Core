package lesson1;

public final class TestStatic {

    final int a = 10;
    static int staticA = 10;

    public static final int ITS_A_CONSTANT = 10;

    final int getA() {
        final int t;
        t = 10;
        staticMethod();
        System.out.println(staticA);
        return a;
    }

    static void staticMethod() {
        System.out.println("I'm static method");
        System.out.println(staticA);
    }
}
