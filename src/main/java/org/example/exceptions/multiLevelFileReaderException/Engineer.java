package org.example.exceptions.multiLevelFileReaderException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Engineer {

    public void doActualFileReading(String fileName) throws IOException {
        System.out.println("Engineer: Reading File " + fileName);
        File file = new File(fileName);
        // either you handle it
        FileReader fileReader = new FileReader(file);
        fileReader.read();
        System.out.println("Engineer: Everything is OK");
    }
    // engineer says, I'll read it.
    // if anything goes wrong, I'll panic => throw exception
}
