package UTS;
import java.util.*;
public class ArrayStatis {
    public static void main(String[] args) {
        //buat variabel scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah pasien : ");
        int jumlah = input.nextInt();
        //buat variabel array
        String[][] arr = new String[jumlah][5];

        System.out.println("Selamat Datang di Klink A");
        System.out.println("Silahkan Masukkan Data Diri Anda");
        //input data pasien
        for (int i = 0; i < arr.length; i++) {
            System.out.print("No Pasien: ");
            arr[i][0] = input.nextLine();
            System.out.print("Nama Pasien: ");
            arr[i][1] = input.nextLine();
            System.out.print("Jenis Kelamin: ");
            arr[i][2] = input.nextLine();
            System.out.print("Tanggal Lahir: ");
            arr[i][3] = input.nextLine();
            System.out.print("Prioritas: ");
            arr[i][4] = input.nextLine();
        }

            //pengurutan data pasien
            for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j][4].compareTo(arr[j + 1][4]) > 0) {
                    String[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    }
                }
            }

            //hasil pengurutan
            System.out.println("\nHasil Pengurutan Data Pasien");
            System.out.println("No Pasien\tNama Pasien\tJenis Kelamin\tTanggal Lahir\tPrioritas");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            /*
            System.out.println("Data Anda Berhasil Disimpan");
            System.out.println("Terima Kasih");
            System.out.println("Hasil Inputan");
            System.out.println("No Pasien: " + arr[0][0]);
            System.out.println("Nama Pasien: " + arr[0][1]);
            System.out.println("Jenis Kelamin: " + arr[0][2]);
            System.out.println("Tanggal Lahir: " + arr[0][3]);
            System.out.println("Prioritas: " + arr[0][4]);
            */
    }
}