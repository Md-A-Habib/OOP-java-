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


6️⃣Access Characters
String name = "Habib";

System.out.println(name.charAt(0));

7️⃣Compare String
if(name.equals("Habib"))  // if(name == "Habib")
if(!name.equals("Habib")) // if(name != "Habib")

8️⃣Substring
String name = "Habib";

System.out.println(name.substring(1, 4));

Output: abi

9️⃣Replace character
String name = "Habib";
System.out.println(name.replace('a', 'o'));

Output: Hobib

1️⃣0️⃣ Loop Through String
String name= "Habib";
for(int i=0; i<name.length(); i++){     // size function not work in java
    System.out.println(name.charAt(i));
}

Output:
H
a
b
i
b

All String concept
| Topic            | Syntax / Example               | Meaning                       |
| ---------------- | ------------------------------ | ----------------------------- |
| String creation  | `String name = "Habib";`       | Store text                    |
| Input (word)     | `sc.next();`                   | Take single word input        |
| Input (line)     | `sc.nextLine();`               | Take full sentence input      |
| String length    | `name.length()`                | Count characters              |
| Character access | `name.charAt(i)`               | Get character at index        |
| Index start      | `0,1,2,...`                    | String indexing starts from 0 |
| Compare strings  | `name.equals("Habib")`         | Check equality                |
| Not equal        | `!name.equals("Habib")`        | Check not equal               |
| Wrong compare    | `name == "Habib"`              | compares memory (not value)   |
| Uppercase        | `name.toUpperCase()`           | convert to capital letters    |
| Lowercase        | `name.toLowerCase()`           | convert to small letters      |
| Concatenation    | `"Hello " + name`              | join strings                  |
| Substring        | `name.substring(a,b)`          | extract part of string        |
| Replace          | `name.replace('a','o')`        | replace characters            |
| Loop string      | `for(i=0;i<name.length();i++)` | access each character         |
| Immutable string | cannot change original string  | creates new object            |

*/
