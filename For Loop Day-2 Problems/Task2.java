public class Task2 {
  public void multipleofSeven(int num){
    int mult=1;
    for(int i=1;i<=10;i++){
      mult=num*i;
      System.out.print(mult+" ");
    }
  }
  public static void main(String[] args) {
    Task2 obj=new Task2();
    obj.multipleofSeven(7);
  }
}
