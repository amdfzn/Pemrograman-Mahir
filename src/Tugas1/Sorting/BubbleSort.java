package Tugas1.Sorting;

import java.util.*;
public class BubbleSort {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dimasukkan : ");
        int jumlahAngka = input.nextInt();
        int[] data = new int[jumlahAngka];

        System.out.println("Masukkan angka ke dalam array");

        // mengisi data ke array
        for( int i = 0; i < data.length; i++ ){
            data[i] = input.nextInt();
        }

        System.out.println("Bilangan yang belum terurut: ");
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] +" ");
        }

        //Proses Bubble Sort
        for(int i = 0; i< (data.length-1); i++) {
            for(int j = 0; j< data.length-i-1; j++) {
                if (data[j] > data[j+1]) {
                    int swap = data[j];
                    data[j] = data[j+1];
                    data[j+1]= swap;
                }
            }
        }
        System.out.println("\nBilangan yang sudah terurut: ");
        for(int i = 0; i< data.length; i++)
            System.out.print(data[i] +" ");
    }
}
