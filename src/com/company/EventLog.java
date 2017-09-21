package com.company;

public class EventLog {

    private List<Event> eventList;
    public boolean addEvent(Event event);
    public int getNumEvents ();
    public EventLog ()


    public class Event {
        String name;
        String Action;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAction() {
            return Action;
        }

        public void setAction(String action) {
            Action = action;
        }
    }
}
