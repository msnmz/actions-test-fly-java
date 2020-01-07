package com.kodstar.actions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sum() {
        assertEquals(Main.sum(5, 5), 10);
    }

}