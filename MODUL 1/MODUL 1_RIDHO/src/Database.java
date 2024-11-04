import java.util.List;
import java.util.ArrayList;

public class Database {
    // List untuk menyimpan objek Konser
    private List<Konser> konserList = new ArrayList<>();

    // Method untuk menambahkan konser ke dalam database
    public void insertKonser(Konser konser) {
        konserList.add(konser);
        System.out.println("Konser berhasil ditambahkan ke database.");
    }

    // Method untuk menampilkan semua konser dari database
    public void showAllKonser() {
        if (konserList.isEmpty()) {
            System.out.println("Tidak ada konser yang tersedia.");
        } else {
            for (Konser konser : konserList) {
                System.out.println("Band Name: " + konser.getBandName());
                System.out.println("Date: " + konser.getDate());
                System.out.println("Location: " + konser.getlocation());
                System.out.println("Ticket Price: " + konser.getTicketPrice());
                System.out.println("-----------------------------");
            }
        }
    }

    // Method untuk membeli tiket dan menunjukkan total harga
    public void buyTicket(String bandName, int ticketCount) {
        for (Konser konser : konserList) {
            if (konser.getBandName().equalsIgnoreCase(bandName)) {
                int totalPrice = konser.getTicketPrice() * ticketCount;
                System.out.println("Total Price for " + ticketCount + " tickets: $" + totalPrice);
                return;
            }
        }
        System.out.println("Konser dengan nama band tersebut tidak ditemukan.");
    }
}
