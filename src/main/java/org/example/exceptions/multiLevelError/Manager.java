package org.example.exceptions.multiLevelError;

import org.example.exceptions.EngineerNotAbleToWorkException;

public class Manager {
    Engineer engineer = new Engineer();

    public String assignTask(int a, int b){
        System.out.println("Manager: giving task to Engineer");

        int d = engineer.doActualCalculation(a, b);

        System.out.println("Manager: Work done by Engineer : " + d);
        return "Hey Client, your answer is " + d;
    }
}

// whenever we say Exception is returned =>
// Exception is thrown to the caller method
