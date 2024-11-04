import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Database
        Database database = new Database();

        // Membuat objek Konser dan mengatur atributnya
        Konser konser = new Konser();
        konser.setBandName("The Beatles");
        konser.setDate(Date.valueOf("2024-12-01"));
        konser.setLocation("Jakarta");
        konser.setTicketPrice(500);

        // Menambahkan objek Konser ke dalam Database
        database.insertKonser(konser);

        // Menampilkan pesan sambutan dan meminta pengguna untuk mendaftar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di Konser Ticketing System!");
        System.out.print("Masukkan nama Anda untuk registrasi: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan nomor telepon Anda: ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();  // Bersihkan buffer

        // Membuat objek User dan mengatur atributnya
        User user = new User();
        user.setName(name);
        user.setPhonenumber(phoneNumber);
        user.RegisterUser();

        // Menampilkan menu utama dan meminta pengguna untuk memilih menu
        int choice;
        do {
            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Tampilkan Semua Konser");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    database.showAllKonser();
                    break;
                case 2:
                    System.out.print("Masukkan nama band: ");
                    scanner.nextLine();  // Bersihkan buffer
                    String bandName = scanner.nextLine();
                    System.out.print("Masukkan jumlah tiket: ");
                    int ticketCount = scanner.nextInt();
                    database.buyTicket(bandName, ticketCount);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan sistem kami!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
