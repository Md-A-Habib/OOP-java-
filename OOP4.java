/*Type of Inheritance
    1. Single level inheritance

            Base Class
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


public class OOP4 {
    public static void main(String args[]){
        Triangle t1 = new Triangle();

        t1.area();
        t1.area(10, 20);   // direct input
    }
}
