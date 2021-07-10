package com.example.my_login;

import java.util.ArrayList;
import java.util.Locale;

import android.os.Bundle;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class VoiceRecognizerActivity extends Activity {
	TextToSpeech t1;
	private TextView txtSpeechInput;
    private ImageButton btnSpeak;
    private final int REQ_CODE_SPEECH_INPUT = 100;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_voice_recognizer);
		txtSpeechInput = (TextView) findViewById(R.id.txtSpeech);
//		 t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
//	         @Override
//	         public void onInit(int status) {
//	            if(status != TextToSpeech.ERROR) {
//	               t1.setLanguage(Locale.US);
//	            }
//	         }
//	      });
		 Button btn=(Button)findViewById(R.id.btn_voice);
		 btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				promptSpeechInput();
			}
		});
		 
		 
//		 String toSpeak = "Anubhav Nonda";
//         Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
//         t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
	}
	private void promptSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                getString(R.string.hello_world));
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    getString(R.string.hello_world),
                    Toast.LENGTH_SHORT).show();
        }
    }
 
    /**
     * Receiving speech input
     * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
 
        switch (requestCode) {
        case REQ_CODE_SPEECH_INPUT: {
            if (resultCode == RESULT_OK && null != data) {
 
                ArrayList<String> result = data
                        .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                String a=result.get(0).toString();
                
                if(a.equals("addition")){
                	
                	Intent in1= new Intent(getApplicationContext(),MainActivity.class);
    				startActivity(in1);
                }
 if(a.equals("calculator")){
                	
	 
                	Intent in1= new Intent(getApplicationContext(),CalculatorActivity.class);
    				startActivity(in1);
                }
 if(a.equals("change colour")){
 	
 	Intent in1= new Intent(getApplicationContext(),ChangeColorActivity.class);
		startActivity(in1);
 }
                txtSpeechInput.setText(result.get(0));
            }
            break;
        }
 
        }}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.voice_recognizer, menu);
		return true;
	}

}
