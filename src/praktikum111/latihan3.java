package praktikum111;

import java.util.Scanner;

/**
 *
 * @author Maulidan
 */
public class latihan3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int beli;
        int cashback = 5500;
        int tambahanBarang;
        int jumlahBarang;

        System.out.println("======== Selamat Datang di Toko Charlie ========");
        System.out.print("Banyak pembelian barang : ");

        beli = scan.nextInt();

        System.out.println("==========================================");

        if (beli <= 0) {
            System.err.println("ERROR - Inputan harus lebih dari 0");
        } else {
            tambahanBarang = beli / 3;
            jumlahBarang = beli + tambahanBarang;
            if (beli % 7 == 0) {
                int kelipatan = beli / 7;
                System.out.println("Cashback : " + cashback * kelipatan);
            } else {
                System.out.println("Cashback : -");
            }

            System.out.println("Tambahan Barang : " + tambahanBarang);
            System.out.println("Jumlah Barang : " + jumlahBarang);
        }
    }
}
