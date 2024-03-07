import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap n: ");
            n = ip.nextInt();
        } while (n <= 0);
        System.out.format("%dth Fibonacci is: %d", n, fibo(n));
        ip.close();
    }
    // Sử dụng đệ quy
    /*
     * public static int fibo(int n){
     * if(n == 1 || n == 2){
     * return 1;
     * }
     * else{
     * return(fibo(n-2) + fibo(n-1));
     * }
     * }
     */

    // Không sử dụng đệ quy

    public static int fibo(int n) {
        int cnt = 2;
        int a0 = 1, a1 = 1, a2 = 2;
        if (n == 1 || n == 2) {
            return 1;
        } else {
            while (cnt++ < n) {
                a2 = a0 + a1;
                a0 = a1;
                a1 = a2;
            }
            return a2;
        }
    }

}
