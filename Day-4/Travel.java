public class Travel {
  public static void main(String[] args) {
    Travel travel=new Travel();
    String bookingDetails1 = travel.getBookingDetails("Wanderlust Travels", "Paris", 2);
    String bookingDetails2 = travel.getBookingDetails("Wanderlust Travels", "Tokyo", 3);
    System.out.println(bookingDetails1);
    System.out.println("------------------");
    System.out.println(bookingDetails2);
    System.out.println("------------------");
  }
  public String getBookingDetails(String agency, String destination, int travellers){
    return "Agency: " + agency + "\n" +
           "Destination: " + destination + "\n" +
           "Travellers: " + travellers;
  }
  
}
