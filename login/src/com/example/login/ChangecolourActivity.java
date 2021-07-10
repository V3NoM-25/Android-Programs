package com.example.login;

import android.R.color;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class ChangecolourActivity extends Activity {
	Button bl1,p1,r1;
	RelativeLayout lay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_changecolour);
		bl1=(Button)findViewById(R.id.bl1);
		p1=(Button)findViewById(R.id.p1);
		r1=(Button)findViewById(R.id.r1);
		lay=(RelativeLayout)findViewById(R.id.lay);
		
		
		bl1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				lay.setBackgroundColor(Color.BLUE);
		
				
				
			}
		}); 
		p1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				lay.setBackgroundColor(Color.GREEN);
			}
		});
		r1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				lay.setBackgroundColor(Color.RED);
			}
		});
			
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.changecolour, menu);
		return true;
	}

}
