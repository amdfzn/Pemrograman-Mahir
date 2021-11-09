package UTS.LinkedList;
import java.util.*;
public class UTS {
    int umur;
    String nama, nim, jurusan, gender;
    UTS next;
    public static Scanner in = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan Nama: ");
        nama=str.nextLine();
        System.out.print("Masukkan NIM: ");
        nim=str.nextLine();
        System.out.print("Masukkan Jurusan: ");
        jurusan=str.nextLine();
        System.out.print("Masukkan Umur: ");
        umur=in.nextInt();
        System.out.print("Masukkan Gender: ");
        gender=str.nextLine();
        next=null;
    }
    public void view(){
        System.out.println("| "+nama+" | "+nim+" | "+jurusan+" | "+umur+" | "+gender+" |");
    }
    public static void main(String[] args) {
        int menu=0,del;
        LinkedList link =new LinkedList();
        while(menu!=4){
            System.out.print("1.Masukkan Data\n2.Lihat Data\n3.Hapus Data\n4.Keluar\n : ");
            menu=in.nextInt();
            if(menu==1) link.add();
            else if(menu==2) link.view();
            else if(menu==3){
                System.out.print("1.Data Pertama\n2.Data Terakhir\n : ");
                del=in.nextInt();
                if(del==1) link.removeFirst();
                else if(del==2) link.removeLast();
                else System.out.println("Salah");
            }
            else if(menu==4) System.out.println("Keluar");
            else System.out.println("Salah");
            System.out.println();
        }
    }
}
