import java.util.Scanner;
public class DiagonalSum {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    int[][] matrix = new int[3][3];
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("Left diagonal sum: " + (matrix[0][0] + matrix[1][1] + matrix[2][2]));
    System.out.println("Right diagonal sum: " + (matrix[0][2] + matrix[1][1] + matrix[2][0]));
    }
}
