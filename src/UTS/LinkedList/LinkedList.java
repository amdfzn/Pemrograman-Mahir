package UTS.LinkedList;

class LinkedList {
    UTS head,tail;
    public LinkedList(){
        head=null;
        tail=null;
    }
    public void add(){
        UTS baru=new UTS();
        baru.input();
        if(head==null) head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void view(){
        if(head==null){
            System.out.println("Kosong");
            return;
        }
        System.out.println("| Nama | NIM | Jurusan | Umur | Gender |");
        UTS ptr=head;
        while(ptr!=null){
            ptr.view();
            ptr=ptr.next;
        }
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("Kosong");
            return;
        }
        System.out.println("Data "+head.nama+" Berhasil Dihapus");
        head=head.next;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Kosong");
            return;
        }
        System.out.println("Data "+tail.nama+" Berhasil Dihapus");
        if(head==tail){
            head=null;
            tail=null;
        }else{
            UTS ptr=head.next;
            UTS prev=head;
            while(ptr!=tail){
                ptr=ptr.next;
                prev=prev.next;
            }
            prev.next=null;
            tail=prev;
        }
    }
}
