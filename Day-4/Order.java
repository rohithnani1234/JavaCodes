public class Order {
  public static void main(String[] args) {
    Order order = new Order();
    String orderDetails1 = order.getOrderDetails("Spice Garden", "Paneer Butter Masala", 2);
    String orderDetails2 = order.getOrderDetails("Spice Garden", "CHicken Biryani", 1);
    System.out.println(orderDetails1);
    System.out.println("------------------");
    System.out.println(orderDetails2);
    System.out.println("------------------");
  }
  public String getOrderDetails(String restaurantName, String foodItem, int quantity){
    return "Restaurant Name: " + restaurantName + "\n" +
           "Food Item: " + foodItem + "\n" +
           "Quantity: " + quantity;
  }
}
