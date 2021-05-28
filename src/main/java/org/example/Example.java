package org.example;

public class Example {
    int num = 5;

    public void throwException() {
        if ((5 == num)) {
            throw new UnsupportedOperationException();
        }
    }
}
