package UAS;
import java.util.*;

public class UASStack {
    public static void main(String[] args)
    {
        // Menginisialisasi Stack
        Stack cd = new Stack();

        // Input data berdasarkan urutan Qory
        cd.push("Vidi Aldiano");
        cd.push("Elmatu");
        cd.push("Natta Reza");
        cd.push("Rizky Febian");
        cd.push("Rossa");
        cd.push("Afgan");
        cd.push("Mahen");
        cd.push("Sammy Simorangkir");

        // Cetak isi stack pertama
        System.out.println("Susunan Pertama : " + cd);

        // Pemindahan CD oleh Adik Qory
        cd.pop();
        cd.pop();
        cd.pop();
        cd.pop();
        cd.pop();
        cd.pop();
        cd.pop();
        cd.pop();
        cd.push("Elmatu");
        cd.push("Natta Reza");
        cd.push("Rizky Febian");
        cd.push("Rossa");
        cd.push("Vidi Aldiano");
        cd.push("Afgan");
        cd.push("Sammy Simorangkir");
        cd.push("Mahen");

        // Cetak isi stack kedua
        System.out.println("Susunan Kedua : " + cd);

    }
}
