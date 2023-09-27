/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

import java.util.Scanner;

/**
 *
 * @author Maulidan
 */
public class Praktikum1 {
    public static void main(String[] args) {
        Scanner vBalok = new Scanner(System.in);

        System.out.print("Silahkan masukkan panjang balok: ");
        double panjang = vBalok.nextDouble();
        System.out.print("Silahkan masukkan lebar balok: ");
        double lebar = vBalok.nextDouble();
        System.out.print("Silahkan Masukkan tinggi balok: ");
        double tinggi = vBalok.nextDouble();
       
        System.out.println("hasil volume balok adalah: " + panjang * lebar * tinggi);
    }
}
