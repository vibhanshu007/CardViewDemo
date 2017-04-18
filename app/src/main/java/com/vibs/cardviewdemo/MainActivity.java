package com.vibs.cardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter customAdapter;
    private List<InfoGetAndSet> infoGetAndSetsList;
    private boolean gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infoGetAndSetsList = new ArrayList<>();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        setRecyclerViewData();
        Log.e("setRecyclerViewData","setRecyclerViewData" +infoGetAndSetsList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        customAdapter = new CustomAdapter(MainActivity.this,infoGetAndSetsList);
        recyclerView.setAdapter(customAdapter);

    }
    private void setRecyclerViewData() {
        infoGetAndSetsList.add(new InfoGetAndSet("Phan Thanh", false, "Cashier"));
        infoGetAndSetsList.add(new InfoGetAndSet("Nguyen Tuan", true, "Developer"));
        infoGetAndSetsList.add(new InfoGetAndSet("Tran Van Minh", true, "Designer"));
        infoGetAndSetsList.add(new InfoGetAndSet("Pham Mai Anh", true, "architect"));
        infoGetAndSetsList.add(new InfoGetAndSet("Nguyen Quynh Trang", false, "Doctor"));
        infoGetAndSetsList.add(new InfoGetAndSet("Hoang Dinh Cuong", false, "artist"));
        infoGetAndSetsList.add(new InfoGetAndSet("Tran Cong Bach", true, "Student"));
        infoGetAndSetsList.add(new InfoGetAndSet("Vu Van Duong", false, "Teacher"));
    }
}
