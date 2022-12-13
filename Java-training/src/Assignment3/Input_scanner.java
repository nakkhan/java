package Assignment3;

import java.util.Scanner;

public class Input_scanner {

    public static void main(String args[]){

        String input;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter word");
        input= Sc.nextLine();

        if (input.contains("i")){
            System.out.println("The word contains I");
        }
        else{
            System.out.println("The word does not contains I");
        }

    }


}
