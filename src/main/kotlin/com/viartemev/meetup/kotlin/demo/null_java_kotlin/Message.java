package com.viartemev.meetup.kotlin.demo.null_java_kotlin;

import javax.annotation.Nonnull;
import javax.annotation.meta.When;

public class Message {
    private final String greetingMessage = "Hello ";

    //@Nonnull(when = When.ALWAYS) //When.ALWAYS is default option and makes the annotated type as non-nullable
    public String getEchoMessage() {
        return greetingMessage;
    }

    public void doSomething(
            //@Nonnull(when = When.ALWAYS)
            String greetingMessage
    ) {
        System.out.println(greetingMessage);
    }

    public void doWithCustomAnnotation(
            @CustomNotNullAnnotation
                    String greetingMessage
    ) {
        System.out.println(greetingMessage);
    }
}
