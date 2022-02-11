package com.example.compte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    public static final String LOGIN_EXTRA = "login_extra";
    public static final String PASSWORD_EXTRA = "password_extra";
    public static final String EMAIL_EXTRA = "email_extra";
    @Override protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        final Button validateAccountCreation = (Button) findViewById(R.id.valider);
        validateAccountCreation.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v) { goToMainActivity(); } }); }
    private void goToMainActivity()
    { final EditText login = (EditText) findViewById(R.id.log);
        final EditText password = (EditText) findViewById(R.id.pass);
        final EditText email = (EditText) findViewById(R.id.email);
        final Intent resultIntent = new Intent();
        resultIntent.putExtra(LOGIN_EXTRA, login.getText().toString());
        resultIntent.putExtra(PASSWORD_EXTRA, password.getText().toString());

        resultIntent.putExtra(EMAIL_EXTRA, email.getText().toString());
        setResult(RESULT_OK, resultIntent);
        finish();
    } }