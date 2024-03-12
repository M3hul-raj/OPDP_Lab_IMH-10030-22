package Assignment8;

interface Person{
    static int x = 10;
    abstract void method();
}

class Employee implements Person{
    @Override
    public void method(){
        System.out.println("In employee class : "+x);
    }
}
        
public class Que4 {
    public static void main(String[] args){
        Employee p1 = new Employee();
        p1.method();
    }
}
