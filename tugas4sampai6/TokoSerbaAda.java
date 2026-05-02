/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4sampai6;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

class TokoSerbaAda {

    ArrayList<Barang> katalog = new ArrayList<>();

    TokoSerbaAda() {

        katalog.add(new Barang("A012", "Kipas Angin", 300000));
        katalog.add(new Barang("B992", "Charger", 20000));
        katalog.add(new Barang("C003", "Cheesecake", 40000));
        katalog.add(new Barang("D800", "Tas kucing", 50000));
        katalog.add(new Barang("E505", "Wig bule", 60000));
    }

    Barang cariBarang(String kode) {

        for (Barang b : katalog) {

            if (b.getKode().equalsIgnoreCase(kode)) {
                return b;
            }
        }

        return null;
    }
}