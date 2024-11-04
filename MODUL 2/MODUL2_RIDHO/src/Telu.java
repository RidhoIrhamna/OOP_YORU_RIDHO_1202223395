public class Telu extends Ekspedisi
{
    // TO DO: Create Protected Atribute of TelUExpress(antarInter)
    protected boolean antarInter;

    // TO DO: Create Constructor of TelUExpress
    public Telu(int jumlahCabang,String pusat,float tarif, boolean antarInter){
        super(jumlahCabang, pusat, tarif);
        this.antarInter = antarInter;
        
    }

    // TO DO: Create 'informasi' Method to show Information
    public void informasi (){
        
        if (antarInter == true){
            System.out.println("ekspedisi ini melayani tidak pengantaran internasional");
        }
        else {System.out.println("\nAekspedisi telu express dengan jumlah cabang " + jumlahCabang + "dan berpusat di bandung mempunyai tarif sebesar" + tarif +
         "per kilogram selain itu ekspedisi ini melayani t pengantaran internasional" );}
        
    }
    // TO DO: Create 'ambil' Method to pick up a package
    public void ambil(String tempat){
        System.out.println("telu express berhasil mengambil paket di" + tempat );
    }
    
    // TO DO: Create 'antar' Method to send a package
    public void antar(int resi){
        System.out.println("telu express berhasi mengantar paket dengan no resi" + resi);
    }

    // TO DO: Create 'antar' Method to send two packages
    public void antar(int resi_1,int resi_2){
        System.out.println("telu express berhasil mengantar paket dengan no resi" + resi_1 + "dan no resi" + resi_2);
    }
}
