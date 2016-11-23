package com.egco428.notifyfirebasetest;

/**
 * Created by Natamon Tangmo on 22-Nov-16.
 *
 */
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "Message";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

    }
}