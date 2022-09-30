public class Thief extends Person{
    private String name;
    private double money;

    public Thief()
    {

        this("name", 0);
    }

    public Thief(String name, double money)
    {
        //super();
        this.name = name;
        this.money = money;
    }

    public void steal(double money, Person m)
    {
        this.money += ((Billioniare)m).disappear(money);
    }

    public void showMoney()
    {
        System.out.println("I'm a "+ name + " Thief and I have "+ money + ".");
    }
}
