package com.example.genlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText login_user;
    private EditText password_user;
    private Button login_app;
    private Button register_app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_user = findViewById(R.id.login_app);
        password_user = findViewById(R.id.password_app);
        login_app = findViewById(R.id.login);
        register_app = findViewById(R.id.register);

        login_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(login_user.getText().toString().trim().equals(""))
                    Toast.makeText(MainActivity.this)

            }
        });




    }
}