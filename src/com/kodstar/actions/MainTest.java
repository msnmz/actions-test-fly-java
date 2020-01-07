package com.kodstar.actions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(Main.sum(5, 5), 10);
    }
}