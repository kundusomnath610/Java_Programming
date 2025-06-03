package org.example.SeriallizeDeserialize;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File f = new File("Sample.txt");
        if (f.exists() == true)
            System.out.println("File is present");
        else 
            System.out.println("File not found");
            f.createNewFile();
    }

}
