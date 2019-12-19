package com.course.example.simpledemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class SimpleDemo extends Activity {

	private TextView text;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// connect variable to the TextView in main.xml
		text = (TextView) findViewById(R.id.TextView01);
	}

	// Activity method listening for keystrokes
	// Return true if handled, false if not 
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		super.onKeyDown(keyCode, event);

		switch (keyCode) {
		case KeyEvent.KEYCODE_X:
			text.setText("X");
			break;
		case KeyEvent.KEYCODE_Y:
			text.setText("Y");
			break;
		case KeyEvent.KEYCODE_Z:
			text.setText("Z");
			break;
		default:
			text.setText("Click X, Y, or Z ");
		}
		return true;
	}

}