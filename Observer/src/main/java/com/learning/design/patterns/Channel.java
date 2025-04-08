package com.learning.design.patterns;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    List<Subscriber> subscribers = new ArrayList<>();
    private String name;

    public Channel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    @Override
    public void upload() {
         notifySubscribers();
    }
}
