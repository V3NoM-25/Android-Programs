package com.example.calci;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
 
EditText  et1,et2;
Button btn,btn1,btn2,btn3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et1=(EditText)findViewById(R.id.et_no1);
		et2=(EditText)findViewById(R.id.et_no2);
	
		btn=(Button)findViewById(R.id.bt_add);
		
		btn1=(Button)findViewById(R.id.bt_sub);
		
		btn2=(Button)findViewById(R.id.bt_mul);
		
		btn3=(Button)findViewById(R.id.bt_div);
		
		btn.setOnClickListener(new OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Double a=Double.parseDouble(et1.getText().toString());
				
				Double b=Double.parseDouble(et2.getText().toString());
				
				Double c=a+b;
				
				Toast.makeText(getApplicationContext(), "addition"+c, Toast.LENGTH_LONG).show();
			}
		} );
		
			
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Double a=Double.parseDouble(et1.getText().toString());
				
				Double b=Double.parseDouble(et2.getText().toString());
				
				Double c= a-b;
				
				Toast.makeText(getApplicationContext(), "substract"+c, Toast.LENGTH_LONG).show();
				
			}
		});
		
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Double no1=Double.parseDouble(et1.getText().toString());
				
				Double no2=Double.parseDouble(et2.getText().toString());
				
				Double no3= no1 *no2;
				
				Toast.makeText(getApplicationContext(), "multiplication"+no3, Toast.LENGTH_LONG).show();
				
			}
		});
		
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Double no1=Double.parseDouble(et1.getText().toString());
				
				Double no2=Double.parseDouble(et2.getText().toString());
				
				Double no3= no1/no2;
				
				Toast.makeText(getApplicationContext(), "Division"+no3,Toast.LENGTH_LONG ).show();
				
			}
		});
		
		
				
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}