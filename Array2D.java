import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Nhap so dong cua ma tran
        int n = in.nextInt();

        // Nhap so cot cua ma tran
        int m = in.nextInt();

        int[][] a = new int[n][m];

        // Nhap phan tu cho ma tran
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}