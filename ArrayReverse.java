import java.util.Scanner;

public class ArrayReverse{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = ip.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = ip.nextInt();
        }
        System.out.print("Mang ban dau: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //Dao cac phan tu cua mang
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i+1; j++){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        System.out.print("Mang dao nguoc: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        ip.close();
    }
}