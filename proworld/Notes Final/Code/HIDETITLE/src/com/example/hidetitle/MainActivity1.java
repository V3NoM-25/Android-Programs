package com.example.hidetitle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class MainActivity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        
        setContentView(R.layout.activity_main_activity1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity1, menu);
        return true;
    }
    
}
