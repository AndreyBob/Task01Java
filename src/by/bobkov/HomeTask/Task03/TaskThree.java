package by.bobkov.HomeTask.Task03;



public class TaskThree {
    public static void main(String[] args) {

        mathExample(2,1, -2);
    }

   // Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
    public static void mathExample(double a, double b, double c) {
        if (b < a && b > c) {
            a*=2;
            b*=2;
            c*=2;
        }
        else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }
        System.out.println("a = " + a +"\n" + "b = " + b + " \n" + "c = " + c);
    }
}
