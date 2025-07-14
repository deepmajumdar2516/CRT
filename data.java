import java.util.*;
class Main{
  private static String data(String s){
    int n = s.length();
    String ans = "";
    int i=0;
    while(i<n){
      char c = s.charAt(i);
      while(i<n && c==s.charAt(i)){
        i++;
      }
      ans = c+ans;
    }
    return ans;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String: ");
    String s = sc.nextLine().toLowerCase();
    System.out.println(data(s));
  }
}