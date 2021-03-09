package com.example;

import com.example.service.EventNotificationService;
import com.example.service.EventNotificationServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
public class EventNotificationTest {





    private static final String MSG_ANNOUNCE = "The next big event is coming!";
    private static final String MSG_CONFIRM = "Dear Attendee, your subscription to the event has been confirmed successfully.";



    // dependencias
    @Mock
    Event event;


    // SUT - dependiente
    @InjectMocks
    EventNotificationServiceImpl eventNotificationServiceImpl;


    @Test
    @DisplayName("Test announcement")
    public void testAnouncement() {
        event = new Event();
        event.setId(1l);
        event.setTitle("eventoPrueba");

        Attendee attendee= new Attendee(1l,"salvi","salvi@gmail.com");
        List<Attendee> attendees= new ArrayList<Attendee>();
        List<Notification> notifications= new ArrayList<Notification>();
      attendee.setNotifications(notifications);
      attendees.add(attendee);
      event.setAttendees(attendees);


    eventNotificationServiceImpl.announce(event);

    //when(event.getAttendees().get(0).getNotifications().get(0).getMessage());

    assertEquals(MSG_ANNOUNCE,event.getAttendees().get(0).getNotifications().get(0).getMessage());


    }

    @Test
    @DisplayName("Test Confirm Anouncement")
    public void testConfirmAnouncement() {
        event = new Event();
        event.setId(1l);
        event.setTitle("eventoPrueba");

        Attendee attendee= new Attendee(1l,"salvi","salvi@gmail.com");
        List<Attendee> attendees= new ArrayList<Attendee>();
        List<Notification> notifications= new ArrayList<Notification>();
        attendee.setNotifications(notifications);
        attendees.add(attendee);
        event.setAttendees(attendees);


        eventNotificationServiceImpl.confirmAttendance(event,attendee);

        //when(event.getAttendees().get(0).getNotifications().get(0).getMessage());

        assertEquals(MSG_CONFIRM,event.getAttendees().get(0).getNotifications().get(0).getMessage());


    }



}
