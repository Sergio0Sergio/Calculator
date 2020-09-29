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
        //ArgsConverter argsConverter = new ArgsConverter();
        String firstArgument;
        String secondArgument;
        boolean isFirstArgumentRome;
        boolean isSecondArgumentRome;
        boolean isOperatorValid;

        App app = new App();
        argsChecker = new ArgsChecker();
        //argsConverter = new ArgsConverter();
        argsChecker.parseArgs(args[0], args[2]);


        argsChecker.operatorChecker(args[1]);

    }



}
