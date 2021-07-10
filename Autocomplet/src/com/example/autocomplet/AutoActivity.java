package com.example.autocomplet;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoActivity extends Activity {
	
	String[] language={"C","C++","Java","PHP","Android","Hardware","Dot Net"};
	AutoCompleteTextView au;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,language);
        au=(AutoCompleteTextView)findViewById(R.id.AutoCompleteTextView02);
        au.setThreshold(1);
        au.setAdapter(adapter);
        au.setTextColor(Color.GRAY);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.auto, menu);
        return true;
    }
    
}
