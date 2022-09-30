public class Billioniare extends Person{
    private String name;
    private double money;

    public Billioniare()
    {
        this("name", 0);
    }

    public Billioniare(String name, double money)
    {
        this.name = name;
        this.money = money;
    }

    public void benefit(double money)
    {
        this.money += money * 1.2;
    }

    public double disappear(double money)
    {
        if(this.money - money <= 0)
        {
            money = this.money;
            this.money = 0;
            
        }
        else
        {
            this.money -= money;
        }
        return money; 
    }

    public void showMoney()
    {
        System.out.println("I'm a "+ name + " Billionaire and I have "+ money + ".");
    }
}
