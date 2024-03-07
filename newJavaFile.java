/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class newJavaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();
        
        if(n % 2 == 0){
            System.out.println(n + " là số chẵn");
        }else{
            System.out.println(n + " là số lẻ");
        }
        scan.close();
    }
    
}
