/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4sampai6;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class MainToko {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TokoSerbaAda toko = new TokoSerbaAda();

        // menampilkan katalog
        System.out.println("============================");
        System.out.println("====== TOKO SERBA ADA ======");
        System.out.println("============================");

        for (Barang b : toko.katalog) {
            b.infoBarang();
        }

        // input item barang
        System.out.print("\nMasukkan Item Barang : ");
        int jumlahItem = input.nextInt();
        input.nextLine();
        // array transaksi
        Barang[] belanjaBarang = new Barang[jumlahItem];
        int[] belanjaJumlah = new int[jumlahItem];

        // input barang
        for (int i = 0; i < jumlahItem; i++) {

            System.out.println("\nData ke " + (i + 1));

            System.out.print("Masukkan Kode       : ");
            String kode = input.nextLine();

            Barang hasil = toko.cariBarang(kode);

            if (hasil == null) {

                System.out.println("Kode barang tidak ditemukan!");
                continue;
            }

            System.out.print("Masukkan jumlah Beli : ");
            int jumlah = input.nextInt();
            input.nextLine();

            belanjaBarang[i] = hasil;
            belanjaJumlah[i] = jumlah;
        }

        // output struk
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("==========================================================");

        System.out.println(
            "No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar"
        );

        System.out.println(
            "=========================================================="
        );

        int totalBayar = 0;

        for (int i = 0; i < jumlahItem; i++) {

            if (belanjaBarang[i] != null) {

                int subtotal =
                    belanjaBarang[i].getHarga() * belanjaJumlah[i];

                System.out.printf(
                    "%-3d %-13s %-13s %-7d %-13d %-10d\n",
                    (i + 1),
                    belanjaBarang[i].getKode(),
                    belanjaBarang[i].getNama(),
                    belanjaBarang[i].getHarga(),
                    belanjaJumlah[i],
                    subtotal
                );

                totalBayar += subtotal;
            }
        }

        System.out.println(
            "=========================================================="
        );

        System.out.println("Total Bayar = Rp" + totalBayar);

        input.close();
    }
}