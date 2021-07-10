package com.example.colorchange;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

@SuppressLint("ResourceAsColor") public class MainActivity extends Activity {
	Button Btn;
	TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn=(Button)findViewById(R.id.btn1);
        txt=(TextView)findViewById(R.id.txt1);
        Btn.setOnClickListener(new OnClickListener()
        
        {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				txt.setTextColor(R.color.red);
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
