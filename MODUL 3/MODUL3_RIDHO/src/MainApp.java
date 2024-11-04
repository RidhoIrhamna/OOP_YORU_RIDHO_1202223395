import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        user user = new user();

        // Meminta pengguna untuk memasukkan nama dan nomor telepon
        System.out.println("==== Silahkan Register ====");
        String name;
        do {
            System.out.print("Masukkan nama Anda: ");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                System.out.println("Nama tidak boleh kosong.");
            }
        } while (name.isEmpty());
        
        user.setName(name);

        String phoneNumber;
        do {
            System.out.print("Masukkan nomor telepon Anda: ");
            phoneNumber = scanner.nextLine();
            if (!phoneNumber.matches("\\d+")) {
                System.out.println("Nomor telepon harus berupa angka.");
            }
        } while (!phoneNumber.matches("\\d+"));
        
        user.setNoHandPhone(phoneNumber);
        user.register();

        // Membuat objek Bioskop dan Cashier
        Bioskop bioskop = new Bioskop();
        Cashier cashier = new Cashier();

        // Menampilkan tata letak kursi dan melakukan pemesanan
        bioskop.displaySeating();
        
        try {
            System.out.print("Masukkan nomor baris untuk pemesanan kursi: ");
            int row = scanner.nextInt() - 1;
            System.out.print("Masukkan nomor kursi: ");
            int seat = scanner.nextInt() - 1;
            
            if (row < 0 || row >= Bioskop.rows || seat < 0 || seat >= Bioskop.seatsperrows) {
                throw new ArrayIndexOutOfBoundsException("Nomor kursi di luar jangkauan.");
            }

            bioskop.bookSeat(row, seat);
            cashier.printTicket(user, row, seat);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input harus berupa angka yang valid.");
        } finally {
            scanner.close();
        }
    }
}
