import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int classes = sc.nextInt();
    int days = sc.nextInt();

    int[][] mat1 = new int[classes][days];
    int[][] mat2 = new int[classes][days];

    for (int i = 0; i < classes; i++) {
      for (int j = 0; j < days; j++) {
        mat1[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < classes; i++) {
      for (int j = 0; j < days; j++) {
        mat2[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < classes; i++) {
      for (int j = 0; j < days; j++) {
        System.out.print((mat1[i][j] + mat2[i][j]) + " ");
      }
      System.out.println();
    }
  }
}