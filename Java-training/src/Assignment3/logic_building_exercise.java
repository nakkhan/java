package Assignment3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class logic_building_exercise {

    public static void main(String args[]) {

        int a;
        int b;
        int c;
        // c = a*b;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = Integer.parseInt(sc.nextLine());
        for (b = 1; b <= 10; b++) {
            c = a * b;
            System.out.println(a +"x" + b + "=" + c);

        }
      //  System.out.println(c);


}}
