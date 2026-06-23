// constructor overloading

class Teacher {
    String name, gender;
    int phone;

    Teacher(){
        System.out.println("No Info \n");
    }

    Teacher(String n, String g){
        name = n;
        gender = g;
    }
    
    Teacher(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }

    void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: 0" + phone + "\n");
    }
}
public class T5 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        
        System.out.println("Teacher2");
        Teacher teacher2 = new Teacher("Ahsan", "Male");
        teacher2.displayInformation();

        System.out.println("Teacher3");
        Teacher teacher3 = new Teacher("Ahsan", "Male", 76342786);
        teacher3.displayInformation();
    }
}
