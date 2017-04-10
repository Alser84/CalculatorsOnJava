package CalculatorWithMethods;

import java.util.Scanner;
/*
    Это простой калькулятор
 */

public class CalculatorWithMethodsMain {

    public static void main(String[] args) {
        System.out.println("Здравствуйте! Введите два числа");
        Scanner scanner = new Scanner(System.in);
        double ch1 = scanner.nextDouble(); //Вводим первое число
        double ch2 = scanner.nextDouble(); //Вводим второе число

        System.out.println("Введите операцию(-,+,*,/): "); //Предлагаем математические операции на выбор
        String result = scanner.next();

        switch (result) { //Выполняем арифметические действия с помощью методов
            case "+": {
                System.out.println("Складываем числа, результат: " + Addition.addition(ch1, ch2));
                break;
            }
            case "-": {
                System.out.println("Вычитаем числа, результат: " + Subtraction.subtraction(ch1, ch2));
                break;
            }
            case "*": {
                System.out.println("Умножаем числа, результат: " + Multiplication.multiplication(ch1, ch2));
                break;
            }
            case "/": {
                System.out.println("Делим числа, результат: " + Division.division(ch1, ch2));
            }
            default:
                System.out.println("Ошибка выбора математической операции");
        }
    }
}

