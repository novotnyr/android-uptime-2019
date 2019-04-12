package com.github.novotnyr.android.uptime;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;

import java.util.List;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class UptimeIntentService extends IntentService {
    public UptimeIntentService() {
        super("UptimeIntentService");
    }


    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        long millis = SystemClock.elapsedRealtime();
        long minutes = millis / (1000 * 60);

        triggerNotification(minutes);
    }

    private void triggerNotification(long uptimeMinutes) {
    }

}
