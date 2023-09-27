package praktikum111;

//@Maulidan
import java.util.Scanner;

public class latihan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga = 100000;
        int stok = 150;
        System.out.println("======== TOKO BUAH A ========");
        System.out.print("Enter jumlah pembelian : ");
        int beli = input.nextInt();
        System.out.print("Enter menit : ");
        int menit = input.nextInt();
        System.out.println("==============================");
        if (menit <= 0 || beli <= 0 || menit > 420 || beli > stok) {
            System.out.println("ERROR - Inputan invalid!");
        } else {
            System.out.println("Jumlah Pembelian : " + beli);
            stok -= beli;
            System.out.println("Stok Tersisa : " + stok);
            harga *= beli;
            if (menit >= 40) {
                int cek = (int) menit / 40;
                int diskon = cek * 5000 * beli;
                harga -= diskon;
                System.out.println("Hasil Pembelian : " + harga);
            } else {
                System.out.println("Hasil Pembelian : " + harga);
            }
        }
    }
}
