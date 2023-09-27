/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author Maulidan
 */
public class Praktikum2 {
    public static void main(String[] args) {
        Scanner escape = new Scanner(System.in);
        
        System.out.print("Silahkan Masukkan Inputan: ");
        String random = escape.nextLine();
        
        System.out.print("Silahkan Masukkan Inputan 2: ");
        String random2 = escape.nextLine();
        
        System.out.print("Silahkan Masukkan Inputan 3: ");
        String random3 = escape.nextLine();
        
        System.out.println( random  + "\n" + random2 + "\n" + "\t" + random3 );
        
    }
}
