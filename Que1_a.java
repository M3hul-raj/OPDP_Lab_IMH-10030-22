package Assignment8;

class Parent{
    int x = 100;
    void method(){
        System.out.println("In parent class, value of x is : "+x);
    }
    class Child{
        int x = 50;
        void method(){
            System.out.println("In child class, value of x is : "+x);
        }
    }
}

public class Que1_a {
    public static void main(String[] args){
        Parent obj1 = new Parent();
        Parent.Child obj2 = new Parent().new Child();
        obj1.method();
        obj2.method();
    }
}
