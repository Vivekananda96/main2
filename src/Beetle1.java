
class Insect {
    private int i = 9;
    int j;
    Insect() {
        System.out.print("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 =
            printInit("static Insect.x1 initialized");
    static int printInit(String s) {

        System.out.print(s);
        return 47;
    }
}
public class Beetle1 extends Insect {
    private int k = printInit("Beetle.k initialized");
    public static void done(){
        System.out.print("hello world");
    }
    public Beetle1() {
        System.out.print("k = " + k);
        System.out.print("j = " + j);
    }
    private static int x2 =
            printInit("static Beetle.x2 initialized");
    public static void main(String[] args) {
        System.out.print("Beetle constructor");
        Beetle1.done();
    }
}