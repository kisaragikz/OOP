
public class Main{
    public static void main(String[] args) {
//        Account a1 = new Account(5000, "Sommai");
//        Account a2 = new Account(3000, "Somchai");
//        Account a3 = new Account(900, "Somsri");
//
//        Bank myBank = new Bank();
//        myBank.addAccount(a1);
//        myBank.addAccount(a2);
//        myBank.addAccount(a3);
//
//        System.out.println("Number of Account: " + myBank.getNumAccount());
//        myBank.getAccount(0).showAccount();
//        System.out.println("Deposit 500...");
//        myBank.getAccount(0).deposit(500);
//        myBank.getAccount(0).showAccount();
//        System.out.println("Show all accounts");
//        System.out.println("==============================");
//        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "week9.Account.showAccount()" because the return value of "week9.Bank.getAccount(int)" is null
//	//at week9.Main.main(Main.java:113)
//        for(int i=0; i<myBank.getNumAccount(); i++){//(int i = 0 ; i< mybank.length)
//            if(myBank.getAccount(i) == null){
//                System.out.println( "you don't have over "+i+" account in the bank.");
//                    break;
//            }
//            else{
//                myBank.getAccount(i).showAccount();
//            }
//        }


        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        System.out.println(cust);
        cust.addAccount(new Account(2400, "somsri03"));
        cust.addAccount(new Account(2700, "somsri04"));
        cust.addAccount(new Account(1200, "somsri05"));
        cust.addAccount(new Account(3200, "somsri06"));
        for (int i = 0; i < cust.getNumOfAccount(); i++) { 
//            cust.addAccount(new Account(i+2000,"somsritest"));//index out of bounds
//            cust.getAccount(i).showAccount();
            cust.getAccount(i).withdraw(1000);
            cust.getAccount(i).showAccount();
        }
        System.out.println(cust);
    }
}
