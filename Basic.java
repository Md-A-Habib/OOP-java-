/* This is fully focused on Basic syntax and Java Basic

1️⃣Java
    Apps
    Software
    Websites
    Android apps

public class Basic {

    public static void main(String[] args) {

        System.out.println("Hello");

    }
}


2️⃣public class Basic {

}

Here, class = box/container

Java keeps everything inside this box.


3️⃣Print

System.out.println();

Example: 
public class Basic{
    public static void main(String args[]){    Or, (String[] args) both same
        String name = "Habib";
        System.out.println(name);
    }
}


4️⃣Scanner

import java.until.Scanner;

public class Basic{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int age;

        age =sc.nextInt();
    }
}

Scanner sc = new Scanner(System.in);
👉 sc is an input machine.

Different Input Types:

| Java Input      | Meaning   |
| --------------- | --------- |
| sc.nextInt()    | Integer   |
| sc.nextDouble() | Decimal   |
| sc.next()       | One word  |
| sc.nextLine()   | Full line |


Complete Example:

import java.until.Scanner;

public class Basic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        double val;

        name= sc.nextLine(); // Ahsan Habib
        age = sc.nextInt(); //22
        val= nextDouble(); //3.14

        System.out.println(name+" "+age+" "+ val);
    }
}

👉 + is for multiple output in one line


5️⃣ Function use

Example:1
public class Basic{
    static void student(String name, int age) {

        System.out.println(name + " " + age);

    }

    public static void main(String args[]){
        student("Habib", 20);
    }
}

Example:2
public class Basic{
    static int sum(int a, int b){
        return a+b;
    }

    public static void main(String args[]){
        int ans = sum(10,20);
        System.out.println(ans);
    }
}

Example:3
import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {

        return a + b;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(sum(x, y));

    }
}
*/
