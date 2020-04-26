package com.example.homework2part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main3Activity extends AppCompatActivity {

    private Button button_main2;
    private Button button2_main2;
    private TextView text;
    private int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        secondInit();
    }

    public void secondInit(){
        button_main2 = findViewById(R.id.button4);
        button2_main2 = findViewById(R.id.button5);
        text = findViewById(R.id.adressFoto2);


        button_main2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
            }
        });

        button2_main2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                randomNumber = random.nextInt(100-1) + 1;
                text.setText("http://myfile.org/" + randomNumber);
            }
        });

    }
}
