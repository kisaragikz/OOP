public class Main {
    public static void main(String[] args) {
        Billioniare b = new Billioniare("Josh", 10000);
        Thief t = new Thief("XXX", 0);
        b.benefit(100);
        b.showMoney();
        t.showMoney();

        t.steal(50000, b);
        b.showMoney();
        t.showMoney();
        
    }
}
