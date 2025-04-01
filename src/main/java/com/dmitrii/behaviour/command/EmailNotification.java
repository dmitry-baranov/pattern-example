package com.dmitrii.behaviour.command;

public class EmailNotification implements Notification{

    @Override
    public void send(NotificationInfo info) {
        System.out.println("Email notification sending...");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.EMAIL;
    }
}
