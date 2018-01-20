package com.example.user.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/1200px-Flag_of_India.svg.png");
        mNames.add("India");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Language_region_maps_of_India.svg/1200px-Language_region_maps_of_India.svg.png");
        mNames.add("Map");

        mImageUrls.add("https://www.geopolintelligence.com/wp-content/uploads/2016/10/Why-living-in-india-and-being-an-Indian-is-amazing-1.png");
        mNames.add("Taj Mahal");

        mImageUrls.add("http://diveprice.com/wp-content/uploads/2017/04/india-tours-jaipur-gangaur-festival.jpg.1340x0_default.jpg");
        mNames.add("Elephant");

        mImageUrls.add("https://pbs.twimg.com/profile_images/718314653181427716/9gKTzW1d_400x400.jpg");
        mNames.add("Modi");

        initRecyclerView();
    }
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,mImageUrls,mNames);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

