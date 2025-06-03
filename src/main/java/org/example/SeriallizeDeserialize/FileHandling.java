/*
 *  Creating the file in java..
 * 
 */

package org.example.SeriallizeDeserialize;

import java.io.File;
import java.io.FileWriter;


public class FileHandling {
    public static void main(String[] args) throws Exception {
        File f = new File("Sample.txt");


        FileWriter writer = new FileWriter(f);
        writer.write("Hello from javaScript");

        writer.close();

        // if (f.exists() == true)
        //     System.out.println("File is present");
        // else 
        //     System.out.println("File not found");
        //     f.createNewFile();
    }

}
