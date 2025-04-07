import java.util.Scanner;
public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];
        System.out.print("Enter the first matrix: \n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter the second matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        int[][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The sum of the two matrices is: ");
        for (int i = 0; i < m; i++) {
            System.out.println(" ");
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + " ");
            }
        }
    }
}
