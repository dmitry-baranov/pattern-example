package com.dmitrii.behaviour.command;

import org.junit.jupiter.api.Test;

import java.util.List;

class CommandTest {

    @Test
    public void commandPatternTest() {
        EmailNotification emailNotification = new EmailNotification();
        SmsNotification smsNotification = new SmsNotification();
        TelegramNotification telegramNotification = new TelegramNotification();
        List<Notification> services = List.of(emailNotification, smsNotification, telegramNotification);

        NotificationService service = new NotificationService(services);

        NotificationInfo smsInfo = new NotificationInfo(1, 1, "hello", NotificationType.SMS);
        NotificationInfo emailInfo = new NotificationInfo(2, 10, "how was it", NotificationType.EMAIL);
        NotificationInfo telegramInfo = new NotificationInfo(3, 100, "it's amazing", NotificationType.TELEGRAM);

        service.send(smsInfo);
        service.send(emailInfo);
        service.send(telegramInfo);
    }

}