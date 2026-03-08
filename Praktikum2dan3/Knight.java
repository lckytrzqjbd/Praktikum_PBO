/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum2n3;

import static tugaspraktikum2n3.InterfaceEntity.BASE_ATTACK;
import static tugaspraktikum2n3.InterfaceEntity.BASE_HP;

/**
 *
 * @author 
 * Luckyta Rizqia Jubaedi
 * 2510631170022
 * IF 2A
 */
public class Knight extends Entity{
    private double defense;
    
        public Knight (String nama, double hp, double attack, double defense) {
            super(nama, hp, attack);
            this.defense = defense;
        }
        public void infoStatus(){
            super.infoStatus();
            System.out.println("Defense : " + defense);
        }
}
