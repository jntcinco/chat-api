package com.exam;

import java.util.Scanner;

public class StaticBlockExample {
    private static int B = 0;
    private static int H = 0;
    private static boolean flag = true;

    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}
