// constructor

class Teacher{ /// create a class
        String name, gender;  // variable
        int phone;

    Teacher( String n, String g, int phn){
        name = n;
        gender =g;
        phone = phn;
    }

        void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: 0" + phone + "\n");
        }
}

public class T4 {
    public static void main(String[] args) {
        Teacher teacher1; //object declare
        teacher1 = new Teacher("Ahsan Habib", "Male", 175776253);   // create object

        System.out.println("Teacher1");
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Sadhin", "Male", 124746); //combine object declaration and creation

        System.out.println("Teacher2");
        teacher2.displayInformation();
    }
}


/*What we learn
Constructor
==>> special type of method that is used to initialize the object
==>> constructor name == class name
==>> no return type
==>> with parameter and without parameter 
==>> automatically called
*/
