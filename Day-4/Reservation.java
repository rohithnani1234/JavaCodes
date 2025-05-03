public class Reservation {
  public static void main(String[] args) {
    Reservation reservation = new Reservation();
    String reservationDetails1 = reservation.getReservationDetails("Grand Palace", "David", 3);
    String reservationDetails2 = reservation.getReservationDetails("Grand Palace", "Maria", 2);
    System.out.println(reservationDetails1);
    System.out.println("------------------");
    System.out.println(reservationDetails2);
    System.out.println("------------------");
  }
  public String getReservationDetails(String hotelName, String guestName, int nights){
    return "Hotel Name: " + hotelName + "\n" +
           "Guest Name: " + guestName + "\n" +
           "Nights: " + nights;
  }
  
}
