import java.util.*;
class Shape {
    public void draw() {}
    public void erase() {}
}
class Circle extends Shape {
    public void draw() { System.out.println("Circle.draw()"); }
    public void erase() { System.out.println("Circle.erase()"); }
}

class Square extends Shape {
    public void draw() { System.out.println("Square.draw()"); }
    public void erase() { System.out.println("Square.erase()"); }
}
class Triangle extends Shape {
    public void draw() { System.out.println("Triangle.draw()"); }
    public void erase() { System.out.println("Triangle.erase()"); }
}
class Rectangle extends Shape {
    public void draw() {
        System.out.println("rectangle.draw()");
    }

    public void erase() {
        System.out.println("rectangle.erase()");
    }
}class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch(rand.nextInt(4)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            case 3: return new Rectangle();
        }
    }
}
public class Shapes2{
    private static RandomShapeGenerator gen =
            new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];

        for(int i = 0; i < s.length; i++){
            s[i] = gen.next();}

        for(Shape shp : s){
            shp.draw();



        }
        Shape a=new Circle();
        Shape b=new Triangle();
        Shape c=new Square();
        Shape d=new Rectangle();
        a.draw();
        b.draw();
        c.draw();
        d.draw();
    }
}