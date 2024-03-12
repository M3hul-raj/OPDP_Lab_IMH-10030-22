package Assignment8;

class outer{
    void outer_method(){
        System.out.println("In the outer class method");
    }
    static class inner{
        static void inner_method(){
            System.out.println("In the inner class method");
        }
    }
}
public class Que1_c {
    public static void main(String[] args){
        outer obj1 = new outer();        
        obj1.outer_method();
        outer.inner.inner_method();
    }
}
