public class FRIExpress extends Ekspedisi
{
    // TO DO: Create Protected Attribute of FRIExpress (pecahBelah)
    protected boolean pecahBelah;

    // TO DO: Create Constructor of FRIExpress
    public FRIExpress(int jumlahCabang,String pusat,float tarif, boolean pecahBelah){
        super(jumlahCabang, pusat, tarif);
        this.pecahBelah = pecahBelah;
    }
    // TO DO: Create 'informasi' Method to show Information
    public void informasi(){
        if (pecahBelah == false){
            System.out.println("ekspedisi ini melayani paket pecah belah");
        }
        else {System.out.println("\nekspedisi FRI express dengan jumlah cabang " + jumlahCabang + "dan berpusat di bandung mempunyai tarif sebesar" + tarif +
         "per kilogram selain itu ekspedisi ini tidak melayani paket pecah belah ");}
    }

    // TO DO: Create 'terima' Method to accept a number of packages
    public void terima(int jumlahpaket){
        System.out.println("FRI express berhasil menerima paket yang siap disortir berjumlah" + jumlahpaket);

    }
 
    // TO DO: Create 'kirim' Method to send a package to a destination
    public void kirim(String tujuan){
        System.out.println("FRI express berhasil mengirimkan paket ke tujuan" + tujuan );

    }

    // TO DO: Create 'kirim' Method to send a package to two destinations
    public void kirim(String tujuan_1, String tujuan_2){
        System.out.println("FRI express berhasil mengirimkan paket ke tujuan" + tujuan_1 + "dan" + tujuan_2);

    }

}
