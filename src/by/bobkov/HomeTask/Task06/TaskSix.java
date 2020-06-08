package by.bobkov.HomeTask.Task06;

public class TaskSix {
    public static void main(String[] args) {

        findNforInt(2,3);
        findNforLong(2,1000);
    }
    // Найдите n, при котором значение Sn выходит за диапазон типов int;
    public static void findNforInt(double a1, double d) {
        double sum;
        double b;
        for (int n = 1; ; n++) {
            b = a1 + d * (n - 1);
            sum = (a1 + b) * n / 2;

                if (sum > Integer.MAX_VALUE) {
                    System.out.println(sum + " " + n);
                    break;
                } else if (sum < Integer.MIN_VALUE) {
                    System.out.println(sum + " " + n);
                    break;
                }
        }
    }
    // Найдите n, при котором значение Sn выходит за диапазон типов long;
    public static void findNforLong(double a1, double d) {
        double sum;
        double b;
        for (int n = 1; ; n++) {
            b = a1 + d * (n - 1);
            sum = (a1 + b) * n / 2;

            if (sum > Long.MAX_VALUE) {
                System.out.println(sum + " " + n);
                break;
            } else if (sum < Long.MIN_VALUE) {
                System.out.println(sum + " " + n);
                break;
            }
        }
    }
}
