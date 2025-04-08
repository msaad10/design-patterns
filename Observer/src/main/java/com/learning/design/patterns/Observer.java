package com.learning.design.patterns;

public interface Observer {
    void update();
    void subscribeChannel(Channel channel);
}
