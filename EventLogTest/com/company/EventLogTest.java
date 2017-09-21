package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class EventLogTest {
    public Event testEvent1 = new Event();
    public Event testEvent2;

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        testEvent1.setName("Meet up");
        testEvent1.setAction("Network around");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addEvent() throws Exception {
        EventLog eventLog = new EventLog();
        assertTrue( eventLog.addEvent(testEvent1) );
    }

    @Test
    public void addEventNull() throws Exception {
        expected.expect(IllegalArgumentException.class);
        EventLog eventLog = new EventLog();
        eventLog.addEvent(testEvent2);
    }



}