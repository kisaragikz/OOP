
public class Account {
    protected double balance;
    protected String name;
    
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
        
    }
    public void deposit(double a){
       if(a > 0){
            this.balance = this.balance + a;
            System.out.println(a+" baht is deposited to "+this.name+".");
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a){
        if(a>0){
//            this.balance -= a;
            double b = this.getBalance()-a;
            this.setBalance(b);
            System.out.println(a+" baht is withdraw from "+this.name+".");
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
        
    public void setName(String name){
       this.name = name;
        
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
  
    public void showAccount(){
        System.out.println(this.name+" account has "+this.balance+" baht.");
        
    }
 }
    
