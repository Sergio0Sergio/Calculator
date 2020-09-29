package ru.habr.sergiosergio;

public class ArgsChecker {

    static String[] Rome = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
    static String[] Arab = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
    private String arg1;
    private String arg2;

    private Boolean isRome;
    private Boolean isXRome;
    private Boolean isYRome;

    private String operator;

    int x;
    int y;

    public ArgsChecker() {
    }

    public void parseArgs(String arg1, String arg2)throws IllegalArgumentException{


        try {
            x = Integer.parseInt(checkValidArg(arg1, isXRome));

        }catch (IllegalArgumentException e){
            System.err.println("Ошибка ввода.");
            System.exit(1);
        }

        try {
            y = Integer.parseInt(checkValidArg(arg2, isYRome));

        }catch (IllegalArgumentException e){
            System.err.println("Ошибка ввода.");
            System.exit(1);
        }
        if (isXRome!=isYRome){
            throw new IllegalArgumentException("Типы аргументов не совпадают");


        }


    }

    private String checkValidArg(String s, boolean t) throws IllegalArgumentException{

        for (int i = 0; i<Rome.length; i++){
            if (Rome[i].equals(s)){

                t = true;
                return Arab[i];

            }

        }

        for (int i = 0; i<Arab.length; i++){
            if (Arab[i].equals(s)){

                t = false;
                return Arab[i];

            }

        }
        throw new IllegalArgumentException("Введен некорректный аргумент.");

    }

    public boolean operatorChecker(String s) throws IllegalArgumentException{

        switch (s){
            case "1": s.equals("+");
                return true;


            case "2": s.equals("-");
                return true;


            case "3": s.equals("*");
                return true;


            case "4": s.equals("/");
                return true;

        }
        throw new IllegalArgumentException();
    }



    public String getOperator() {
        return operator;
    }
}
