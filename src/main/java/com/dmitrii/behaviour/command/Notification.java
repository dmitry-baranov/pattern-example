package com.dmitrii.behaviour.command;

public interface Notification {

    void send(NotificationInfo info);

    NotificationType getType();
}
