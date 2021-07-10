package com.example.login;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DashboardActivity extends Activity {
Button btn,btn2,btn3,btn4,btn5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard);
	    btn2=(Button)findViewById(R.id.btn_add);
        
	       btn3=(Button)findViewById(R.id.btn_find);
	       btn4=(Button)findViewById(R.id.btn_change);
	       btn5=(Button)findViewById(R.id.btn_swap);
	       btn2.setOnClickListener(new OnClickListener(){
	       

	     
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent In=new Intent(getApplicationContext(),AdditionActivity.class);
				startActivity(In);
				
				
			}
		});
	       
	       btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent In=new Intent(getApplicationContext(),FindsqurerootActivity.class);
				startActivity(In);
				
				
			}
		});
	       
	       btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent In=new Intent(getApplicationContext(),ChangecolourActivity.class);
				startActivity(In);
				
			}
		});
	       
	       btn5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent In=new Intent(getApplicationContext(),SwappingActivity.class);
				startActivity(In);
				
			}
		});
	       
		
				   
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dashboard, menu);
		return true;
	}

}
