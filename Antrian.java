import java.util.LinkedList;
import java.util.Queue;

public class Antrian {
    public static void main(String[] args) {
        // Bikin Queue pakai LinkedList
        Queue<String> antrian = new LinkedList<>();

        // Tambah orang ke antrian
        antrian.offer("Anya");
        antrian.offer("Budi");
        antrian.offer("Cici");

        System.out.println("Antrian awal: " + antrian);

        // Ngintip siapa yang di depan
        System.out.println("Yang paling depan: " + antrian.peek());

        // Melayani orang di depan
        String dilayani = antrian.poll();
        System.out.println(dilayani + " dilayani.");

        // Antrian setelah melayani
        System.out.println("Antrian sekarang: " + antrian);

        System.out.println("Yang kedua:" + antrian.peek());

        String disepong = antrian.poll();
        System.out.println(disepong + " dilayani.");

        System.out.println(antrian);

        String diewe = antrian.poll();
        System.out.println(diewe + " dilayani.");

        // Cek kosong nggak
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong, bestie!");
        } else {
            System.out.println("Masih ada yang ngantri.");
        }
    }
}

