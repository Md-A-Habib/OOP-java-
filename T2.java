class Teacher{ /// create a class
    // variable and method or nothing
        String name, gender;  // variable
        int phone;

        void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: 0" + phone + "\n");
        }
}

public class T2 {
    public static void main(String[] args) {
        Teacher teacher1; //object declare
        teacher1 = new Teacher();   // create object

        teacher1.name = "Ahsan Habib"; //using class assign value on those variable that we create in the Teacher class
        teacher1.gender = "Male";
        teacher1.phone =175733;

        System.out.println("Teacher1");
        teacher1.displayInformation();


        Teacher teacher2 = new Teacher(); //combine object declaration and creation
        teacher2.name = "Sadhin"; //using class assign value on those variable that we create in the Teacher class
        teacher2.gender = "Male";
        teacher2.phone =1733;

        System.out.println("Teacher2");
        teacher2.displayInformation();
    }
}

/*what we learn
=>> Declation of method
=>> using of method
 */
