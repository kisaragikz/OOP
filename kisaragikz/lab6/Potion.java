/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kisaragikz.lab6;

/**
 *
 * @author kisaragi
 */
public class Potion extends Item{
    public void use(Player P){
        P.setHP(10.0);
    }
}
