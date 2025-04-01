package com.dmitrii.behaviour.command;

public class SmsNotification implements Notification{

    @Override
    public void send(NotificationInfo info) {
        System.out.println("Sms notification sending...");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.SMS;
    }
}
