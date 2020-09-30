package ru.habr.sergiosergio;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        Scanner console;
        ArgsChecker argsChecker;
        Calculator calculator;

        
        //App app = new App();
        String arg1;
        String arg2;
        String arg3;
        argsChecker = new ArgsChecker();
        calculator = new Calculator();
        console = new Scanner(System.in);



        
        //while(true){
        arg1 = console.next();
        arg3 = console.next();
        arg2 = console.next();
        
        argsChecker.parseArgs(arg1, arg2);
        argsChecker.operatorChecker(arg3);
        calculator.printResult(argsChecker.getX(), argsChecker.getY(), argsChecker.getOperator(), argsChecker.getIsXRome());
        //}

    }



}
