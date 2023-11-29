public class jalan {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi = new Ekspedisi( 10 ,"jakarta",10000);
        ekspedisi.informasi();

        // TO DO: Create teluexpress Object from TelUExpress Class
        Telu telu = new Telu (100,"Bandung",5000,false);
        telu.informasi();
        telu.ambil(" jakarta ");
        telu.antar(  25 );
        telu.antar( 20 , 25 );


        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress fri = new FRIExpress (100,"malang",5000,true);
        fri.informasi();
        fri.terima(100);
        fri.kirim("Jakarta");
        fri.kirim("Jakarta","Bandung");



    }
}
