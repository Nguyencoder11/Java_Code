public class Congmatran {
    public static void main(String[] args) {
        // tao hai ma tran
        int a[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
        int b[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
 
        // tao ma tran khac de luu giu ket qua phep cong hai ma tran
        int c[][] = new int[2][3];
 
        // cong va in tong hai ma tran
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
