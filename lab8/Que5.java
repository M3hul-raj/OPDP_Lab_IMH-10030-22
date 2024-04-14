package Assignment8;

class Base1{
    abstract class Base2{
        abstract void display();
    }
}
class Derived1 extends Base1{
    class Derived2 extends Base2{
    void display(){
        System.out.println("In the nested class of derived 1 and derived 2.");
    }
    }
}

public class Que5 {
     public static void main(String[] args){
        Derived1.Derived2 obj1 = new Derived1().new Derived2();
        obj1.display();
    }
}
