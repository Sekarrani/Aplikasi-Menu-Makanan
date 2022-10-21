package com.example.apliksimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.webkit.WebView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMenu;
    private ArrayList<Menu> listMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMenu = findViewById(R.id.rec_menu);
        initData();

        recMenu.setAdapter(new MenuAdapter(listMenu));
        recMenu.setLayoutManager(new LinearLayoutManager(this));

    }

    private  void initData(){
        this.listMenu = new ArrayList<>();
        listMenu.add(new Menu("Bakso",
                "Rp 15.000",
                "Bakso daging sapi hangat",
                R.drawable.bakso));

        listMenu.add(new Menu("Sate",
                "Rp 12.000",
                "Sate ayam Madura",
                R.drawable.sate));

        listMenu.add(new Menu("Gado-gado",
                "Rp 17.000",
                "Sayuran bumbu kacang",
                R.drawable.gadogado));

        listMenu.add(new Menu("Soto",
                "Rp 7.000",
                "Soto Ayam Lamonagn",
                R.drawable.soto));
    }





}


