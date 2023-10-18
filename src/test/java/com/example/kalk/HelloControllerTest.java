package com.example.kalk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void onMinus() {
        Double x = 10.0;
        Double y = 10.0;

        Double c = x-y;
        Assertions.assertEquals(0, c);
    }

    @Test
    void onMult() {
        Double x = 10.0;
        Double y = 10.0;

        Double c = x*y;
        Assertions.assertEquals(100, c);
    }

    @Test
    void onPlus() {
        Double x = 10.0;
        Double y = 10.0;

        Double c = x+y;
        Assertions.assertEquals(20, c);
    }

    @Test
    void onRazr() {
        Double x = 10.0;
        Double y = 10.0;

        Double c = x/y;
        Assertions.assertEquals(1, c);
    }
}