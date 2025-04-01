package com.dmitrii.behaviour.command;


public class NotificationInfo {

    private long id;
    private long userId;
    private String message;
    private NotificationType type;

    public NotificationInfo(long id, long userId, String message, NotificationType type) {
        this.id = id;
        this.userId = userId;
        this.message = message;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public String getMessage() {
        return message;
    }

    public NotificationType getType() {
        return type;
    }
}
