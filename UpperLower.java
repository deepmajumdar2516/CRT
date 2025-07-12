import java.util.*;
class UpperLower{
  public static void light(int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(i+j>=n-1){
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
      }
      for(int k=0;k<n;k++){
        if(i>=k+1){
          System.out.print("* ");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    } 
  }
  public static void lower(int n){
    for(int i=n;i>-1;i--){
      for(int j=0;j<n-i+1;j++){
        System.out.print("  ");
      }
      for(int k=0;k<(2*i-1);k++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Number : ");
    int n = sc.nextInt();
    light(n);
    lower(n-1);
  } 
}