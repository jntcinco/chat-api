package com.exam;

import java.util.Scanner;

public class SeriesExample1 {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int j=0;j<t;j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x=1;
            int temp=a;
            for(int i=1;i<=n;i++){
                temp+=(x*b);
                System.out.print(temp+" ");
                x*=2;
            }
            System.out.println();
        }
        in.close();
    }
}
