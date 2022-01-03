package com.projprogiii.lib.model;

import java.io.Serializable;

public class Mail implements Serializable {
    private String sender;
    private String receiver;
    private String text;

    public Mail(String sender, String receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public static void hellofromMail(){
        System.out.println("HELLOOOO");
    }

    @Override
    public java.lang.String toString() {
        return "Mail{" +
                "sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}

