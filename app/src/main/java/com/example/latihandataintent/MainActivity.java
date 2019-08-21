package com.example.latihandataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton button = (ImageButton) findViewById(R.id.btngofood);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent i = new Intent(MainActivity.this,gofood.class);
                startActivity(i);
            }
        });
    }
}
