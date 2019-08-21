package com.example.latihandataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class pesanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);
        TextView a = (TextView) findViewById(R.id.nama_pemesan);
        TextView b = (TextView) findViewById(R.id.alamat_pemesan);
        TextView c = (TextView) findViewById(R.id.pesanan);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("name");
        String o = bundle.getString("alamat");
        String p = bundle.getString("pesan");
        a.setText(s);
        b.setText(o);
        c.setText(p);
    }
}
