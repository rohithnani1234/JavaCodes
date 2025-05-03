public class Ticket {
  public static void main(String[] args) {
    Ticket ticket = new Ticket();
    String ticketInfo1 = ticket.getTicketInfo("Galaxy Cinemas", "Interstellar", "A10");
    String ticketInfo2 = ticket.getTicketInfo("Galaxy Cinemas", "Inception", "B12");
    System.out.println(ticketInfo1);
    System.out.println("------------------");
    System.out.println(ticketInfo2);
    System.out.println("------------------");
  }
  public String getTicketInfo(String theaterName, String movieName, String seatNo){
    return "Theater Name: " + theaterName + "\n" +
           "Movie Name: " + movieName + "\n" +
           "Seat No: " + seatNo;
  }
}
