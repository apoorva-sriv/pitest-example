package org.example;

import org.junit.Test;

public class ExampleTest {

    @Test(expected = UnsupportedOperationException.class)
    public void throwException() {
        new Example().throwException();
    }
}