public class FactorialNumber {
  public static int factorial(int num){
    int product=1;
    if (num==0){
      return 1;
    }
    if(num<0){
      return -1;
    }
    else {
      int i=1;
      while(i<=num){
        product=product*i;
        i++;
      }
    }
    return product;
  }
  public static void main(String[] args) {
    int result=factorial(7);
    System.out.println("Factorial number is:"+result);
  }
}
