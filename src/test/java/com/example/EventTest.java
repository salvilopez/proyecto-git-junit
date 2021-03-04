package com.example;

import com.example.service.EventNotificationServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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


    @Test
    @DisplayName("addAttendeesGetListSize")
    void addAttendeesGetListSize() {
        Event event= new Event( 1l,"test",EventType.TECH,new EventNotificationServiceImpl());

        List<Attendee> attendees= new ArrayList<>();
        Attendee attendee1= new Attendee(1l,"salvi","salvi@gmail.com");
        Attendee attendee2= new Attendee(2l,"admin","admin@gmail.com");
        attendees.add(attendee1);
        attendees.add(attendee2);
        event.setAttendees(attendees);
        event.addAttendees(attendees);
        assertTrue(attendees.size()==2);
    }

    @Test
    @DisplayName("removeAttendeesGetListNull")
    void removeAttendeesGetListNull() {
        Event event= new Event( 1l,"test",EventType.TECH,new EventNotificationServiceImpl());

        event.removeAttendee(null);
        assertTrue(event.getAttendees()instanceof ArrayList) ;
    }
    @Test
    @DisplayName("removeAttendeessGetList")
    void removeAttendeessGetList() {
        Event event= new Event( 1l,"test",EventType.TECH,new EventNotificationServiceImpl());

        List<Attendee> attendees= new ArrayList<>();
        Attendee attendee1= new Attendee(1l,"salvi","salvi@gmail.com");
        Attendee attendee2= new Attendee(2l,"admin","admin@gmail.com");
        attendees.add(attendee1);
        attendees.add(attendee2);
        event.setAttendees(attendees);
        event.addAttendees(attendees);
        event.removeAttendees(attendees);
        assertTrue(event.getAttendees() instanceof ArrayList);
    }
    @Test
    @DisplayName("addSpeakerNull")
    public void addSpeakerNull() {
        Event event= new Event( 1l,"test",EventType.TECH,new EventNotificationServiceImpl());
        Speaker speaker= new Speaker();
        event.addSpeaker(null);
        assertTrue(event.getSpeakers().size()==0);

    }

    @Test
    @DisplayName("addSpeaker")
    public void addSpeaker() {
        Event event= new Event( 1l,"test",EventType.TECH,new EventNotificationServiceImpl());
        Speaker speaker = new Speaker( 1l,"name","expertise");
        event.addSpeaker(speaker);
        assertTrue(event.getSpeakers().size()>0);
    }
    @Test
    @DisplayName("removeSpeakerNull")
    public void removeSpeakerNull() {
        Event event= new Event( 1l,"test",EventType.TECH,new EventNotificationServiceImpl());
        Speaker speaker= new Speaker();
        event.removeSpeaker(null);
        assertTrue(event.getSpeakers().size()==0);
    }


}