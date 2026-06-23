// remember in a file have only one public class
class Teacher{ /// create a class
    // variable and method or nothing
        String name, gender;  // variable
        int phone;
}

public class T1 {
    public static void main(String[] args) {
        Teacher teacher1; //object declare
        teacher1 = new Teacher();   // create object

        teacher1.name = "Ahsan Habib"; //using class assign value on those variable that we create in the Teacher class
        teacher1.gender = "Male";
        teacher1.phone =175733;

        System.out.println("Teacher1");
        System.out.println("Name: " + teacher1.name);
        System.out.println("Gender: " + teacher1.gender);
        System.out.println("Phone: 0" + teacher1.phone + "\n");


        Teacher teacher2 = new Teacher(); //combine object declaration and creation
        
        teacher2.name = "Sadhin"; //using class assign value on those variable that we create in the Teacher class
        teacher2.gender = "Male";
        teacher2.phone =1733;

        System.out.println("Teacher2");
        System.out.println("Name: " + teacher2.name);
        System.out.println("Gender: " + teacher2.gender);
        System.out.println("Phone: 0" + teacher2.phone + "\n");

    }
}
