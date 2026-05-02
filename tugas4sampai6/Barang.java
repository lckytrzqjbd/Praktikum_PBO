/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4sampai6;

/**
 *
 * @author ASUS
 */
public class Barang {

    private String kode;
    private String nama;
    private int harga;

    Barang(String kode, String nama, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    String getKode() {
        return kode;
    }

    String getNama() {
        return nama;
    }
    int getHarga() {
        return harga;
    }

    void infoBarang() {
        System.out.println(kode + " | " + nama + " | Rp" + harga);
    }
}

