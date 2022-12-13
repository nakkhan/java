package Assignment3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Try_with_resource {

    public static void main(String args[]) {

        try (
                FileOutputStream fs = new FileOutputStream("src/Assignment3/input")) {


            String msg = "Java 3rd Assignment";
            byte byteArray[] = msg.getBytes();
            fs.write(byteArray);
            System.out.println("Message written to file successfuly!");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}