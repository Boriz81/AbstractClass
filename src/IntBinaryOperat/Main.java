package IntBinaryOperat;

public class Main {
    public static void main(String[] args) {
        IntBinaryOperation add = new Addition(2, 3);
        System.out.println(add.perform());
        IntBinaryOperation mult = new Multiplication(4, 5);
        System.out.println(mult.perform());
       // System.out.println(new java.util.Scanner());
        IntBinaryOperation add2 = new Addition(new java.util.Scanner(System.in).nextInt(),new java.util.Scanner(System.in).nextInt());
        System.out.println(add2);
    }
}
