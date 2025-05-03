public class Book {
  public static void main(String[] args) {
    Book book=new Book();
    book.displayInfo("City Public Library","The Great Gatsby","F. Scott Fitzgerald");
    book.displayInfo("City Public Library","1984","George Orwell");
  }
  public void displayInfo(String libraryName,String title,String author){
    System.out.println("Library Name: " + libraryName);
    System.out.println("Book Title: " + title);
    System.out.println("Book Author: " + author);
  }
}
