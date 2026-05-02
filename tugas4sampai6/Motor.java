/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4sampai6;

/**
 *
 * @author ASUS
 */
public class Motor extends Kendaraan {
    private String jenisMesin;
    
    public Motor (String merk, int kecepatanMaks, String jenisMesin) {
    super (merk, kecepatanMaks);
    this.jenisMesin= jenisMesin;
    }
 @Override
    public void gerakkan(){
        System.out.println("Motor " + merk + " Melaju di jalan!");
    }
    @Override
    public void infoKendaraan(){
        super.infoKendaraan();
        System.out.println("jenis Mesin: " + jenisMesin);
        
    }
}

