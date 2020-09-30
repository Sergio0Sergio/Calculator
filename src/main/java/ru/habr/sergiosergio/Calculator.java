package ru.habr.sergiosergio;

public class Calculator {

    public void printResult(int x, int y, String operator, boolean type){
        if (type){
            System.out.println(convert(calculate(x, y, operator)));
        }
        else {
            System.out.println(calculate(x, y, operator));
        }
    }
    private int calculate(int x, int y, String operator){

        switch (operator){
            case "1": operator.equals("+");

                return x+y;



            case "2": operator.equals("-");
                return x-y;



            case "3": operator.equals("*");
                return x*y;



            case "4": operator.equals("/");
                return x/y;


            default:
                return 999;

        }
    }

    private String convert(int x){
        
        if(x == 0){
            return "Nulla";
        }
        
        String s = "";
        
        if(x < 0){
         s += "minus ";
         x = Math.abs(x);   
        }
        
        while (x >= 1000) {
            s += "M";
            x -= 1000;        }
        while (x >= 900) {
            s += "CM";
            x -= 900;
        }
        while (x >= 500) {
            s += "D";
            x -= 500;
        }
        while (x >= 400) {
            s += "CD";
            x -= 400;
        }
        while (x >= 100) {
            s += "C";
            x -= 100;
        }
        while (x >= 90) {
            s += "XC";
            x -= 90;
        }
        while (x >= 50) {
            s += "L";
            x -= 50;
        }
        while (x >= 40) {
            s += "XL";
            x -= 40;
        }
        while (x >= 10) {
            s += "X";
            x -= 10;
        }
        while (x >= 9) {
            s += "IX";
            x -= 9;
        }
        while (x >= 5) {
            s += "V";
            x -= 5;
        }
        while (x >= 4) {
            s += "IV";
            x -= 4;
        }
        while (x >= 1) {
            s += "I";
            x -= 1;
        }
        return s;
    }

}
