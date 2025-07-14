import java.util.*;
class lower{
  public static void lower(String s, int n){
    int count = 0;
    String ans = "";
    for(int i=0;i<n;i++){
      char c = s.charAt(i);
      if(c>='a' && c<='z'){
        count++;
        ans = ans+c;
      }
    }
    System.out.println(ans+" "+count);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String : ");
    String s = sc.nextLine();
    System.out.print("Enter the String Length : ");
    int n = sc.nextInt();
    lower(s,n);
  }
}