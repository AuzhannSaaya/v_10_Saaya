package com.example.saaya_v_10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.os.Bundle;

public class Notice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice);
    }

    // Создание уведомления
    NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "channel_id")
            .setContentTitle("Напоминание")
            .setContentText("Оплатите билеты до 22 декабря, в 11:20")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT);

    // Отображение уведомления
    NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
}