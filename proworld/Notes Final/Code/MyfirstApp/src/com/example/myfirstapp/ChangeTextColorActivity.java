package com.example.myfirstapp;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ChangeTextColorActivity extends Activity {
	
	Button changecolor;
	TextView tv_txt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_change_text_color);
		changecolor=(Button)findViewById(R.id.change_txt_color);
		tv_txt=(TextView)findViewById(R.id.tv_txt_change_color);
		changecolor.setOnClickListener(new OnClickListener() {
			
			@SuppressLint("ResourceAsColor") @Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv_txt.setTextColor(R.color.red);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.change_text_color, menu);
		return true;
	}
}


