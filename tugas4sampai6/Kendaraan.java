/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4sampai6;

/**
 *
 * @author ASUS
 */
public abstract class Kendaraan {
    protected String merk;
    protected int kecepatanMaks;
    
    public Kendaraan(String merk, int kecepatanMaks) {
        this.merk = merk;
        this.kecepatanMaks = kecepatanMaks;
    }
    
    public abstract void gerakkan ();
    
    void infoKendaraan(){
        System.out.println("===== Info Kendaraan =====");
        System.out.println("Merk: " + this.merk);
        System.out.println("Kecepatan Maksimal: " + this.kecepatanMaks + " km/jam"); 
    }
        
}
