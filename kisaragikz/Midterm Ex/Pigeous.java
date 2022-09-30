public class Pigeous extends Bird{
    public Pigeous(){
        this("", 0);
        this.setPower(150);
    }
    public Pigeous(String name, int age){
        super(name, age);
        this.setPower(150);
    }
    public void eat(Food f){
        this.setPower(f.getPower()*2);
    }
    public void fly(){
        System.out.println(this.getName()+" fly fly ....");
    }
    public void wingAttack(Animal a){
        a.setPower(a.getPower()-5);
    }
    public void wingAttack(Animal a, int times){
        a.setPower(a.getPower()-(5*times));
    }
}
