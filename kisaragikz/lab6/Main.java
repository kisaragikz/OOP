/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kisaragikz.lab6;
/**
 *
 * @author kisaragi
 */
public class Main {
//    public static void main(String[] args) {
//        Mage m1 = new Mage();
//        Novice n1 = new Novice();
//        
//        Rod r1 = new Rod();
//        Sword s1 = new Sword();
//
//        Potion p1 = new Potion();
//        Potion p2 = new Potion();
//        
//        System.out.println("Mage \t" + m1);
//        System.out.println("Novice \t" + n1);
//        System.out.println("---------------------------");
//        
//        m1.addEquipment(r1);
//        n1.addEquipment(s1);
//        
//        System.out.println("Mage \t" + m1);
//        System.out.println("Novice \t" + n1);
//        System.out.println("---------------------------");
//        
//        m1.attack(n1);
//        
//        System.out.println("Mage \t" + m1);
//        System.out.println("Novice \t" + n1);
//        System.out.println("---------------------------");
//        
//        m1.addEquipment(p1);
//        n1.addEquipment(p2);
//        
//        System.out.println("Mage \t" + m1);
//        System.out.println("Novice \t" + n1);
//        System.out.println("---------------------------");
//        
//        m1.addEquipment(p1);
//        System.out.println("Mage \t" + m1);
//        System.out.println("Novice \t" + n1);
//        System.out.println("---------------------------");
//    }
    
    
    
    
    public static void main(String[] args) {
        Plane p1 = new Plane(200,"IT Airline","FX-747");

        Ship s1 = new Ship(200);

        System.out.println("=== plane ===");

        p1.startEngine();

        p1.takeOff();

        p1.fly();

        p1.fly();

        p1.honk();

        p1.landing();

        p1.stopEngine();

        System.out.println("=== ship ===");

        s1.startEngine();

        s1.move(2);

        s1.honk();

        s1.stopEngine();     
    }
}
