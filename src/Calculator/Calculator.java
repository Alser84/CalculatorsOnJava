package Calculator;

import java.util.Scanner;
/*
    Это простой калькулятор
 */

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Здравствуйте! Введите два числа");
        Scanner scanner = new Scanner(System.in);
        double ch1 = scanner.nextDouble(); //Вводим первое число
        double ch2 = scanner.nextDouble(); //Вводим второе число

        System.out.println("Введите операцию(-,+,*,/): "); //Предлагаем математические операции на выбор
        String result = scanner.next();

        switch (result) {
            case "+": {
                double results = ch1 + ch2;
                System.out.println("Складываем числа, результат: " + results);
                break;
            }
            case "-": {
                double results = ch1 - ch2;
                System.out.println("Вычитаем числа, результат: " + results);
                break;
            }
            case "*": {
                double results = ch1 * ch2;
                System.out.println("Умножаем числа, результат: " + results);
                break;
            }
            case "/": {
                if (ch2 != 0) {
                    double results = ch1 / ch2;
                    System.out.println("Делим числа, результат: " + results);
                    break;
                } else System.out.println("На ноль делить нельзя");
            }
            default:
                System.out.println("Ошибка выбора математической операции");
        }
    }
}
