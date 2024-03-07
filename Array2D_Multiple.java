import java.util.Scanner;

public class Array2D_Multiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int m = scan.nextInt();

        int[][] A = new int[n][k];
        int[][] B = new int[k][m];

        // Nhap du lieu cho ma tran A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                A[i][j] = scan.nextInt();
            }
        }

        // Nhap du lieu cho ma tran B
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = scan.nextInt();
            }
        }

        int[][] result = new int[n][m];
        // Thuc hien nhan 2 ma tran
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int p = 0; p < A[0].length; p++) {
                    result[i][j] += A[i][p] * B[p][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); 
        }

        scan.close();
    }
}
