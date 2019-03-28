class Move1{
    void ride(){System.out.println("hello");
    int c =wheels();
        System.out.println("number of wheels"+c);
    }
    int wheels(){int r=20;
        System.out.println("hello ride");
    return r;}
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
public class Cycle2{
    public static void main(String[] args) {
        UniCycle a = new UniCycle();
        Bicycle b = new Bicycle();
        Tricycle c = new Tricycle();
        a.msg();
        b.msg();
        c.msg();
    }
}