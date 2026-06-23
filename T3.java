class Teacher{ /// create a class

        String name, gender;  // variable
        int phone;

        void setInformation(String n, String g, int phn){// method
            name =n;
            gender = g;
            phone = phn;
        }

        void displayInformation(){ //method
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: 0" + phone + "\n");
        }
}

public class T3 {
    public static void main(String[] args) {
        Teacher teacher1; //object declare
        teacher1 = new Teacher();   // create object

        System.out.println("Teacher1");
        teacher1.setInformation("Ahsan Habib", "Male", 175776253);
        teacher1.displayInformation(); // method call

        Teacher teacher2 = new Teacher(); //combine object declaration and creation

        System.out.println("Teacher2");
        teacher2.setInformation("Sadhin", "Male", 124746);
        teacher2.displayInformation();
    }
}

/*what we learn
=>> Declation of method
=>> using of method by passing parameter
 */
