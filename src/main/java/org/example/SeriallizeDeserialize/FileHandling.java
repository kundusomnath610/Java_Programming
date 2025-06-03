/*
 *  Creating the file in java..
 * 
 */

package org.example.SeriallizeDeserialize;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class FileHandling {
    public static void main(String[] args) throws Exception {
        File f = new File("Sample.txt");

        FileReader read = new FileReader(f);
        int ch = 0;

        while ((ch = read.read()) != -1) {
            System.out.println((char)ch);
        }

        read.close();


        // FileWriter writer = new FileWriter(f, true);
        // writer.write("\nHello from C++");

        // writer.close();

        
    }

}


/*
 * // if (f.exists() == true)
    //     System.out.println("File is present");
        // else 
        //     System.out.println("File not found");
        //     f.createNewFile();
 * 
 */
