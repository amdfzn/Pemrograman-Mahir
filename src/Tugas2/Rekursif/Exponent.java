package Tugas2.Rekursif;
import java.util.*;
public class Exponent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();
        System.out.println("Hasil: " + exponent(a, b));
    }

    private static int exponent(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return Integer.parseInt("" + a);
        } else if (b % 2 == 0) {
            return (exponent(a, b / 2) * exponent(a, b / 2));
        } else {
            return (a * exponent(a, b - 1));
        }
    }
}
