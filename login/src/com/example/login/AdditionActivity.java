package com.example.login;

import android.R.integer;
import android.R.string;
import android.os.Bundle;
import android.renderscript.Sampler.Value;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdditionActivity extends Activity {
	EditText et1,et2;
	Button Add1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addition);
		et1=(EditText)findViewById(R.id.et1);
		et2=(EditText)findViewById(R.id.et2);
		Add1=(Button)findViewById(R.id.Add1);
		 
		Add1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s1=et1.getText().toString();
				String s2=et2.getText().toString();
				int a=Integer.parseInt(s1);
				int b=Integer.parseInt(s2);
				int c=a+b;
				
				Toast.makeText(getApplicationContext(),String.valueOf("Addition="+c),Toast.LENGTH_LONG).show();
				
				
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.addition, menu);
		return true;
	}

}
