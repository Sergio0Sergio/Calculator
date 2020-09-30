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
        String arg1 = "";
        String arg2 = "";
        String operatop = "";
        
        App app = new App();
        console = new Scanner(System.in);
        argsChecker = new ArgsChecker();
        calculator = new Calculator();
        
        while(true){
        arg1 = console.next();
        operator = console.next();
        arg2 = console.next();
        
        argsChecker.parseArgs(arg1, arg2);
        argsChecker.operatorChecker(operator);
        }

    }



}
