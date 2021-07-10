package com.example.addno;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Calc_Activity extends Activity {
	EditText t1,t2,t3;
	Button b1,b2;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_main);
        t1=(Edit)
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		})
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calc_, menu);
        return true;
    }
    
}
