/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kisaragikz.lab3;

/**
 *
 * @author kisaragi
 */
public class Student {
    public String name;
    public double mScore;
    public double fScore;
    public static void main(String[] args) {
        Student s = new Student();
        s.mScore = 80;
        s.fScore = 80;
        s.showGrade();
    }
    public void showGrade() {
        double score = (mScore*0.4)+(fScore*0.4)+20;
        System.out.println("Your grade is "+score);
    }
}
