
package Assignment8;

abstract class Shape{
    abstract void perimeter();
    abstract void area();
}

class Circle extends Shape{
    int radius;
    void area(){
        double ar = 3.141*radius*radius;
        System.out.println("Area of circle is : "+ar);
    }
    void perimeter(){
        double pe = 2*3.141*radius;
        System.out.println("perimeter of circle is : "+pe);
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;
    void area(){
        int a = length*breadth;
        System.out.println("Area of rectangle is : "+a);
    }
    void perimeter(){
        int p = 2*(length + breadth);
        System.out.println("perimeter of rectangle is : "+p);
    }
}

public class Que3 {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.length = 4;
        r1.breadth = 2;
        r1.area();
        r1.perimeter();
        
        Circle c1 = new Circle();
        c1.radius = 5;
        c1.area();
        c1.perimeter();
    }
}
