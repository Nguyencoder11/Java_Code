import java.util.Scanner;

public class Array2D_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();

        int[][] A = new int[n][k];
        int[][] B = new int[k][m];
        int[][] C = new int[n][m];

        do {
            System.out.println("CHUONG TRINH TINH TICH 2 MA TRAN");
            System.out.println("----------------------------");
            System.out.println("1. Nhap ma tran");
            System.out.println("2. Tinh tich C = A*B");
            System.out.println("3. Hien thi");
            System.out.println("4. Thoat");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Nhap du lieu cho ma tran A
                    inputMatrix(A, n, k, sc);
                    // Nhap du lieu cho ma tran B
                    inputMatrix(B, k, m, sc);
                    break;
                case 2:
                    mutipleMatrix(A, B, C, n, k, m);
                    break;
                case 3:
                    showMatrix(A, n, k);
                    showMatrix(B, k, m);
                    showMatrix(C, n, m);
                    break;
                case 4:
                    System.out.println("Da thoat chuong trinh!!!");
                    return;
                default:
                    System.out.println("Lua chon khong dung");
                    return;
            }
        } while (true);
    }

    private static void mutipleMatrix(int[][] a, int[][] b, int c[][], int n, int k, int m) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int p = 0; p < a[0].length; p++) {
                    c[i][j] += a[i][p] * b[p][j];
                }
            }
        }
    }

    private static void inputMatrix(int[][] matrix, int row, int col, Scanner sc) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    private static void showMatrix(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
