public class user {
   // Atribut untuk nama dan nomor telepon
   private String name;
   private String noHandphone;

   // Setter untuk nama dan nomor telepon
   public void setName(String name) {
       this.name = name;
   }

   public void setNoHandPhone(String noHandphone) {
       this.noHandphone = noHandphone;
   }

   // Method untuk melakukan registrasi dan menampilkan informasi
   public void register() {
       System.out.println("Registrasi berhasil!");
       System.out.println("Nama: " + name);
       System.out.println("No Handphone: " + noHandphone);
   }

   // Getter untuk nama dan nomor telepon
   public String getName() {
       return name;
   }

   public String getNoHandPhone() {
       return noHandphone;
   }
}
