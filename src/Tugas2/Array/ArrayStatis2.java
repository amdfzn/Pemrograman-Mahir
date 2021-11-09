package Tugas2.Array;
import java.util.Scanner;
public class ArrayStatis2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan nilai ke- " + (i + 1) + " : ");
            array[i] = in.nextInt();
        }
        System.out.println("\nNilai yang lebih kecil adalah : " + array[min(array)]);
    }
    private static int min(int[] array) {
        int i = 0;
        int min = array[i];
        for (i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
