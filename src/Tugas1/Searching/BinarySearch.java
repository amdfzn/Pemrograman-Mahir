package Tugas1.Searching;

import java.util.*;
public class BinarySearch {

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

        // mencari angka dengan binary search
        int hasil = binary(data, cari, 0, data.length - 1);
        if (hasil == -1)
            System.out.println("Angka " + cari + " tidak terdapat pada array");
        else
            System.out.println("Angka " + cari + " terdapat pada array index ke " + hasil);
    }

    public static int binary(int[] data, int cari, int awal, int akhir) {
        while (awal <= akhir) {
            int tengah = awal + ((akhir - awal) / 2);
                // Angka yang di cari berada di tengah index
            if (data[tengah] == cari)
                return tengah;
                // Angka yang dicari lebih kecil daripada angka yang di tengah,
                // maka angka yang dicari pasti ada di sebelah kiri
            else if (data[tengah] > cari)
                akhir = tengah - 1;
                // Angka yang dicari lebih besar daripada angka yang di tengah,
                // maka angka yang dicari pasti ada di sebelah kanan
            else
                awal = tengah + 1;
        }
        // Angka yang dicari tidak ada dalam array
        return -1;
    }

}