package org.example.exceptions.multiLevelFileReaderException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Manager {
    Engineer engineer = new Engineer();

    public String readFile(String fileName) throws IOException {
        // either you handle it over here,
        // OR inform the client that I can also throw exceptions.
        engineer.doActualFileReading(fileName);
        return "Hey Client, File was read Successfully";
    }
    // if engineer is unable to complete work
    // manager will also panic => throw IOException above
}
