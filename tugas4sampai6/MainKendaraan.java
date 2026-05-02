/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4sampai6;

/**
 *
 * @author ASUS
 */
public class MainKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil ("Bugatti Veyron Super Sport", 431, 2);
        Kendaraan k2 = new Motor ("Kawasaki Ninja H2R", 400, "4-Silinder");
        Kendaraan k3 = new Mobil ("Hennessey Venom F5", 500, 2);
        Kendaraan k4 = new Motor ("Ducati 1098S", 271, "4-Tak");
        Kendaraan k5 = new Mobil ("Koenigsegg Agera RS", 440, 2);
        
        k1.infoKendaraan();
        k1.gerakkan();
        System.out.println();
        
        k2.infoKendaraan();
        k2.gerakkan();
        System.out.println();
        
        k3.infoKendaraan();
        k3.gerakkan();
        System.out.println();
        
        k4.infoKendaraan();
        k4.gerakkan();
        System.out.println();
        
        k5.infoKendaraan();
        k5.gerakkan();
        System.out.println();
    }
    
}
