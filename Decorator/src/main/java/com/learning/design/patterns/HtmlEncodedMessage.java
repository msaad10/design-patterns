package com.learning.design.patterns;

// Decorator
public class HtmlEncodedMessage implements Message {
    private Message message;

    public HtmlEncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return "<html>" + message.getContent() + "</html>";
    }
}
