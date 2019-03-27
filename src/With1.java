
class Over{
     final void show(){System.out.println("hello world");}
}
class OverOut extends Over{
    void show(){System.out.println("this is vivek");}
}
class With1{public static void main(String[] args){
    Over x=new OverOut();
    x.show();}
}