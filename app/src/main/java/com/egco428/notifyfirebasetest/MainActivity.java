package com.egco428.notifyfirebasetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getExtras() != null) {
            for (String key : getIntent().getExtras().keySet()) {
                String value = getIntent().getExtras().getString(key);
                Log.d(TAG, "Key: " + key + " Value: " + value);
            }
        }

        Button logTokenButton = (Button)findViewById(R.id.button);
        logTokenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "InstantID token: " + FirebaseInstanceId.getInstance().getToken());
            }
        });
    }
}
