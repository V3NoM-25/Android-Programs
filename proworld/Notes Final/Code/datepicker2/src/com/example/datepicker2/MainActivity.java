package com.example.datepicker2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends Activity {
	DatePicker d1;
	Button b1;
	TextView tv;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv=(TextView)findViewById(R.id.textView1);
		d1=(DatePicker)findViewById(R.id.datePicker1);
		b1=(Button)findViewById(R.id.button1);
		
		tv.setText(getCurrentDate());
						
		b1.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view) 
			{
				tv.setText(getCurrentDate());
				//tv.setText(getCurrentDate());
			}
			
		});
	}
    public String getCurrentDate(){
    	
    	StringBuilder sb = new StringBuilder();
    	
		sb.append("Current Date: ");
		sb.append((d1.getMonth() + 1)+"/");
		sb.append(d1.getDayOfMonth()+"/");
		sb.append(d1.getYear());
		
		return sb.toString();
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
