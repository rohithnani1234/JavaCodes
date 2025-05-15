public class Task3 {
  public void countOfEven(){
    int count=0;
    for(int i=2;i<=50;i++){
      if (i%2==0){
        count++;  
      }
    }
    System.out.println(count);
  }
  public static void main(String[] args) {
    Task3 even=new Task3();
    even.countOfEven();
  }
}
