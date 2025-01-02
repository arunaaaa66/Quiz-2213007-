import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BengkelAgus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> fuelQueue = new LinkedList<>();

        while (true) {
            System.out.println("=== Selamat Datang di Bengkel Agus ===");
            System.out.println("1. Tambah Kendaraan ke Antrian");
            System.out.println("2. Layani Kendaraan");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 


            switch (choice) {
                case 1:
                    System.out.print("Masukkan plat kendaraan: ");
                    String vehicleNumber = scanner.nextLine();
                    fuelQueue.add(vehicleNumber);
                    System.out.println("Kendaraan dengan plat " + vehicleNumber + " telah ditambahkan ke antrian.");
                    break;

                case 2:
                    if (!fuelQueue.isEmpty()) {
                        String servedVehicle = fuelQueue.poll();
                        System.out.println("Kendaraan dengan plat " + servedVehicle + " sedang dilayani.");
                    } else {
                        System.out.println("Antrian kosong! Tidak ada kendaraan yang dapat dilayani.");
                    }
                    break;

                case 3:
                    if (!fuelQueue.isEmpty()) {
                        System.out.println("Daftar antrian kendaraan:");
                        for (String vehicle : fuelQueue) {
                            System.out.println("- " + vehicle);
                        }
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah service di bengkel kami. Sampai jumpa!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
                    break;
            }
        }
    }
{
}  
}
