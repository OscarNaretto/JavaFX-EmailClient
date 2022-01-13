package com.projprogiii.clientmail.utils;

public enum AlertText {
    INVALID_RECIPIENTS("Error inserting recipents, please check syntax and make " +
            "sure that the domain is '@unito.it'!"),
    MESSAGE_SENT("Message sent with success!"),
    MESSAGE_DELETED("Message deleted with success!");

    public final String text;

    AlertText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
