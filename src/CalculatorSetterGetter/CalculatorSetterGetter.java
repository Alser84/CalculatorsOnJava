package CalculatorSetterGetter;

import java.util.Scanner;

/**
 * Created by alser on 23.03.2017.
 */
public class CalculatorSetterGetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input inputNumbers = new Input();
        inputNumbers.text();
        double ch1 = inputNumbers.setNumeric1(scanner.nextDouble()); //Вводим первое число
        double ch2 = inputNumbers.setNumeric2(scanner.nextDouble()); //Вводим второе число
        System.out.print("Введите операцию(-,+,*,/): "); //Предлагаем математические операции на выбор
        String result = scanner.next();

        switch (result) {
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
                break;
            }
            default:
                System.out.println("Ошибка выбора математической операции");
        }
    }

}

