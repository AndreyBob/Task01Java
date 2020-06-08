package by.bobkov.HomeTask.Task08;

public class TaskEight {
    public static void main(String[] args) {

        calculateFunc(1,30,7 );
    }
    // Вычислить значения функции на отрезке [a,b] c шагом h;
    public static void calculateFunc(double a, double b, double h) {
        double x;
        double y;
        final int c = 2;
        x = a;
        while (b >= x) {
          if(x == 15) {
              y = (x + c) * 2;
              System.out.println(y + "\n");
          } else {
              y = (x - c) + 6;
              System.out.println(y + "\n");
          }
            x +=h;
        }

    }
}
