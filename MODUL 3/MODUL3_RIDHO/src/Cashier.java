public class Cashier extends Bioskop {
    // Method untuk mencetak tiket
    public void printTicket(user user, int row, int seat) {
        if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[0].length && seats[row][seat] == 1) {
            System.out.println("Tiket berhasil dicetak untuk " + user.getName() + 
                               "\nKursi: " + (row + 1) + "," + (seat + 1));
        } else {
            System.out.println("Kursi tersebut belum dipesan atau tidak valid.");
        }
    }
}
