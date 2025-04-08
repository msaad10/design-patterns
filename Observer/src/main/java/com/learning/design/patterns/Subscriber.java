package com.learning.design.patterns;

public class Subscriber implements Observer {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Subscriber " + name + " has been notified of a new upload on channel " +  channel.getName());
    }

    public void subscribeChannel(Channel channel) {
        this.channel = channel;
        channel.subscribe(this);
    }

}
