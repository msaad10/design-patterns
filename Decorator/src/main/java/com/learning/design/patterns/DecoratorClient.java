package com.learning.design.patterns;

public class DecoratorClient {
    public static void main(String[] args) {
        Message msg = new TextMessage("Hello World!");
        System.out.println(msg.getContent());

        Message decorator = new HtmlEncodedMessage(msg);
        System.out.println(decorator.getContent());

        decorator = new Base64EncodedMessage(decorator);
        System.out.println(decorator.getContent());

    }
}