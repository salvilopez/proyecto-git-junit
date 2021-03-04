package com.example;

import com.example.service.EventNotificationServiceImpl;
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

    @Test
    @DisplayName("eventIsNotNullWithConstructorParameter")
    void isNotNullWithConstructorParameter() {
        Event event= new Event( 1l,"test",EventType.TECH,new EventNotificationServiceImpl());
        assertTrue(event != null);

    }

}