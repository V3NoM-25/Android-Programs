package com.example.progressbar1;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	Button b1;
	ProgressDialog pb;
	private int pbstatus = 0;
	private Handler progressBarHandler = new Handler();
    private long fileSize = 0;
	
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//addListenerOnButtonClick();
		b1 = (Button) findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener(){
 
		   @Override
		   public void onClick(View v) {
 
			// creating progress bar dialog
			pb = new ProgressDialog(v.getContext());
			pb.setCancelable(true);
			pb.setMessage("File downloading ...");
			pb.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			pb.setProgress(0);
			pb.setMax(100);
			pb.show();
 
			//reset progress bar and filesize status
			pbstatus = 0;
 			fileSize = 0;
 
			new Thread(new Runnable() {
			  public void run() {
				while (pbstatus < 100) {
 
				  // performing operation
					pbstatus = status();
 
				  try {
					Thread.sleep(1000);
				  } catch (InterruptedException e) {
					e.printStackTrace();
				  }
 
				  // Updating the progress bar
				  progressBarHandler.post(new Runnable() {
					public void run() {
					  pb.setProgress(pbstatus);
					}
				  });
				}
 
				// performing operation if file is downloaded,
				if (pbstatus >= 100) {
 
					// sleeping for 1 second after operation completed
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {e.printStackTrace();}
 
					// close the progress bar dialog
					pb.dismiss();
				}
			  }
		     }).start();
            }//end of onClick method
          });
	}
	
//public void addListenerOnButtonClick() {
		 
		
      //   }
 
	// checking how much file is downloaded and updating the filesize 
	public int status() {
		//The range of ProgressDialog starts from 0 to 10000
		while (fileSize <= 10000) {
 			fileSize++;
 			if (fileSize == 1000) {
				return 10;
			} else if (fileSize == 2000) {
				return 20;
			} else if (fileSize == 3000) {
				return 30;
			} else if (fileSize == 4000) {
			return 40;
			} else if (fileSize == 5000) {
				return 50;
			} else if (fileSize == 6000) {
				return 60;
			}
			 else if (fileSize == 7000) {
					return 70;
			}
			 else if (fileSize == 8000) {
					return 80;
			}
			 else if (fileSize == 9000) {
					return 90;
			}
			 else if (fileSize == 10000) {
					return 100;
			}
		}//end of while
		return 100;
	}//end of doOperation

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}