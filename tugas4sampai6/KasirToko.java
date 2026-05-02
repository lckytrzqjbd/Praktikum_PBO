/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4sampai6;

/**
 *
 * @author ASUS
 */
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;
import java.util.Scanner;
public class KasirToko {
     public static void main(String[] args) {
        double setelahDiskon;
        double diskon = 0;
        String kategori = "";
        String pembayaran = null;
        String persenDiskon = "";
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Pelanggan: ");
        String nama = input.nextLine();
        
        System.out.print("total harga belanja: ");
        double hargaAsli = input.nextDouble();
        
        System.out.println("1. Regular (diskon 0%)");
        System.out.println("2. Silver (diskon 10%)");
        System.out.println("3. Gold (diskon 20%)");
        System.out.println("4. Platinum (diskon 30%)");
        System.out.print("Silahkan pilih kategori member(1-4): ");
        int member = input.nextInt();
        
        switch (member){
            case 1:
                kategori = "Regular";
                persenDiskon = "0%";
                diskon = 0;
                setelahDiskon = hargaAsli;
            break;
            
            case 2:
                kategori = "Silver";
                persenDiskon = "10%";
                diskon = hargaAsli*0.10;
                setelahDiskon = hargaAsli-diskon;
            break;
            
            case 3:
                kategori = "Gold";
                persenDiskon = "20%";
                diskon = hargaAsli*0.20;
                setelahDiskon = hargaAsli-diskon;
            break;
            
            case 4:
                kategori = "Platinum";
                persenDiskon = "30%";
                diskon = hargaAsli*0.30;
                setelahDiskon = hargaAsli-diskon;
            break;
            
            default:
                diskon = 0;
                System.out.println("==========================================");
                System.out.println("Kategori member tidak dikenal, diskon tidak diterapkan");
                setelahDiskon = hargaAsli;
     }
        if (setelahDiskon >= 200000){
            pembayaran = ("Tunai / Transfer / Kartu Kredit");
        }else if (setelahDiskon >= 50000){
            pembayaran = ("Tunai / Transfer");
        } else if (setelahDiskon < 50000) {
            pembayaran = ("Tunai");
        }
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        
        DecimalFormat formatter = new DecimalFormat("#,###", symbols);
        
        System.out.println("==========================================");
        System.out.println("============ Struk Pembayaran ============");
        System.out.println("==========================================");
        System.out.println("Nama Pelanggan  : " + nama);
        System.out.println("Kategori        : " + kategori);
        System.out.println("Total Belanja   : " + formatter.format(hargaAsli));
        System.out.println("Diskon" + " (" + persenDiskon + ")     : " + formatter.format(diskon));
        System.out.println("Total Bayar     : " + formatter.format(setelahDiskon));
        System.out.println("------------------------------------------");
        System.out.println("Metode Pembayaran: " + pembayaran);
        System.out.println("Terima Kasih telah berbelanja!");
        System.out.println("==========================================");
   }
     
}
