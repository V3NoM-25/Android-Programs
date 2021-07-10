package com.example.login;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText e1,e2;
	Button b1;
	Button btn,btn2,btn3,btn4,btn5;
	
	


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        b1=(Button)findViewById(R.id.b1);
    
    		   
    		   
    		   

        

        b1.setOnClickListener(new OnClickListener() {
        
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(e1.getText().toString().equals("admin") && e2.getText().toString().equals("123")){
					
					Intent in=new Intent(getApplicationContext(),DashboardActivity.class);
					startActivity(in);
					
				}
				else{
					Toast.makeText(getApplicationContext(), "username and password incorrcet", Toast.LENGTH_LONG).show();
					
				}
			}
		} );
        
        
        
        	
        		
        		
        		
        		
        		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}