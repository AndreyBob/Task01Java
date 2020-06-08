package by.bobkov.HomeTask.Task01;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(mathExample(0,2,2));
    }

    public static double mathExample(double a, double b, double c) {
        if (a == 0) {
            return 0;
        }
        double result;
        result = (b + sqrt(pow(b, 2) + 4*a*c)) / (2*a) - (pow(a, 3) *c) + pow(b, -2);
        return result;
    }
}
