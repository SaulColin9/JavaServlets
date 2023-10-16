package org.example.MessageImpl;

import org.example.MessageInterface.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
