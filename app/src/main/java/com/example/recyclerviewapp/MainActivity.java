package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.main_recyclerview);
        ArrayList<Cat> cats = new ArrayList();
        cats.add(new Cat(R.drawable.bengal_cat,"Bengal Cat"));
        cats.add(new Cat(R.drawable.birman_cat,"Birman Cat"));
        cats.add(new Cat(R.drawable.bombay_cat,"Bombay Cat"));
        cats.add(new Cat(R.drawable.burmese_cat,"Burmese Cat"));
        cats.add(new Cat(R.drawable.egyptian_mau_cat,"Egyptian Mau Cat"));
        cats.add(new Cat(R.drawable.korat_cat,"Korat Cat"));
        cats.add(new Cat(R.drawable.la_perm_cat,"LaPerm Cat"));
        cats.add(new Cat(R.drawable.manx_cat,"Manx Cat"));
        cats.add(new Cat(R.drawable.munchkin_cat,"Munchkin Cat"));
        cats.add(new Cat(R.drawable.persian_cat,"Persian Cat"));
        cats.add(new Cat(R.drawable.ragdoll_cat,"Ragdoll Cat"));
        cats.add(new Cat(R.drawable.savannah_cat,"Savannah Cat"));
        cats.add(new Cat(R.drawable.siamese_cat,"Siamese Cat"));
        cats.add(new Cat(R.drawable.turkish_van_cat,"Turkish Van Cat"));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        CatRecyclerViewAdapter catRecyclerViewAdapter = new CatRecyclerViewAdapter(cats);
        recyclerView.setLayoutManager(layoutManager);
        // make recycler view more efficient by let system know it has fixed width all the time
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(catRecyclerViewAdapter);

    }
}