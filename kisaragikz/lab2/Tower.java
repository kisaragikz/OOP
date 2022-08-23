/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kisaragikz.lab2;

/**
 *
 * @author kisaragi
 */
import java.util.*;
public class Tower {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.print("Please enter the height of the building : ");
        int height = inputInt.nextInt();
        for (int i = 0; i < height; i++) {
            System.out.println("#-#-#-#-#");
        }
    }
}
