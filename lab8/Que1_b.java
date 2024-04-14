package Assignment8;

class Outer{
    void outer_method(){
        System.out.println("In the outer class method");
        class Inner{
            void inner_method(){
                System.out.println("In the inner class method");
            }
        }
        Inner obj1 = new Inner();
        obj1.inner_method();
    }
}

public class Que1_b {
    public static void main(String[] args){
        Outer obj2 = new Outer();        
        obj2.outer_method();
    }
}
