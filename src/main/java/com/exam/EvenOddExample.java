package com.exam;

import java.util.Scanner;

public class EvenOddExample {
    public static void main(String[] args) {
        Scanner in = null;

        try {
            in = new Scanner(System.in);
            System.out.println("Enter number: ");
            int n = in.nextInt();

            if (n % 2 == 0) {
                if ((n >= 2) && (n <= 5)) {
                    System.out.println("Not Weird");
                } else if ((n >= 6) && (n <= 20)) {
                    System.out.println("Weird");
                } else if (n > 20) {
                    System.out.println("Not Weird");
                }
            } else {
                System.out.println("Weird");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }
}
