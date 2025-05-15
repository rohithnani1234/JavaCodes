public class Task10 {
  public static void main(String[] args) {
    int count=0;
   for (int i=1;i<100;i++){
    if (i%9==0){
      count++;
    }
   } 
   System.out.println("Count of Numbers which are divisible by 9 below 100:"+count);
  }
}
