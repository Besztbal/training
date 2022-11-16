package com.BB.calculateAverage;

public class CalculateAvg {
    public static void calculateAverage(String input) {
        if (input.isEmpty()) {

            System.out.println(-1.0);
            return;
        }

        if (input.contains("null")) {
            System.out.println(0.0);
            return;
        }


        String temp = "";
        int sum = 0;
        double countDigit = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                temp = String.valueOf(input.charAt(i));
                sum += Double.parseDouble(temp);
                countDigit++;
            }
        }

        System.out.println(sum / countDigit);
    }
}
