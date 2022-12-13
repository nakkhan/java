package Assignment1;

public class for_loop {

    public static void main(String args[]) {

        // outer loop
        for (int i = 1; i <= 5; ++i) {
         //   System.out.print("*");

            // inner loop
            for (int j = 1; j <=i; ++j) {
                // codes
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
