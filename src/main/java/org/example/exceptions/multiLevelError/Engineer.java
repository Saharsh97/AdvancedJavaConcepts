package org.example.exceptions.multiLevelError;

import org.example.exceptions.EngineerNotAbleToWorkException;

import java.io.IOException;

public class Engineer {

    public int doActualCalculation(int a, int b) {
        System.out.println("Engineer: Got values " + a + " and " + b);
        System.out.println("Engineer: doing actual hard work");

        int d = a / b;

        System.out.println("Engineer: hard work done, result is " + d);
        return d;
    }
}
