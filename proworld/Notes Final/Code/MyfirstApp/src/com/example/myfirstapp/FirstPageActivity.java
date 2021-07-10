package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstPageActivity extends Activity implements OnClickListener {
	Button txtchange,txtcolorchange,imggall,calculator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_page);
		///initilize component
		txtchange=(Button)findViewById(R.id.btn_txt_change_fp);
		txtcolorchange=(Button)findViewById(R.id.btn_txt_chng_colr_fp);
		imggall=(Button)findViewById(R.id.btn_img_gal_fp);
		
		calculator=(Button)findViewById(R.id.btn_cal_fp);
		///call click listener method
		
		txtchange.setOnClickListener(this);
		txtcolorchange.setOnClickListener(this);
		imggall.setOnClickListener(this);
		calculator.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.first_page, menu);
		return true;
	}

	@Override
	public void onClick(View vw) {
		// TODO Auto-generated method stub
		
		switch (vw.getId()) {
		case R.id.btn_txt_change_fp:
			Intent in=new Intent(getApplicationContext(),TextchangeActivity.class);
			startActivity(in);
			break;
			
		case R.id.btn_txt_chng_colr_fp:
			Intent in1=new Intent(getApplicationContext(),ChangeTextColorActivity.class);
			startActivity(in1);
			break;
			
		case R.id.btn_img_gal_fp:
			Intent in2=new Intent(getApplicationContext(),ImageGallActivity.class);
			startActivity(in2);
			break;
		case R.id.btn_cal_fp:
			Intent in3=new Intent(getApplicationContext(),MainActivity.class);
			startActivity(in3);
			break;

		default:
			break;
		}
		
	}

}
