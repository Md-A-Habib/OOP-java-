/*Type of Inheritance
    1. Single level
    2. Multi-level
    3.Hierarchial Inheritance

         ⬅️Base Class➡️
        ⬇️             ⬇️
        ⬇️             ⬇️
        ⬇️             ⬇️
    Derived Class    Derived Class
                
               

     */

class Shape{
    public void area(){  // base class
        System.out.println("Display area");
    }
}

class Triangle extends Shape{ // derive class of base class
    public void area(int l, int h){
        System.out.println("Triangle: "+0.5*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println("Circle: "+ (3.14)*r*r);  
    }
}


public class OOP6 {
    public static void main(String args[]){
       Triangle t1 = new Triangle();
        Circle c1 = new Circle();

        t1.area();          // from Shape class
        t1.area(10, 20);    // direct input

        c1.area();          // from Shape class
        c1.area(7);         // direct input
    }
} 
