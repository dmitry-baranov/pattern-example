package com.dmitrii.behaviour.command;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NotificationService {

    private Map<NotificationType, Notification> services;

    public NotificationService(List<Notification> services){
        this.services = services.stream().collect(Collectors.toMap(Notification::getType, Function.identity()));
    }

    public void send(NotificationInfo info) {
        Notification service = services.get(info.getType());
        service.send(info);
    }
}
