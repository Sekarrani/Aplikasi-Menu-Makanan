package com.example.apliksimenumakanan;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Deskripsi extends AppCompatActivity {
    String nama, harga, deskripsi;
    int gambar;
    TextView des_makanan, des_harga, des_deskripsi;
    ImageView des_gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deskripsi_menu);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            nama = bundle.getString("nama");
            harga = bundle.getString("harga");
            deskripsi = bundle.getString("deskripsi");
            gambar = bundle.getInt("gambar");
        }

        des_makanan = findViewById(R.id.des_makanan);
        des_makanan.setText(nama);

        des_deskripsi = findViewById(R.id.des_deskripsi);
        des_deskripsi.setText(deskripsi);

        des_harga = findViewById(R.id.des_harga);
        des_harga.setText(harga);

        des_gambar = findViewById(R.id.des_gambar);
        des_gambar.setImageResource(gambar);
    }
}
