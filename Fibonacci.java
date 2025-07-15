import java.util.*;
class Fibonacci{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = fibonacci(n);
    System.out.println(ans);
  }
  public static int fibonacci(int n){
    if(n==0){
      return 0;
    }
    if(n==1){
      return 1;
    }
    return fibonacci(n-1)+fibonacci(n-2);
  }
}