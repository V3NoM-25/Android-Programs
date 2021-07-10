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

public class Main_Activity extends Activity {

	EditText et;
	
	Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);
        
        et=(EditText)findViewById(R.id.et_no);
        
        btn=(Button)findViewById(R.id.bt_c);
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String no=et.getText().toString();
				Intent call=new Intent(Intent.ACTION_CALL);
				call.setData(Uri.parse("tel="+no));
				
				startActivity(call);
		
				
				
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_, menu);
        return true;
    }
    
}
