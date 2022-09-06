/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kisaragikz.lab5;

/**
 *
 * @author kisaragi
 */
public class CheckingAccount extends Account {
    private double credit;
    public CheckingAccount(){
        super(0, "");
        this.credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if(credit>0){
            this.credit = credit;
        } else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return this.credit;
    }
    public void withdraw(double a){
        if(a>0 && this.balance-a>=0){
            this.balance -= a;
            System.out.println(a+" baht is withdrawn from "+this.name+" and your credit balance is "+this.credit+".");
        } else if(a>0 && this.balance-a<0 && this.balance-a+this.credit>=0){
            this.balance = 0;
            this.credit = this.balance-a+this.credit;
            System.out.println(a+" baht is withdrawn from "+this.name+" and your credit balance is "+this.credit+".");
        } else if(a>0 && this.balance-a<0 && this.balance-a+this.credit<0){
            System.out.println("Not enough money!");
        } else{
            super.withdraw(a);
        }
    }
    public void withdraw(String a){
        this.withdraw(Double.parseDouble(a));
    }
    public String toString(){
        return "The "+this.name+" account has "+this.balance+" baht and "+this.credit+" credits.";
    }
}
