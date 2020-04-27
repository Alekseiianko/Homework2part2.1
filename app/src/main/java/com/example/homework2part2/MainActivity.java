package com.example.homework2part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    private Button buttonBack;
    private Button buttonGo;
    private TextView text;
    private int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        text = findViewById(R.id.adressFoto);
        Random random = new Random();
        randomNumber = random.nextInt(100-1) + 1;
        text.setText("http://myfile.org/" + randomNumber);
    }

    public void init() {
        buttonBack = findViewById(R.id.button1);
        buttonGo = findViewById(R.id.button2);
        text = findViewById(R.id.adressFoto);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.finish();
            }
        });

        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
