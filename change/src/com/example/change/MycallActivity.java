package com.example.change;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MycallActivity extends Activity {
	
	EditText et;
	Button bt1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mycall);
		
		et=(EditText)findViewById(R.id.no);
		bt1=(Button)findViewById(R.id.btn);
		
	    bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String number=et.getText().toString();
				Intent call= new Intent(Intent.ACTION_CALL);
				call.setData(Uri.parse("tel:"+number));
				startActivity(call);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mycall, menu);
		return true;
	}

}
