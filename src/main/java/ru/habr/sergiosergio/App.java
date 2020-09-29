package ru.habr.sergiosergio;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        ArgsChecker argsChecker = new ArgsChecker();
        Calculator calculator = new Calculator();
        String firstArgument;
        String secondArgument;
        boolean isFirstArgumentRome;
        boolean isSecondArgumentRome;
        boolean isOperatorValid;

        App app = new App();



        argsChecker.parseArgs(args[0], args[2]);


        argsChecker.operatorChecker(args[1]);


    }



}
