package Assignment2;

import java.util.Scanner;

public class test {


        public static void main(String[] args) {
            String input;
            Scanner Sc = new Scanner(System.in);
          //  Scanner Sc = new Scanner(System.in);
            System.out.println("Enter number");
            input= Sc.nextLine();

            if (input.contains("i")){
                System.out.println("the word contains I");
            }
            else{
                System.out.println("not contains I");
            }

        }
    }
