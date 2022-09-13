/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kisaragikz.lab6;

/**
 *
 * @author kisaragi
 */
public class Mage extends Player{
    public Mage(){
        setHP(10.0);
        setMP(20.0);
        setATK(5.0);
    }
    public void addEquipment(Item i){
        i.use(this);
    }
    public void attack(Player p){
        p.attacked(this.getATK()*2.5);
        this.setMP(-5.0);
    }
    public void attacked(double n){
        this.setHP(-n);
    }
}
