class Pen{ // feature of the object
    String color;
    String type; //ballpoint or Gel

    public void write(){ // that's what the object perform
    System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color); //"this" is a keyword of java. this will say which object call the function
    }
}


class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    /*  Three type of constructor in java
            1. Non-parameter constructor
            2. With parameter constructor
            3. copy constructor
    */
   
    Student(){ //non-parameter constructor
        System.out.println("constructor called");
    }// without this constructor code will run becasue by default java will perform the task of that constructor if we don't write it.
}

public class OOP1 {
    public static void main(String args[]){
     /*
        Pen pen1 = new Pen(); // creating object
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2= new Pen();
        pen2.color ="Black";
        pen2.type ="Ballpoint";

        pen1.printColor();
        pen2.printColor();
    */
        Student s1 = new Student();
        s1.name = "Habib";
        s1.age =22;

        s1.printInfo();
    }
}
