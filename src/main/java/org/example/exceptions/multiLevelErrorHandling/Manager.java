package org.example.exceptions.multiLevelErrorHandling;

public class Manager {
    Engineer engineer = new Engineer();

    public String assignTask(int a, int b){
        try {
            System.out.println("Manager: giving task to Engineer");

            int d = engineer.doActualCalculation(a, b);

            System.out.println("Manager: Work done by Engineer : " + d);
            return "Hey Client, your answer is " + d;
        }
        catch (ArithmeticException e) {
            System.out.println("Manager: Arithmetic Exception occurred");
            System.out.println("Manager: lets return a correct message to Client");
            return "Hey Client, You have given 0 for 2nd parameter";
        }
        finally {
            System.out.println("Manager: Let me just wrap up everything, before getting back to Client");
        }
    }
}
