package CalculatorSetterGetter;

/**
 * Created by alser on 23.03.2017.
 */
public class Division {

    public static double division(double ch1, double ch2) {
        if (ch2 != 0) {
            return ch1 / ch2;
        } else {
            System.out.println("На ноль делить нельзя!");

            return Double.parseDouble(null);
        }
    }
}
