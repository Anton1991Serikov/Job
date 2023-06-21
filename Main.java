import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception { //запускаеться программа void - ничего не возвращает
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        String input = scaner.nextLine();
        System.out.println(calc(input));
        pro(5);
    }
        public static String calc(String input) throws Exception {
            int number1;
            int number2;
            String simvol;
            String[] rew;

            if (input.contains("+")) {
                rew = input.split("\\+");
                simvol = "+";
            } else if (input.contains("-")) {
                rew = input.split("-");
                simvol = "-";
            } else if (input.contains("*")) {
                rew = input.split("\\*");
                simvol = "*";
            } else if (input.contains("/")) {
                rew = input.split("/");
                simvol = "/";
            }
            else {throw new Exception("Используйте символы только +,-,/,*");}

            if (rew.length != 2){throw new Exception("Введи падла 2 числа, а не одно и не 3");}

            number1 = Integer.parseInt(rew[0]); // кладу переменную элемент массива под номером 1
            number2 = Integer.parseInt(rew[1]);

            if (number1 > 10 || number2 > 10){throw new Exception("Введите число от 1 до 10");}

            switch (simvol) {
                case "+":
                    input = String.valueOf(number1 + number2);
                    break;
                case "-":
                    input = String.valueOf(number1 - number2);
                    break;
                case "*":
                    input = String.valueOf(number1 * number2);
                    break;
                case "/":
                    input = String.valueOf(number1 / number2);
                    break;

            }
        return input;

    }
        public static void pro (int pop){

            if (pop > 5) {
                System.out.println("текст");}
           else {
                System.out.println("текст 2");}


        }
}






















