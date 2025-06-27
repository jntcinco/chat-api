package com.exam;

import java.util.Scanner;

public class NumberOutputtExample {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("================================");
        for(int x = 0; x < 3; x++){
            String input = sc.nextLine();
            String[] splittedString = input.split(" ");
            String stringValue = splittedString[0];
            StringBuilder stringOut = new StringBuilder(stringValue);

            int stringDiff = 15 - stringValue.length();
            for (int e = 0; e < stringDiff; e++) {
                stringOut.append(" ");
            }


            String numberValue = splittedString[1];
            StringBuilder numberOut = new StringBuilder(numberValue);
            if (numberValue.length() < 3) {
                int intDiff = 3 - numberValue.length();
                for (int e = 0; e < intDiff; e++) {
                    numberOut.insert(0, "0");
                }
            }

            System.out.println(stringOut.toString() + numberOut.toString());
        }
        System.out.println("================================");
        sc.close();
    }
}
