package com.example.assignadd;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends Activity 
{
	
	EditText t1,t2;
	//t3;
	Button b1;
	//b2,b3,b4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);
       
        t1=(EditText)findViewById(R.id.editText1);
        t2=(EditText)findViewById(R.id.editText2);
        
        b1=(Button)findViewById(R.id.button1);
     
       b1.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			
			String val1=t1.getText().toString();
			String val2=t2.getText().toString();
			
			int a=Integer.parseInt(val1);
			int b=Integer.parseInt(val2);
			
			int sum=a+b;
			Toast.makeText(getApplicationContext(), String.valueOf("Addition:"+sum),Toast.LENGTH_LONG).show();
			
					
		}
	});
       

    }

    
    
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity3, menu);
		return false;
    }
    
}
