package ru.habr.sergiosergio;
import java.util.Scanner;

public class App 
{


    public static void main( String[] args )
    {
        Scanner console;
        ArgsChecker argsChecker;
        Calculator calculator;

        

        String arg1;
        String arg2;
        String arg3;
        argsChecker = new ArgsChecker();
        calculator = new Calculator();
        console = new Scanner(System.in);



        
        while(true) {
            arg1 = console.next();
            arg3 = console.next();
            arg2 = console.next();

            try {
                argsChecker.parseArgs(arg1, arg2);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
            try {
                argsChecker.operatorChecker(arg3);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }

            calculator.printResult(argsChecker.getX(), argsChecker.getY(), argsChecker.getOperator(), argsChecker.getIsXRome());
        }

    }



}
