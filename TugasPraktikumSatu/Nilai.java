/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikumsatu;

/**
 *
 * @author ASUS
 */
public class Nilai {
    String nama;
    String NPM;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    
    //methode nilai
    public void Nilai() {
    }
    
    //method cetak nilai untuk menampilkan perhitungan nilai akhir
    public void cetakNilai(){
        
        //untuk menghitung nilai akhir
        nilaiAkhir = (nilaiAbsen * 0.10) + (nilaiTugas * 0.20) + (nilaiUTS * 0.30) + (nilaiUAS * 0.40);
        
        System.out.println("Nama                : " + nama);
        System.out.println("NPM                 : " + NPM);
        System.out.println("Nilai Absen(10%)    : " + nilaiAbsen);
        System.out.println("Nilai Tugas(20%)    : " + nilaiTugas);
        System.out.println("Nilai UTS(30%)      : " + nilaiUTS);
        System.out.println("Nilai UAS(40%)      : " + nilaiUAS);
        System.out.println("Nilai Akhir         : " + nilaiAkhir);
    }
}
