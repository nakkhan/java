package Assignment3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.sql.SQLOutput;

public class Create_file {

    public static void main(String[] args) {
        int num = 1;
        num = num++;
        try {
            FileWriter fw = new FileWriter("New_file" + num + ".txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.println("A new text file has been added");
            System.out.println("New file has been created successfully in the root directory with name New_file" + num);

        }
        catch (IOException e)
        {
            System.out.println("Error!");

        }
    }


}
