package praktikum111;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int inputUser;
        
        System.out.print("Silahkan masukkan inputan: ");
        inputUser = scan.nextInt();
        
        if(inputUser %2 == 0 && inputUser %5 == 0){
            System.out.println("Program Halted");
        } else  {
            System.out.println("Program Started");
        }
        
    }
}
