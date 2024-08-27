package org.example.exceptions.multiLevelFileReaderHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Manager {
    Engineer engineer = new Engineer();

    public String readFile(String fileName) {
        try {
            engineer.doActualFileReading(fileName);
            return "Hey Client, File was read Successfully";
        } catch (FileNotFoundException fnfex) {
            System.out.println("Manager: File Not Found");
            return "Hey Client, Not able to read the file, maybe give a correct file name next time";
        } catch (IOException iex){
            System.out.println("Manager: Not able to read file");
            return "Hey Client, Not able to load the file";
        } finally {
            System.out.println("Manager: wrapping up everything");
        }
    }
    // Manager says if the Engineer is not able to complete,
    // I will not panic, I will handle error and reply back to client gracefully.
}
