/*Type of Inheritance
    1. Single level inheritance
    2. Multi level Inheritance

            Base Class
                ⬇️
                ⬇️
                ⬇️
            Derived Class
                ⬇️
                ⬇️
                ⬇️
            Derived Class                
     */

class Shape{
    public void area(){  // base class
        System.out.println("Display area");
    }
}

class Triangle extends Shape{ // derive class
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
public class OOP5 {
    public static void main(String args[]){
       EquilateralTriangle t1 = new EquilateralTriangle();

        t1.area();            // from Shape class
        t1.area(10, 20);      // direct input
    }
}
