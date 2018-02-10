package com.example.deewanshigrover.index;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IndexMainActivity extends AppCompatActivity {

    int notificationId = 1;
    NotificationManager notificationManager = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_main);
    }

    public void NotifyMe(View view) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentTitle("Notification From");
        builder.setContentText("You have notifications");
        builder.setSmallIcon(R.drawable.ic_launcher_background);
        builder.setTicker("updates");
        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(notificationId,builder.build());
    }
}
