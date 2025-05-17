public class ArmstrongNumber {
  public static void main(String[] args) {
    int num=789;
    int temp=num;
    int sum=0;
    while(num>0){
      int res=num%10;
      int cube=res*res*res;
      sum+=cube;
      num=num/10;
    }
    if(temp==sum){
      System.out.println("it is a armstrong number");
    }
    else {
      System.out.println("It is not a armstrong number");
    }
  }
}
