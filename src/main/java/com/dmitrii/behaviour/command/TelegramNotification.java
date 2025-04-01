package com.dmitrii.behaviour.command;

public class TelegramNotification implements Notification{

    @Override
    public void send(NotificationInfo info) {
        System.out.println("Telegram notification sending...");
    }

    @Override
    public NotificationType getType() {
        return NotificationType.TELEGRAM;
    }
}
