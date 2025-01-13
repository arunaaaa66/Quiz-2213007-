import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Antrian {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> antrian = new LinkedList<>();
        Queue<String> nama = new LinkedList<>();
        int nomorAntrian = 1;
        String dataNama;

        System.out.println("=== Program Makan Gratis ===");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ambil Nomor Antrian");
            System.out.println("2. Lihat Nomor Antrian");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1: // Ambil nomor antrian
                    antrian.add(nomorAntrian);
                    System.out.println("masukan nama anda");
                    dataNama=scanner.nextLine();
                    scanner.nextLine();
                    nama.add(dataNama);
                    System.out.println("Nomor antrian Anda: " + nomorAntrian);
                    nomorAntrian++;
                    break;

                case 2: // Lihat nomor antrian
                    if (antrian.isEmpty()) {
                        System.out.println("Tidak ada antrian.");
                    } else {
                        System.out.println("Nomor antrian saat ini: " + antrian);
                    }
                    break;

                case 3: // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan Program Makan Gratis!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }

    }


