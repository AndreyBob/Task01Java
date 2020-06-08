package by.bobkov.HomeTask.Task02;

public class TaskTwo {
    private static int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        System.out.println(getDayAndMonth(60));
    }


    private static String getDayAndMonth(int day) {
        if (day < 0) {
            return "Такого дня не существует!";
        }
        else {
            int month;
            for (month = 0; day > months[month]; month++) {
                day -= months[month];
            }
            return "День - " + day + "," + " Номер месяца - " + (month + 1);
        }
    }
}
