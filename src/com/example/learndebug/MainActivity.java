package com.example.learndebug;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button button1;
	private Button button2;
	private String[] stringArray;
    private int mInteger = 0;
    private static final String ACTIVITY_TAG="LogDemo";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button1 = (Button) findViewById (R.id.button_1);
		button2 = (Button) findViewById (R.id.button_2);
		
		button1.setOnClickListener(new Button.OnClickListener(){ 
            @Override
            public void onClick(View v) {
            	// add action here
            	Toast.makeText(MainActivity.this, "點擊了Button1", Toast.LENGTH_SHORT).show();
            	Log.v(MainActivity.ACTIVITY_TAG, "This is Verbose.");
                Log.d(MainActivity.ACTIVITY_TAG, "This is Debug.");
                Log.i(MainActivity.ACTIVITY_TAG, "This is Information");
                Log.w(MainActivity.ACTIVITY_TAG, "This is Warnning.");
                Log.e(MainActivity.ACTIVITY_TAG, "This is Error.");
            }         

        });
		
		button2.setOnClickListener(new Button.OnClickListener(){ 
            @Override
            public void onClick(View v) {
            	// add action here
            	mInteger = 5;
            	Toast.makeText(MainActivity.this, stringArray[0], Toast.LENGTH_SHORT).show();
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
