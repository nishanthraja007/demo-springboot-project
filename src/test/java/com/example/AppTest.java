package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void appSaysHello() {
        App app = new App();
        assertEquals("Hello from Maven project!", app.getMessage());
    }
}
