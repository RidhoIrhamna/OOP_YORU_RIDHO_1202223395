public class User {
    // Atribut User
    private String nama;
    private Long phonenumber;

    public Long getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }
    public void setName(String nama) {
        this.nama= nama ;
    }
    public String getName() {
        return nama;
    }

    // Method untuk registrasi User dan menampilkan data User
    public void RegisterUser () {
        System.out.println("Registrasi Berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("No Telepon: " + phonenumber);
    }
}
