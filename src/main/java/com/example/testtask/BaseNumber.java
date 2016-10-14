package com.example.testtask;

public class BaseNumber {
    private int count;

    public void plusPlus() {
        count++;
    }

    public boolean isEvenNumber() {
        return (count % 2 == 0) && (count != 0);
    }
}
