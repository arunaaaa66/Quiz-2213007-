import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Makangratis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> fuelQueue = new LinkedList<>();

        while (true) {
            System.out.println("=== Program Makan Gratis ===");
            System.out.println("1. Silahkan Daftar Antrian");
            System.out.println("2. Ambil Makan Gratis");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 


            switch (choice) {
                case 1:
                    System.out.print("Masukkan nomor antrian: ");
                    String vehicleNumber = scanner.nextLine();
                    fuelQueue.add(vehicleNumber);
                    System.out.println("Antrian dengan nomor " + vehicleNumber + " telah ditambahkan ke antrian.");
                    break;

                case 2:
                    if (!fuelQueue.isEmpty()) {
                        String servedVehicle = fuelQueue.poll();
                        System.out.println("Antrian dengan nomor " + servedVehicle + " sedang mengambil makanan.");
                    } else {
                        System.out.println("Antrian kosong! silahkan langsung mengambil makanan.");

                    }
                    break;

                case 3:
                    if (!fuelQueue.isEmpty()) {
                        System.out.println("Daftar nomor antrian:");
                        for (String vehicle : fuelQueue) {
                            System.out.println("- " + vehicle);
                        }
                    } else {
                        System.out.println("Antrian kosong.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah mengikuti program makan gratis ini");
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
