import java.util.Scanner;

public class RegexJV {
    public static void main(String[] args){
        String MSSV;
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap MSSV: ");
        MSSV = ip.nextLine();
        ip.close();
        if (MSSV.matches("B\\d{7}")) //Kiểm tra bằng biểu thức chính quy
        System.out.println("Suitable");
     else
        System.out.println("Not suitable");
    }
}
