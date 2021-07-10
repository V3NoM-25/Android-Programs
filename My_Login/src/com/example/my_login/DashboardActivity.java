package com.example.my_login;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DashboardActivity extends Activity {
	
	Button btncolo,btnadd,btnsqure,btncal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard);
		btncolo=(Button)findViewById(R.id.btn_color);
		btnadd=(Button)findViewById(R.id.btn_add);
		btnsqure=(Button)findViewById(R.id.btn_sqr);
		btncal=(Button)findViewById(R.id.btn_cal);
		
		btncal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in1= new Intent(getApplicationContext(),CalculatorActivity.class);
				startActivity(in1);
				
			}
		});
		btncolo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in1= new Intent(getApplicationContext(),ChangeColorActivity.class);
				startActivity(in1);
				
			}
		});
//btncal.setOnClickListener(new OnClickListener() {
//	
//	@Override
//	public void onClick(View v) {
//		// TODO Auto-generated method stub
//		Intent in1= new Intent(getApplicationContext(),CalculatorActivity.class);
//		startActivity(in1);
//		
//	}
//});
//btncal.setOnClickListener(new OnClickListener() {
//	
//	@Override
//	public void onClick(View v) {
//		// TODO Auto-generated method stub
//		Intent in1= new Intent(getApplicationContext(),CalculatorActivity.class);
//		startActivity(in1);
//		
//	}
//});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dashboard, menu);
		return true;
	}

}
