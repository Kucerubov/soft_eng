package com.example.genlib;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.net.PasswordAuthentication;

public class LoginActivity extends AppCompatActivity {

    private EditText login_user;
    private EditText password_user;
    private Button login_button;
    private Button register_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        login_user = findViewById(R.id.login_app);
        password_user = findViewById(R.id.password_app);
        login_button = findViewById(R.id.login);
        register_button = findViewById(R.id.register);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}
