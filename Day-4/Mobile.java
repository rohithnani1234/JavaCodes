public class Mobile {
  public static void main(String[] args) {
    Mobile mobile = new Mobile();
    mobile.showDetails("Tech World", "Apple", 1200);
    mobile.showDetails("Tech world", "Samsung", 900);
  } 
  public void showDetails(String storeName, String brand, int price){
    System.out.println("Store Name: " + storeName);
    System.out.println("Mobile Brand: " + brand);
    System.out.println("Mobile Price: " + price);
  }
}
