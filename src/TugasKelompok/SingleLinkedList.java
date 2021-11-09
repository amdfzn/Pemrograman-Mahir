package TugasKelompok;

import java.util.*;
public class SingleLinkedList {
    public static void main(String[] args) {
        //memanggil variabel linkedlist dari library util linked list
        LinkedList <String> nama = new LinkedList<>();
        nama.addFirst("Fauzan");
        nama.addFirst("Ayu");
        nama.addLast("Renggy");
        nama.addLast("Isan");

        System.out.println("Daftar Nama ");
        for (String name : nama){
            System.out.println(name);
        }
    }
}
