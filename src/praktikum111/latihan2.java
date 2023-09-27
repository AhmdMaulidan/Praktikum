
package praktikum111;

import java.util.Scanner;

//@Maulidan

public class latihan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double laptop = 850.56;
        double bukuTulis = 250.11;
        double kotakPensil = 23.11;
        double smartphone = 200.00;
        double beratBarang;
        char indeksBerat = 0;
        int total;

        double input1, input2, input3, input4;
        
        System.out.println("======== Indeks Berat Barang Bawaan Tasku ========");

        System.out.print("Banyak laptop: ");
        total = scan.nextInt();
        input1 = total * laptop;


        System.out.print("Banyak Buku Tulis: ");
        total = scan.nextInt();
        input2 = total * bukuTulis;

        System.out.print("Banyak Kotak Pensil: ");
        total = scan.nextInt();
        input3 = total * kotakPensil;

        System.out.print("Banyak Smartphone: ");
        total = scan.nextInt();
        input4 = total * smartphone;
        
        System.out.println("=============================================");
        
        beratBarang = input1 + input2 + input3 + input4;

        if( input1 < 0 || input2 < 0 || input3 < 0 || input4 < 0){
            System.err.println("ERROR - Tidak diperkenankan bilangan negatif");
        } else {
            if (beratBarang > 2000){
                indeksBerat = '5';
            } else if (beratBarang >= 1500){
                indeksBerat = '4';
            } else if (beratBarang >= 1000) {
                indeksBerat = '3';
            } else if (beratBarang >= 500) {
                indeksBerat ='2';
            } else if (beratBarang > 0) {
                indeksBerat = '1';
            } else if (beratBarang >= 0){
                indeksBerat = '0';
            }

            System.out.println("Indeks Berat Barangnya adalah : " + indeksBerat);
            if (indeksBerat == '5'){
                System.err.println("Berat barang melebihi ketentuan");
            } else {
                System.out.println("Barang tidak melebihi ketentuan");
            }

        }
    }
}
