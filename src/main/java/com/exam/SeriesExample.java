package com.exam;

import java.util.Scanner;

public class SeriesExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int square = 0;
        int computation = 0;
        String[] splitInput = in.nextLine().split(" ");
        int numberCtr = splitInput.length <= 1 ? 0 : Integer.parseInt(splitInput[2]);
        Integer[] finalOutput = new Integer[numberCtr];

        for (int i=1; i<=numberCtr; i++){
            if (i <= 2) {
                square = i;
            } else {
                square = square * 2;
            }

            int ctr = i-1;
            if ( ctr < 1) {
                computation = Integer.parseInt(splitInput[0]) + (square * Integer.parseInt(splitInput[1]));
            } else {
                computation = finalOutput[ctr-1] + (square * Integer.parseInt(splitInput[1]));
            }
            finalOutput[ctr] = computation;
        }

        StringBuilder series = new StringBuilder();
        for (int i=0; i<finalOutput.length; i++) {
            series.append(String.valueOf(finalOutput[i])+" ");
        }
        System.out.println(series.toString());
        in.close();
    }
}
