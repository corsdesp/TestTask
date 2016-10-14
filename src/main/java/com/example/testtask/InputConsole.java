package com.example.testtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputConsole {
    private char[] chars;

    public void read() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputLine = reader.readLine();
            if (inputLine != null) {
                chars = inputLine.toCharArray();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public char[] getChars() {
        return chars;
    }
}
