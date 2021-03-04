package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {

    @Test
    @DisplayName("isEvent")
    void isEvent() {
        Event event= new Event();
        assertTrue(event instanceof Event);
    }


}