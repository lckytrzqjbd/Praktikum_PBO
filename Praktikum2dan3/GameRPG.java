/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum2n3;

/**
 *
 * @author
 * Luckyta Rizqia Jubaedi
 * 2510631170022
 * IF 2A
 */
public class GameRPG {

    public static void main(String[] args) {
        Entity player = new Entity("Himmel", 100, 250);
        Knight knight = new Knight("Stark", 200, 150, 100);
        
        player.infoStatus();
        knight.infoStatus();
    }
}