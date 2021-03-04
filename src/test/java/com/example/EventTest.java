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

    @Test
    @DisplayName("eventIsNotNullWithConstructorDefault")
    void eventIsNotNullWithConstructorDefault() {
        Event event= new Event();
        assertTrue(event != null);
    }

    @Test
    @DisplayName("addAttendeeNull")
    void addAttendeeNull() {
        Event event= new Event();
        event.addAttendee(null);
        assertTrue(event != null);
    }


    @Test
    @DisplayName("addAttendeesNull")
    void addAttendeesNull() {
        Event event= new Event( 1l,"test",EventType.TECH,new EventNotificationServiceImpl());
        event.setAttendees(null);
        Attendee attendee= new Attendee();
        event.addAttendee(attendee);
        assertTrue(event != null);
    }

    @Test
    @DisplayName("addAttendeesListNull")
    void addAttendeesListNull() {
        Event event= new Event( 1l,"test",EventType.TECH,new EventNotificationServiceImpl());
        event.addAttendees(null);
        assertTrue(event != null);
    }





}