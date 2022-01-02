package UAS;
import java.util.*;

public class UASQueue {
    //Menginisialisasi kan variabel yang akan di pakai
    String nama;
    UASQueue next;
    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    //Pembuatan method input
    public void input() {
        System.out.println("Selamat Datang");
        System.out.print("Masukkan Nama      : ");
        nama = str.nextLine();
        next = null;
    }
    //Pemanggilan variabel nama di dalam method input
    public void read() {
        System.out.println(nama);
    }
    //Pembuatan Queue berdasarkan method linked list
    static class linked {
        UASQueue head, tail;

        public linked() {
            head = null;
            tail = null;
        }
        //Mendefinisikan proses enque
        public void enque() {
            UASQueue baru = new UASQueue();
            baru.input();
            if (head == null) {
                head = baru;
            } else {
                tail.next = baru;
            }
            tail = baru;
        }
        //Mendefinisikan proses deque
        public void deque() {
            if (head == null) {
                System.out.println("- Kosong -");
            } else {
                head.read();
                head = head.next;
            }
        }
        //Mendefinisikan proses view (memprint queue)
        public void view() {
            if (head == null) {
                System.out.println("- Kosong -");
            } else {
                for (UASQueue a = head; a != null; a = a.next) a.read();
            }
        }

        public static void main(String[] args) {
            int menu=0;
            linked que=new linked();
            //Pendefinisian menu jika program di jalankan
            while(menu!=4){
                System.out.println("1.Tambah Antrian\n2.Panggil Antrian\n3.Lihat Antrian\n4.Keluar Program ");
                menu=in.nextInt();
                if(menu==1)que.enque();
                else if(menu==2)que.deque();
                else if(menu==3)que.view();
                else if(menu==4)System.out.println("- keluar -");
                else System.out.println("- Salah -");
                System.out.println("");
            }
        }
    }
}