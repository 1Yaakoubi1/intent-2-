package com.example.compte;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    private final static int ACCOUNT_CREATION_ACTIVITY_ID = 10;
    private final static String TAG = "MainActivity";
    @Override protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button createAccount = (Button) findViewById(R.id.creeruncompte);
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                final Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivityForResult(intent, ACCOUNT_CREATION_ACTIVITY_ID); } }); }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    { super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ACCOUNT_CREATION_ACTIVITY_ID)
        { if (resultCode == RESULT_OK)
        { final String login = data.getStringExtra(Activity2.LOGIN_EXTRA);
            final String password = data.getStringExtra(Activity2.PASSWORD_EXTRA);
            final String email = data.getStringExtra(Activity2.EMAIL_EXTRA);
            Toast.makeText(this, "login = " + login, Toast.LENGTH_LONG).show();
            Toast.makeText(this, "password = " + password, Toast.LENGTH_LONG).show();
            Toast.makeText(this, "email = " + email, Toast.LENGTH_LONG).show();
        }
        }
    }
}