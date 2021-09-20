package Tugas1.Searching;

import java.util.*;
public class SequentialSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dimasukkan : ");
        int jumlahAngka = input.nextInt();
        int[] data = new int[jumlahAngka];

        System.out.println("Masukkan angka ke dalam array");

        // mengisi data ke array
        for( int i = 0; i < data.length; i++ ){
            data[i] = input.nextInt();
        }

        System.out.print("Masukkan angka yang ingin di cari: ");
        int cari = input.nextInt();

        int hasil = sequent(data, cari);
        if (hasil == -1)
            System.out.println("Angka " + cari + " tidak terdapat pada array");
        else
            System.out.println("Angka " + cari + " terdapat pada array index ke " + hasil);
    }

    public static int sequent(int[] data, int cari) {
        for (int i = 0; i < data.length; i++) {
            if (cari == data[i])
                return i;
        }
        return -1;
    }

}
