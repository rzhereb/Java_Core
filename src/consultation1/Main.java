package consultation1;

public class Main {

    public static void main(String[] args) {
//        String s = "Привіт";
//        String a = "a";
//        String b = "A";
//        System.out.println(a.compareTo(b));

//        byte[] bytes = s.getBytes();
//        for (byte aByte : bytes) {
//            System.out.println(aByte);
//        }

        A aa = new A(4);
        B bb = new B(4);
        A ab = new B(5);

        aa.aMethod();
        bb.aMethod();
        ab.aMethod();

        System.out.println(ab);

    }
}
