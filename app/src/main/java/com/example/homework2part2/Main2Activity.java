package com.example.homework2part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class Main2Activity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private TextView text;
    private int min;
    private int max;
    private int random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }

    public void init() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        text = findViewById(R.id.adressFoto);
        random = ThreadLocalRandom.current().nextInt(min, max);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                min = 0;
                max = 100;
                text.setText("http://myfile.org/" + random);
            }
        });
    }
}
