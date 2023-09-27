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
public class Praktikum3 {
    public static void main(String[] args) {
        Scanner karakterESC = new Scanner(System.in) ;
        
        System.out.print("Silahkan Masukkan Quote untuk Hari ini: ");
        String quote = karakterESC.nextLine();
        
        System.out.println("Quote hari ini: " + "\"" +quote + "\"");
    }
}
