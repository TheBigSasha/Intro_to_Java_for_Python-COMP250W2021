package myPackage;

import java.util.Scanner;

public class tester {
    public static void main(String args[]){
        System.out.println(myMethod());
        welcome.myMethod();

        Scanner s = new Scanner(System.in);
        System.out.println("Tell me your name");
        String name = s.nextLine();
    }

    static String myMethod(){
        return "yellow";
    }
}
