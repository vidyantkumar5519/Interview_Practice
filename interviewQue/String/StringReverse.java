// import java.util.Scanner;
// public class StringReverse {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter string:");
//         String str = sc.nextLine();
//         String reverse = new StringBuilder(str).reverse().toString();
//         System.out.println("Reversed String: " + reverse);
//     }
// }

import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any String");
    String str = sc.nextLine();
    String Reverse = new StringBuilder(str).reverse().toString();
    System.out.println("Reversed String: " + Reverse);
}
}