/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum2n3;

/**
 *
 * @author 
 * Luckyta Rizqia Jubaedi
 * 2510631170022
 * IF 2A
 */
public class Entity implements InterfaceEntity {
    private String nama;
    private double hp;
    private double attack;
   
    public Entity (String nama, double hp, double attack) {
        this.nama = nama;
        this.hp = hp + BASE_HP;
        this.attack = attack + BASE_ATTACK;
    }
    
    public void infoStatus() {
        System.out.println("========================");
        System.out.println("-----Character Info-----");
        System.out.println("========================");
        System.out.println("Name    : " + nama);
        System.out.println("HP      : " + hp);
        System.out.println("Attack  : " + attack);
    }
}
