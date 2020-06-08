package by.bobkov.HomeTask.Task10;

import java.util.Scanner;

public class TaskTen {
    private static int previousNumber = 0;
    private static boolean increase = true;
    private static boolean isSame = false;
    private static boolean isAlternating = true;

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваши числа:");

        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                numericalSequence(num);
            }
        }

        System.out.println("Возрастающая ли последовательность чисел? " + increase);
        System.out.println("Имеет ли одинаковые числа? " + isSame);
        System.out.println("Чередуются ли отрицательные и положительные числа? " + isAlternating);
    }

    private static void numericalSequence(int number) {

        if (previousNumber == number) {
            isSame = true;
        }
        if (number < previousNumber) {
            increase = false;
        }
        if ((previousNumber > 0 && number > 0) || (previousNumber < 0 && number < 0)) {
            isAlternating = false;
        }
        previousNumber = number;
    }
}
