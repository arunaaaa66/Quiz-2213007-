import java.util.LinkedList;
import java.util.Queue;

public class AntriBensin {

    public static void main(String[] args) {

        Queue<String> antrian = new LinkedList<>();

        antrian.offer("moskov");
        antrian.offer("zilong");
        antrian.offer("eudora");
        antrian.offer("layla");
        antrian.offer("alucard");

        System.out.println("daftar orang antri: " + antrian);

        System.out.println("antrian pertama: " + antrian.peek());

        String orang = antrian.poll();
        System.out.println("atas nama " + orang + " bensin telah terisi");

        System.out.println("cek ulang antrian: " + antrian);
        
        if (antrian.isEmpty()) {
            System.out.println("antrian kosong, silahkan maju");
        } else {
            System.out.println("masih ada orang");
        }
    }
}

