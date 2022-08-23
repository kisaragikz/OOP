/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kisaragikz.lab3;

/**
 *
 * @author kisaragi
 */
public class Phone {
    private String brandName;
    private boolean hasFM;
    private boolean hasCamera;
    private double price;
    private int space;
    public static void main(String[] args) {
        Phone p = new Phone();
        p.turnOn();
        p.call("Peter");
        p.showBrand();
        p.turnOff();
    }
    public void call(String n) {
        System.out.println("Calling to "+n);
    }
    public void turnOn() {
        System.out.println("On");
    }
    public void turnOff() {
        System.out.println("Off");
    }
    public void showBrand() {
        System.out.println("Brand > "+brandName);
    }
}
