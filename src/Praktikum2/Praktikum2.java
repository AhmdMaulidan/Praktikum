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
public class Praktikum2 {
    public static void main(String[] args) {
        Scanner bTernary = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = bTernary.nextInt();

        String hasil = (bilangan % 2 == 0) ? "adalah bilangan genap" : "adalah bilangan ganjil";

        System.out.println("Bilangan " + bilangan + " " + hasil + ".");
    }
}
