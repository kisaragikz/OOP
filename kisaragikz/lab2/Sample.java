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
public class Sample {
    public static void main(String[] args) {
        Scanner tube = new Scanner(System.in);
        int number = tube.nextInt();
        System.out.print(number);
        for (int sign = 1; sign < number+1; sign++) {
            System.out.print("=");
        }
        System.out.println('+');
    }
}
