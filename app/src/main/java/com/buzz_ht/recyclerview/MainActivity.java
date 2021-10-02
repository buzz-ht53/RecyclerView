package com.buzz_ht.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    List<Model> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView= findViewById(R.id.recView);


        list= new ArrayList<>();
        list.add(new Model("Bag 1", "Bag is fancy", "1000",R.drawable.bag));
        list.add(new Model("Bag 2", "Bag is good", "100000",R.drawable.bag));
        list.add(new Model("Bag 3", "Bag is awesome", "2323",R.drawable.bag));
        list.add(new Model("Bag 4", "Bag is leather", "132",R.drawable.bag));
        list.add(new Model("Bag 5", "Bag is plastic", "10230",R.drawable.bag));
        list.add(new Model("Bag 6", "Bag is gold", "1000",R.drawable.bag));
        list.add(new Model("Bag 7", "Bag is etc", "1000",R.drawable.bag));
        list.add(new Model("Bag 8", "Bag is random", "1000",R.drawable.bag));
        list.add(new Model("Bag 9", "Bag is better", "1000",R.drawable.bag));
        list.add(new Model("Bag 10", "Bag is ff", "1000",R.drawable.bag));
        list.add(new Model("Bag 11", "Bag is cccc", "1000",R.drawable.bag));
        list.add(new Model("Bag 12", "Bag is aaaaaaansdakjnsdkajsnd", "1000",R.drawable.bag));
        list.add(new Model("Bag 13", "Bag is really nice and light weight and easy to use", "1000",R.drawable.bag));
        list.add(new Model("Bag 14", "Bag is gg", "1000",R.drawable.bag));

        adapter= new Adapter(MainActivity.this,list);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        recyclerView.setAdapter(adapter);


    }
}