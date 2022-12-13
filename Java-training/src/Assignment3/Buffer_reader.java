package Assignment3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffer_reader {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("src/Assignment3/input");

            BufferedReader br = new BufferedReader(file);
            System.out.println("Data in the file: ");
            System.out.println(br.readLine());
            br.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }

}
