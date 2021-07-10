package com.example.proworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class Checkdemo extends Activity {
CheckBox c1,c2,c3;
Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_checkdemo);
		
		c1=(CheckBox)findViewById(R.id.checkBox1);
		c2=(CheckBox)findViewById(R.id.checkBox2);
		c3=(CheckBox)findViewById(R.id.checkBox3);
		b1=(Button)findViewById(R.id.button1);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.checkdemo, menu);
		return true;
	}

}
