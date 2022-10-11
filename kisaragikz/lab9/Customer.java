
import java.util.*;
public class Customer {
//    private String firstName;
//    private String lastName;
//    private Account acct[];
//    private int numOfAccount;
//    
//    public Customer(){
//        this.firstName = "";
//        this.lastName = "";
//        acct = new Account[5];
//     }
//    public Customer(String firstName, String lastName){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        acct = new Account[5];
//    }
//    
//    public void setFirstName(String firstName){
//        this.firstName = firstName;
//    }
//    public String getFirstName(){
//        return firstName;
//    }
//    public void setLastName(String lastName){
//        this.lastName = lastName;
//        
//    }
//    public String getLastName(){
//        return lastName;
//    }
//    public Account getAccount(int index){
//        return acct[index];
//    }
//    public void addAccount(Account acct){
//        this.acct[numOfAccount] = acct;
//        numOfAccount += 1;
//    }
//  
//    public String toString(){
//        return "Name : "+this.getFirstName()+" LastName : "+this.getLastName()+" have "+this.getNumOfAccount()+" account.";
//    }
//    public int getNumOfAccount(){
//        return numOfAccount;
//    }
//    public boolean equals(Customer c){
//        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
//    }
    private String firstName;
    private String lastName;
    ArrayList acct;
    private int numOfAccount;
    
    public Customer(){
        this.firstName = "";
        this.lastName = "";
        ArrayList<Account> acct = new ArrayList<Account>(); //Arraylist = acct = new ArrayList<Account>()
     }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
        
    }
    public String getLastName(){
        return lastName;
    }
    public Account getAccount(int index){
        return (Account) acct.get( index);// acct.get return String
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
    }
  
    public String toString(){
        return "Name : "+this.getFirstName()+" LastName : "+this.getLastName()+" have "+this.getNumOfAccount()+" account.";
    }
    public int getNumOfAccount(){
        return acct.size();
    }
    public boolean equals(Customer c){
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }
    
}
