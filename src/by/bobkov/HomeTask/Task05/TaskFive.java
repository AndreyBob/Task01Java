package by.bobkov.HomeTask.Task05;

public class TaskFive {
    public static void main(String[] args) {
        sumAndMulti(999);
        permutationOfNumber(912);
        plusThousand(123);

    }
    // суммa и произведение цифр числа;
    public static void sumAndMulti(int n) {
       if (n >= 100 && n <= 999) {
           int s = 0, m = 1;
           for (int i = 0; i < 3; i++) {
               m *= n % 10;
               s += n % 10;
               n /= 10;
           }
           System.out.println("Сумма: " + s);
           System.out.println("Произведение: " + m);
       } else System.out.println("Это не трехзначное число!");
    }

    // число, полученное перестановкой цифр сотен и десятков;
    public static void permutationOfNumber(int n) {
        if (n >= 100 && n <= 999) {
            System.out.println((n % 10) + "" + (n / 10) % 10 + "" + (n / 100));
        } else {
            System.out.println("Это не трехзначное число!");
        }
    }

    // четырехзначное число, полученное приписыванием цифры единиц в качестве цифры тысяч;
    public static void plusThousand(int n) {
        if (n >= 100 && n <= 999) {
            n = 1000 * (n % 10) + n;
            System.out.println(n);
        } else {
            System.out.println("Это не трехзначное число!");
        }
    }
}
