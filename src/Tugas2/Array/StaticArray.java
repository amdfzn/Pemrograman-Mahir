package Tugas2.Array;
import java.util.Scanner;
public class StaticArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int i = 0;
        System.out.println("Masukkan 5 angka : ");
        while (i < 5) {
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Angka yang anda masukkan : ");
        for (i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
