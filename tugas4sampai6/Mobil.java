/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4sampai6;

/**
 *
 * @author ASUS
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil (String merk, int kecepatanMaks, int jumlahPintu) {
    super (merk, kecepatanMaks);
    this.jumlahPintu = jumlahPintu;
}
    @Override
    public void gerakkan(){
        System.out.println("Mobil " + merk + " Melaju di jalan raya!");
    }
    @Override
    public void infoKendaraan(){
        super.infoKendaraan();
        System.out.println("Jumlah Pintu: " + this.jumlahPintu);
    }
}
