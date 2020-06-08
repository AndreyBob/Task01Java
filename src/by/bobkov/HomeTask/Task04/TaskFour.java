package by.bobkov.HomeTask.Task04;
//Вычислить значение функции

public class TaskFour {
    public static void main(String[] args) {
        double result = resultOfFunc(2);
        System.out.println("Значение функции равно " + result);
    }
    public static double resultOfFunc(double x) {
        double y;
        if (x <= 13) {
            y = -Math.pow(x, 3) + 9;
            return y;
        } else {
            y = - (3/(x + 1));
            return y;
        }

    }
}
