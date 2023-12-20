public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private static final int rows = 5;
         
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private static final int seatsperrows = 10;

    // TO DO: Create 2 dimensional array to store seat reservation status
    int[][] seats = new int[rows][seatsperrows];
    
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
       seats [0][2]=1;
    }

    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("booking tiket bioskop");
        for (int b=0; b < rows ; b++) {
            for (int k=0; k < seatsperrows; b++) {
                System.out.println(seats[rows][seatsperrows]);
            }
        }
    }
    
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
    if (seats [row][seat] == 0 ){
        seats [row][seat] = 1 ;
        System.out.println("kursi berhasil dipesan" + (row+1)+","+(seat+1));}
    else {
        System.out.println("kursi" +(row+1)+","+(seat+1) + "sudah dipilih");
    }
    
}
}