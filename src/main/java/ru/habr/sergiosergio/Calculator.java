package ru.habr.sergiosergio;

public class Calculator {

    public void printResult(int x, int y, String operator, boolean type) {
        if (type) {
            System.out.println(convert(calculate(x, y, operator)));
        } else {
            System.out.println(calculate(x, y, operator));
        }
    }

    private int calculate(int x, int y, String operator) {

        if (operator.equals("+"))
            return x + y;

        if (operator.equals("-"))
            return x - y;

        if (operator.equals("*"))
            return x * y;

        if (operator.equals("/"))
            return x / y;

        return 999;
    }

    private String convert(int x) {

        if (x == 0) {
            return "Nulla";
        }

        String s = "";

        if (x < 0) {
            s += "minus ";
            x = Math.abs(x);
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
