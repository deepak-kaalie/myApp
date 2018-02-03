package com.example.user.listrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";
    private ArrayList<String> mList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
        initlistdata();
    }
    private void initlistdata(){
        Log.d(TAG, "initlistdata: preparing list");
        mList.add("depak");
        mList.add("depak");
        mList.add("depak");
        mList.add("depak");
        mList.add("depak");
        mList.add("depak");
        initRecycleView();


    }
    private void initRecycleView(){
        Log.d(TAG, "initRecycleView: init recycle");
        RecyclerView recyclerView=findViewById(R.id.recycle);
        myAdapter adapter=new myAdapter(this,mList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
