package org.example;

import org.example.Factory.MessageSupportFactory;
import org.example.MessageImpl.HelloWorldMessageProvider;
import org.example.MessageImpl.StandardOutMessageRenderer;
import org.example.MessageInterface.MessageProvider;
import org.example.MessageInterface.MessageRenderer;

public class Main {
    public static void main(String[] args) {
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        mr.setMessageProvider(mp);
        mr.render();
    }
}