package com.example.my_login;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ChangeColorActivity extends Activity {
	 boolean iscolor = true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_change_color);
		Button btn = (Button) findViewById(R.id.btn);
		Button btn1 = (Button) findViewById(R.id.btnrd);
		Button btn2 = (Button) findViewById(R.id.btngr);
	    final RelativeLayout layout = (RelativeLayout) findViewById(R.id.lay);
	    
	    btn1.setOnClickListener(new OnClickListener() {

	        @Override
	           public void onClick(View view) {

//	            if(iscolor)
//	            {
	                layout.setBackgroundColor(Color.RED);
//	                iscolor = false;
//	            }
//	            else
//	            {
//	                layout.setBackgroundColor(Color.WHITE);
//	                iscolor = true;
//	            }

	           }
	       }); 
	    btn2.setOnClickListener(new OnClickListener() {

	        @Override
	           public void onClick(View view) {

//	            if(iscolor)
//	            {
	                layout.setBackgroundColor(Color.GREEN);
//	                iscolor = false;
//	            }
//	            else
//	            {
//	                layout.setBackgroundColor(Color.WHITE);
//	                iscolor = true;
//	            }

	           }
	       });
	    btn.setOnClickListener(new OnClickListener() {

	        @Override
	           public void onClick(View view) {

	            if(iscolor)
	            {
	                layout.setBackgroundColor(Color.BLUE);
	                iscolor = false;
	            }
	            else
	            {
	                layout.setBackgroundColor(Color.WHITE);
	                iscolor = true;
	            }

	           }
	       });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.change_color, menu);
		return true;
	}

}
