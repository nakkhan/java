package Assignment3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Copy_files {

    public static void main(String args[]) {

        int  num = 1;
        num = num++;

        File source = new File("src/Assignment3/input");
        File dest = new File("nabeel"+  num + ".txt");

        try {
            Files.copy(source.toPath(), dest.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File has been transferred successfully");

    }
}