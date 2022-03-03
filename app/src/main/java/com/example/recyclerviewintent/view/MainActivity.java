package com.example.recyclerviewintent.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewintent.R;
import com.example.recyclerviewintent.adapter.MyAdapter;
import com.example.recyclerviewintent.model.ListData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private final List<ListData> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        initViews();
        list();
    }

    public void initViews() {
        MyAdapter adapter = new MyAdapter(this, list);
        recyclerView.setAdapter(adapter);

    }

    public void list() {
        list.add(new ListData(R.drawable.java, "Java"));
        list.add(new ListData(R.drawable.kotlin, "Kotlin"));
        list.add(new ListData(R.drawable.cplusplus, "C++"));
        list.add(new ListData(R.drawable.php, "PHP"));
        list.add(new ListData(R.drawable.js, "Java Script"));
        list.add(new ListData(R.drawable.java, "Java"));
        list.add(new ListData(R.drawable.kotlin, "Kotlin"));
        list.add(new ListData(R.drawable.cplusplus, "C++"));
        list.add(new ListData(R.drawable.php, "PHP"));
        list.add(new ListData(R.drawable.js, "Java Script"));
    }
}