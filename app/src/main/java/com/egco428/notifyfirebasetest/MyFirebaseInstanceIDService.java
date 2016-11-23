package com.egco428.notifyfirebasetest;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Natamon Tangmo on 22-Nov-16.
 */
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService{
    @Override
    public void onTokenRefresh() {

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        sendRegistrationToServer(refreshedToken);

    }

    private void sendRegistrationToServer(String token) {

    }
}
