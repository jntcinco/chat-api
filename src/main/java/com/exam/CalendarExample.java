package com.exam;

import java.io.*;
import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.YEAR, year);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        String dayString = "";

        if (dayOfWeek == Calendar.SUNDAY) {
            dayString = "SUNDAY";
        } else if (dayOfWeek == 2) {
            dayString = "MONDAY";
        } else if (dayOfWeek == 3) {
            dayString = "TUESDAY";
        } else if (dayOfWeek == 4) {
            dayString = "WEDNESDAY";
        } else if (dayOfWeek == 5) {
            dayString = "THURSDAY";
        } else if (dayOfWeek == 6) {
            dayString = "FRIDAY";
        } else if (dayOfWeek == 7) {
            dayString = "SATURDAY";
        }

        return dayString;
    }

}

public class CalendarExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
