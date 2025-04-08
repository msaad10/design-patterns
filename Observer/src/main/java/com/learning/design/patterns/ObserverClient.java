package com.learning.design.patterns;

public class ObserverClient {
    public static void main(String[] args) {
            Channel channel = new Channel("TechWorld");

            Subscriber subscriber1 = new Subscriber("1");
            Subscriber subscriber2 = new Subscriber("2");
            Subscriber subscriber3 = new Subscriber("3");
            Subscriber subscriber4 = new Subscriber("4");
            Subscriber subscriber5 = new Subscriber("5");

            subscriber1.subscribeChannel(channel);
            subscriber2.subscribeChannel(channel);
            subscriber3.subscribeChannel(channel);
            subscriber4.subscribeChannel(channel);
            subscriber5.subscribeChannel(channel);

            channel.upload();
    }
}