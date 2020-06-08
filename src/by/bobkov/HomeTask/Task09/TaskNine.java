package by.bobkov.HomeTask.Task09;

public class TaskNine {
    // Вычислить: (1+2) * (1+2+3) * ... * (1+2+...+10).
    public static void main(String[] args) {
        int sum = 1;
        long result = 1;
        int i = 2;
        while( i < 11 )
        {
            sum += i;
            result *= sum;
            i++;
        }

        System.out.println(result);
    }
}
