package Assignment8;

interface INT{
    final int x = 10;
    static void method1(){
        System.out.println("In the method1");
    }
    default void method2(){
        System.out.println("In the method2");
    }
}
class CLA implements INT{
    
}

public class Que8 {
    public static void main(String[] args){
        INT c1 = new CLA();
        c1.method2();
        INT.method1();
        System.out.println(c1.x);
        
    }
}
