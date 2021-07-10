package com.example.checkb;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Checkbdemo extends Activity {
CheckBox c1,c2,c3;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbdemo);
        c1=(CheckBox)findViewById(R.id.checkBox1);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int total=0;
				StringBuilder sb=new StringBuilder();
				//StringBuilder sb1=new StringBuilder();
				sb.append("Selected Items\n");
				if(c1.isChecked())
				{
					sb.append("\nButterScotch:Rs.100");
					total=total+100;
				}
				if(c2.isChecked())
				{
					sb.append("\nVanilla:Rs.80");
					total=total+80;
				}
				if(c3.isChecked())
				{
					sb.append("\nChocklet:Rs.60");
					total=total+60;
				}
				sb.append("\nTotal Rs."+total);
				
			Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_LONG).show();  
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.checkbdemo, menu);
        return true;
    }
    
}
