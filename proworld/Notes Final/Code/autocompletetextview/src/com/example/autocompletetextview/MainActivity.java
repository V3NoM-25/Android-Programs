package com.example.autocompletetextview;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
	String[] name ={"SALMAN","SHAHARUKH","RANVEER",".AMEER","AMITABH","SIDHHARTH","AKSHAY","VARUN"};
	 AutoCompleteTextView av;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		   ArrayAdapter<String> adt = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,name);
		
		 av= (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
		   
		   av.setThreshold(1);
		   av.setAdapter(adt);
		   av.setTextColor(Color.RED);
		   		        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
