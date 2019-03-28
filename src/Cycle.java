class Move1{
    void ride(){System.out.println("hello");}
}
class UniCycle extends Move1{public void msg(){
    super.ride();
}}
class Bicycle extends Move1 {public void msg(){
        super.ride();
}}
class Tricycle extends Move1{
    public void msg() {
        super.ride();
    }
}
public class Cycle{
    public static void main(String[] args) {
        UniCycle a = new UniCycle();
        Bicycle b = new Bicycle();
        Tricycle c = new Tricycle();
        a.msg();
        b.msg();
        c.msg();
    }
}