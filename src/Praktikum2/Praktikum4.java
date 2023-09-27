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
public class Praktikum4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.141592;
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jari2 = input.nextDouble();
        double luasL = PI * jari2 * jari2;
        int luasLingkaranBulat = (int) luasL;

        System.out.println("Luas lingkaran adalah: " + luasLingkaranBulat);
    }
}
