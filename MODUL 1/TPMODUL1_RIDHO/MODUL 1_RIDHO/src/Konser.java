import java.sql.Date;

public class Konser {
    private String bandname;
    private Date date;
    private String location;
    private int ticketprice;

    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    public void setBandName(String bandname) {
        this.bandname = bandname ;
    }
    public void setDate(Date date) {
        this.date = date ;
    }
    public void setLocation(String location) {
        this.location = location ;
    }
    public void setTicketPrice(int ticketprice) {
        this.ticketprice = ticketprice ;
    }
   

    public String getBandName(){
        return bandname;
    }
    public Date getDate(){
        return date;
    }
    public String getlocation(){
        return location;
    }
    public int getTicketPrice(){
        return ticketprice;
    }

}