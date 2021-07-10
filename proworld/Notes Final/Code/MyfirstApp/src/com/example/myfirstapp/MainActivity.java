package com.example.myfirstapp;

import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	double val1=0.0;
	double val2=0.0;
	double total=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);
      //  TextView txtchange=(TextView)findViewById(R.id.button1);
        final EditText etval1=(EditText)findViewById(R.id.button2);
        final EditText etval2=(EditText)findViewById(R.id.button3);
        Button addbtn=(Button)findViewById(R.id.button1);
        
        addbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				val1=Float.parseFloat(etval1.getText().toString());
				val2=Float.parseFloat(etval2.getText().toString());
				total=val1+val2;
				//String tot=String.valueOf(total);
				Toast.makeText(getApplicationContext(), "Total"+total,Toast.LENGTH_LONG).show();
			//	txtchange.setText(tot);
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
      //  getMenuInflater().inflate(R.Menu, menu);
        return true;
    }
    
}
