/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author Maulidan
 */
public class Praktikum1 {
    public static void main(String[] args) {
        Scanner biodata = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap Anda:");
        String nama = biodata.nextLine();
        
        System.out.print("Masukkan NIM Anda: ");
        String nim = biodata.nextLine();
        
        System.out.print("Masukkan Program Studi Anda: ");
        String prodi = biodata.nextLine();
        
        
        System.out.println("Berikut Adalah Biodata Hasil Inputan Anda: " + " Nama : " + nama + " NIM : " + nim + " Program Studi: " + prodi);
    }
}

