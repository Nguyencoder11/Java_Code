import java.util.Scanner;

public class KiemTraKyTuTonTai {

    public static void main(String[] args){
        boolean tonTai = false;
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = ip.nextLine();
        System.out.print("Nhap ky tu: ");
        char c = ip.next().charAt(0);
        ip.close();
        char mangKiTu[] = s.toCharArray();
        for (int i = 0; i < mangKiTu.length; i++){
            if(c == mangKiTu[i]){
                System.out.print("Co");
                tonTai = true;
            }
        }
        if(tonTai == false)
      System.out.println("Khong");
    }
}
