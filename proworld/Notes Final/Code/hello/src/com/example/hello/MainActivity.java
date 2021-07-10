package com.example.hello;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity 
{
	
	Button b1;
	Button b2;
	
	TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        t1=(TextView)findViewById(R.id.txt1);
        
        String s1= new String("hello world");
        t1.setText(s1);
       
        b1.setOnClickListener(new OnClickListener()
     //   b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		})
        {
        	@SuppressLint("ResourceAsColor") @Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
        		String s=new String("hello Matoshri");
				t1.setText(s);
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
