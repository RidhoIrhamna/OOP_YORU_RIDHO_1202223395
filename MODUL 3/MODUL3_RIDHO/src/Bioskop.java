public class Bioskop {
    // Atribut untuk jumlah baris dan kursi per baris
    public static final int rows = 5;
    public static final int seatsperrows = 10;

    // Array dua dimensi untuk menyimpan status reservasi kursi
    int[][] seats = new int[rows][seatsperrows];

    // Konstruktor untuk menginisialisasi kursi
    public Bioskop() {
        seats[0][2] = 1; // Contoh kursi yang sudah terisi
    }

    // Method untuk menampilkan tata letak kursi
    public void displaySeating() {
        System.out.println("Tata letak kursi bioskop:");
        for (int b = 0; b < rows; b++) {
            for (int k = 0; k < seatsperrows; k++) {
                System.out.print(seats[b][k] + " ");
            }
            System.out.println();
        }
    }

    // Method untuk memesan kursi
    public void bookSeat(int row, int seat) {
        if (seats[row][seat] == 0) {
            seats[row][seat] = 1;
            System.out.println("Kursi berhasil dipesan: " + (row + 1) + "," + (seat + 1));
        } else {
            System.out.println("Kursi " + (row + 1) + "," + (seat + 1) + " sudah dipilih.");
        }
    }
}
