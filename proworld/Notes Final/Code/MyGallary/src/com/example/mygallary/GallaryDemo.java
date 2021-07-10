package com.example.mygallary;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GallaryDemo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallary_demo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.gallary_demo, menu);
        return true;
    }
    
}
