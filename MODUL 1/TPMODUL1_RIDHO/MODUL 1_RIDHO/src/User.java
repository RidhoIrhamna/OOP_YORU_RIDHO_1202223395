public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
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


    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
   public void RegisterUser (){
      System.out.print("nama: " + nama );
      System.out.print("No telepon: " + phonenumber);
   }
   
   

}
