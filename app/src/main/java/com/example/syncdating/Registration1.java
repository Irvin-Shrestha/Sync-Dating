package com.example.syncdating;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Registration1 extends AppCompatActivity {

    private Button mRegister2;
    private TextView mLogin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration1);

        mRegister2 = (Button) findViewById(R.id.Registerbtn2);
        mLogin2 = (TextView) findViewById(R.id.Loginbtn2);

        mRegister2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration1.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

        mLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration1.this, Login1.class);
                startActivity(intent);
            }
        });
    }
}