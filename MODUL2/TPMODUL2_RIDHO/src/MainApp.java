public class MainApp {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("M001", 120.0, 5, 4);
        Bus bus1 = new Bus("B001", 80.0, 30, 20);

        // Contoh pemanggilan overriding method toString()
        double jarak = 200.0;
    
        System.out.println("Informasi Mobil: " + mobil1.toString());
        System.out.println(" \nWaktu Tempuh Mobil: " + mobil1.hitungWaktuTempuh(jarak) + " jam\n");
        System.out.println("Informasi Bus: " + bus1.toString());
        System.out.println(" \nWaktu Tempuh Bus: " + bus1.hitungWaktuTempuh(jarak) + " jam\n");

        // Contoh pemanggilan overloading method hitungWaktuTempuh()

   
        
    
    }
}