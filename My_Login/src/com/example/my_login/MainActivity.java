package com.example.my_login;

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
	EditText et_uname,et_password;
	Button btn_login;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_uname=(EditText)findViewById(R.id.et_uname);
        et_password=(EditText)findViewById(R.id.et_password);
        btn_login=(Button)findViewById(R.id.btn_login);
        
        btn_login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(et_uname.getText().toString().equals("Admin") && et_password.getText().toString().equals("123")){
		        	
		        	Intent in1=new Intent(getApplicationContext(),DashboardActivity.class);
		        	startActivity(in1);
		        	Toast.makeText(getApplicationContext(), "Login Successfull....", Toast.LENGTH_LONG).show();
		        }
		        else {
		        	Toast.makeText(getApplicationContext(), "Not Login Successfull....", Toast.LENGTH_LONG).show();
				}
		        
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
