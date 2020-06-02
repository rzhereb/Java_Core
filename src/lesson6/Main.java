package lesson6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        try {
//            int[] mas = new int[5];
//            System.out.println(mas[4]);
//            throw new NullPointerException();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIOOBE");
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("NPE");
//        } catch (Exception e) {
//
//        }
//        finally {
//            System.out.println("Finally");
//        }
//        System.out.println("Out of try-catch");

//        File file = new File("1.txt");
//        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
//            fileOutputStream.write("Hello world!".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            FileInputStream fileInputStream = new FileInputStream("1.txt");
//            int read;
//            byte[] buffer = new byte[1024];
//            while ((read = fileInputStream.read()) != -1) {
//                System.out.println((char) read);
//            }
//            System.out.println("----------------");
//            for (int i = 0; i < buffer.length; i++) {
//                if (buffer[i] != 0) {
//                    System.out.println((char)buffer[i]);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        PrintWriter printWriter = new PrintWriter(new FileWriter("1.txt"));
//        printWriter.println("SDDSFSDFSDFSDFSDFWEFWEGVEWFSDFSDF");
//        printWriter.println("sdfds434343gsdvxcf");
//        printWriter.println("AAAAfds34terfgvsdtwefwsef");
//        printWriter.close();

//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("1.txt"));
//            String s;
//            while ((s = bufferedReader.readLine()) != null) {
//                System.out.println(s + "; " + s.length());
//            }
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("world").append("!").append(" and ").append("underworld!");
        System.out.println(stringBuilder.toString());

//        String s1 = new String("Hello");
//        String s2 = new String("Hello");
//        System.out.println(s1 == s2);
    }
}
