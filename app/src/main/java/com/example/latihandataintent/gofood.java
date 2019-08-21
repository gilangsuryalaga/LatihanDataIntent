package com.example.latihandataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gofood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gofood);
        final EditText name = (EditText) findViewById(R.id.edittextnama);
        final EditText alamat = (EditText) findViewById(R.id.edittextalamat);
        final EditText pesan = (EditText) findViewById(R.id.edittextpesan);
        Button button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(gofood.this,pesanan.class);
                i.putExtra("name", name.getText().toString());
                i.putExtra("alamat", alamat.getText().toString());
                i.putExtra("pesan", pesan.getText().toString());
                startActivity(i);
            }
        });
    }
}
