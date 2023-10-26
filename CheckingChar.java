import java.util.Scanner;

public class CheckingChar {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        System.out.print("Nhap ky tu: ");
        char c = sc.next().charAt(0);
        sc.close();
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == c){
                    System.out.print("Co");
                }else{
                    System.out.print("Khong");
                }
            }
    }
}


