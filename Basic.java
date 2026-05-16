/* This is fully focused on Basic syntax and Java Basic

1️⃣Java
    Apps
    Software
    Websites
    Android apps

public class Basic {

    public static void main(String args[]) {

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



import java.util.*;   // Scanner, Arrays, ArrayList, Vector, Collections

public class Basic {

    // ---------- METHOD / FUNCTION ----------
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // ---------- INPUT ----------
        Scanner sc = new Scanner(System.in);

        // ---------- VARIABLES ----------
        int x = 10;
        double d = 3.5;
        char ch = 'A';
        boolean ok = true;
        String name = "Habib";

        // ---------- OUTPUT ----------
        System.out.println("Hello Java"); // print with new line
        System.out.print("Same Line ");   // print without new line
        System.out.println("Output");

        // ---------- OPERATORS ----------
        System.out.println(x + 5); // addition
        System.out.println(x - 5); // subtraction
        System.out.println(x * 2); // multiplication
        System.out.println(x / 2); // division
        System.out.println(x % 3); // remainder

        // ---------- COMPARISON ----------
        System.out.println(x > 5);   // true
        System.out.println(x == 10); // true
        System.out.println(x != 5);  // true

        // ---------- IF ELSE ----------
        if(x % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        // ---------- FOR LOOP ----------
        for(int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        // ---------- WHILE LOOP ----------
        int i = 0;

        while(i < 3) {
            System.out.println(i);
            i++;
        }

        // ---------- METHOD CALL ----------
        System.out.println(sum(5, 10));

        // =========================================================
        // ====================== STRING ===========================
        // =========================================================

        String s = "Habib";

        System.out.println(s.length());          // string length
        System.out.println(s.charAt(0));         // first character
        System.out.println(s.toUpperCase());     // uppercase
        System.out.println(s.toLowerCase());     // lowercase
        System.out.println(s.substring(1,4));    // substring
        System.out.println(s.replace('a','o'));  // replace character
        System.out.println(s.contains("bi"));    // check substring
        System.out.println(s.indexOf('b'));      // first index
        System.out.println(s.isEmpty());         // empty or not

        // string compare
        if(s.equals("Habib")) {
            System.out.println("Matched");
        }

        // not equal
        if(!s.equals("Ali")) {
            System.out.println("Not Equal");
        }

        // =========================================================
        // ======================= ARRAY ===========================
        // =========================================================

        int[] arr = {5, 2, 9, 1};

        System.out.println(arr.length); // array size

        System.out.println(arr[0]); // first element

        // loop through array
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        System.out.println();

        // sort array
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        // fill array with same value
        Arrays.fill(arr, 0);

        System.out.println(Arrays.toString(arr));

        // =========================================================
        // ===================== ARRAYLIST =========================
        // =========================================================

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // insert
        list.add(20);
        list.add(30);

        System.out.println(list);

        System.out.println(list.get(1)); // access element

        list.set(1, 50); // update

        System.out.println(list);

        list.remove(0); // delete element

        System.out.println(list);

        System.out.println(list.size()); // size

        System.out.println(list.contains(50)); // check exists

        System.out.println(list.isEmpty()); // empty or not

        Collections.sort(list); // sort

        System.out.println(list);

        Collections.reverse(list); // reverse

        System.out.println(list);

        // enhanced for loop
        for(int val : list) {
            System.out.println(val);
        }

        // =========================================================
        // ======================== VECTOR =========================
        // =========================================================

        Vector<Integer> v = new Vector<>();

        v.add(100); // insert
        v.add(200);
        v.add(300);

        System.out.println(v);

        System.out.println(v.get(0)); // access

        v.set(0, 500); // update

        System.out.println(v);

        v.remove(1); // delete

        System.out.println(v);

        System.out.println(v.size()); // size

        Collections.sort(v); // sort

        System.out.println(v);

        Collections.reverse(v); // reverse

        System.out.println(v);

        // =========================================================
        // ================= BREAK & CONTINUE ======================
        // =========================================================

        for(int k = 1; k <= 5; k++) {

            if(k == 3) {
                continue; // skip 3
            }

            if(k == 5) {
                break; // stop loop
            }

            System.out.println(k);
        }

    }
}
