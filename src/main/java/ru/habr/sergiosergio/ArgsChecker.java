package ru.habr.sergiosergio;

public class ArgsChecker {

    static String[] Rome = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
    static String[] Arab = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
    private String arg1;
    private String arg2;

    private Boolean isXRome;
    private Boolean isYRome;

    private String operator;

    int x;
    int y;

    public ArgsChecker() {
    }

   public void parseArgs(String arg1, String arg2)throws IllegalArgumentException{
        this.arg1 = arg1;
        this.arg2 = arg2;

        try {
            x = Integer.parseInt(checkValidArg(arg1, 0));

        }catch (IllegalArgumentException e){
            System.err.println("Ошибка ввода.");
            System.exit(1);
        }

        try {
            y = Integer.parseInt(checkValidArg(arg2, 1));

        }catch (IllegalArgumentException e){
            System.err.println("Ошибка ввода.");
            System.exit(1);
        }
        if (isXRome!=isYRome){
            throw new IllegalArgumentException("Типы аргументов не совпадают");


        }


    }

    private String checkValidArg(String s, int a) throws IllegalArgumentException{


        for (int i = 0; i<Rome.length; i++){
            if (Rome[i].equals(s)){
                if (a==0) {
                    isXRome = true;
                }else {
                    isYRome = true;
                }
                return Arab[i];

            }

        }

        for (int i = 0; i<Arab.length; i++){
            if (Arab[i].equals(s)){
                if (a==0){
                    isXRome = false;
                }else {
                    isYRome = false;
                }
                return Arab[i];

            }

        }
        throw new IllegalArgumentException("Введен некорректный аргумент.");

    }

    public void operatorChecker(String s) throws IllegalArgumentException{

        if (s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")) {
            operator = s;

        }else{
            throw new IllegalArgumentException();
        }

    }



    public String getOperator() {
        return operator;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public boolean getIsXRome() {
        return isXRome;
    }
}
