package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ImageGallActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_gall);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.image_gall, menu);
		return true;
	}

}
