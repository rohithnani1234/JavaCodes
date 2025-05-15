public class Task8 {
  public void cudeOfNumber(int base){
    int result=1;
    for (int i=1;i<=base;i++){
      result=i*i*i;
      System.out.println("The cube of "+i+" is: "+result);
    }
  }
  public static void main(String[] args) {
    Task8 cube=new Task8();
    cube.cudeOfNumber(10);
  }
}
