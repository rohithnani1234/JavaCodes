public class NeonNumber{
  public static void main(String[] args){
    int num=12;
    int square=num*num;
    int sum=0;
    while(square!=0){
      int mod=square%10;
      sum=sum+mod;
      square=square/10;
    }
    if (num==sum){
      System.out.println("it is a neon number");
    }
    else {
      System.out.println("it is not a neon number");
    }
  }
}