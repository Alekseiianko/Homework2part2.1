package com.example.homework2part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    private Button buttonBack;
    private Button buttonGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        buttonBack = findViewById(R.id.button1);
        buttonGo = findViewById(R.id.button2);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.finish();
            }
        });

        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(intent);
            }
        });
    }
}
