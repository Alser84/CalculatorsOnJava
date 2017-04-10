package CalculatorSetterGetter;

/**
 * Created by alser on 23.03.2017.
 */
public class Input implements PrintTextInfo {

    public void text() {
        System.out.println("Здравствуйте! Введите два числа");
    }

    private double ch1, ch2;

    public double setNumeric1(double num1) {
        ch1 = num1;
        return num1;
    }

    public double setNumeric2(double num2) {
        ch2 = num2;
        return num2;
    }

    public double getCh1() {
        return ch1;
    }

    public double getCh2() {
        return ch2;
    }
}
