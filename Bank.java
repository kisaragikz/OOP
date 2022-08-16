/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kisaragikz;

/**
 *
 * @author kisaragi
 */
import java.util.*;
public class Bank {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.print("Input your money : ");
        int money = inputInt.nextInt();
        Scanner inputString = new Scanner(System.in);
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        String type = inputString.nextLine();
        switch (type) {
            case "A" -> money *= 1.015;
            case "B" -> money *= 1.02;
            case "C" -> money *= 1.015;
            default -> money *= 1.05;
        }
        System.out.println("Your total money in one year = " + money);
    }
}
