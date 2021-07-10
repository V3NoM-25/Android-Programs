package com.example.login;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FindsqurerootActivity extends Activity {
	EditText Num1;
	Button sqrt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_findsqureroot);
		Num1=(EditText)findViewById(R.id.Num1);
		sqrt=(Button)findViewById(R.id.sqrt);
		
		sqrt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s1=Num1.getText().toString();
				Double a=Double.parseDouble(s1);
				
				Double ans=Math.sqrt(a);
				
				Toast.makeText(getApplicationContext(),String.valueOf(ans),Toast.LENGTH_LONG).show();
			}

			private Object String() {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.findsqureroot, menu);
		return true;
	}

}
