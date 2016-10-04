package com.example.testtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String line = reader.readLine();
                System.out.println(yesOrNo(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String yesOrNo(String in) {
        int countZero = 0;
        int countOne = 0;
        char[] array = in.toCharArray();
        for (char oneValue : array) {
            if (oneValue == '0') {
                countZero++;
            } else if (oneValue == '1') {
                countOne++;
            }
        }
        if ((countZero % 2 == 0) && (countOne % 2 != 0)) {
            return "yes";
        }
        return "no";
    }
}
