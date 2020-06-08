package by.bobkov.HomeTask.Task07;

public class TaskSeven {
    public static void main(String[] args) {
        double b = swapDouble(123.456);
        System.out.println(b);
    }
    // Поменять местами дробную и целую части числа и вывести полученное значение числа.
    public static double swapDouble(double a) {
        double y;
        y = (a * 1000) % 1000 + (int) a / 1000.0;
        return y;
    }
}
