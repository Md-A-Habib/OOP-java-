/*Inheritance Introduction
    subclass/extends of a class can access or use their property.
    like here color is a property of class Shape. And this class extends version is Triangle.

    in public class we can use the Shape's property by creating a object of subclass Triangle. And can access the property together.
    */

class Shape{ //base class/ parent class
    String color;
}

class Triangle extends Shape{ // sub-class

}


public class OOP3 {
    public static void main(String args[]){
        Triangle t1 = new Triangle();  // creating object
        t1.color ="red";
    }
}
