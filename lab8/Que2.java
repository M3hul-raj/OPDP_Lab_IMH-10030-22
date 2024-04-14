package Assignment8;


abstract class Bike{
    abstract void run();
}
class Honda extends Bike{
    void run(){
        System.out.print("In Honda class");
    }
}

public class Que2 {
    public static void main(String[] args){
        Bike h1 = new Honda();
        h1.run();
    }
}
