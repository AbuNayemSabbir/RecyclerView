package com.example.recyclearviewexample2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initReyclerView();


    }

    private void initData() {

        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.boy, "boy1","10.45","How Are You?","____________________________________________________________"));
        userList.add(new ModelClass(R.drawable.boy2, "boy","10.45","How Are You?","____________________________________________________________"));
        userList.add(new ModelClass(R.drawable.girl, "girl","10.45","How Are You?","____________________________________________________________"));
        userList.add(new ModelClass(R.drawable.unknown, "unkown","10.45","How Are You?","____________________________________________________________"));
        userList.add(new ModelClass(R.drawable.boy, "boy1","10.45","How Are You?","____________________________________________________________"));
        userList.add(new ModelClass(R.drawable.boy, "boy1","10.45","How Are You?","____________________________________________________________"));
        userList.add(new ModelClass(R.drawable.boy, "boy1","10.45","How Are You?","____________________________________________________________"));
        userList.add(new ModelClass(R.drawable.boy, "boy1","10.45","How Are You?","____________________________________________________________"));
        userList.add(new ModelClass(R.drawable.boy, "boy1","10.45","How Are You?","____________________________________________________________"));
        userList.add(new ModelClass(R.drawable.boy, "boy1","10.45","How Are You?","____________________________________________________________"));
    }

    private void initReyclerView() {

        recyclerView= findViewById(R.id.reclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}