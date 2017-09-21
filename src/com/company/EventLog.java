package com.company;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EventLog {

    private ArrayList<Event> eventsList = new ArrayList<Event>();
    private HashSet<String> acceptedAction = new HashSet<String>();


    public EventLog() {
        acceptedAction.add("Face2Face");
        acceptedAction.add("PhoneCall");
        acceptedAction.add("TextMessaging");
        acceptedAction.add("Unknown");
    }

    public boolean addEvent(Event event) throws IllegalArgumentException {

        if(event == null || event.getName() == null || event.getAction() == null) {
            throw new IllegalArgumentException();
        } eventsList.add(event);
        return true;
    }

    public int getNumEvents() {
        return eventsList.size();
    }

}

