package com.example.fff;

import com.example.fbgvffdbhsj.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button start, about, tutorial;
	TextView display;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		start = (Button) findViewById(R.id.button_Start);
		about = (Button) findViewById(R.id.button_about);
		tutorial = (Button) findViewById(R.id.button_tutorial);
		display = (TextView) findViewById(R.id.tvDisplay);
		
		// make listeners
		start.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent start = new Intent(getApplicationContext(), Start.class);
				startActivity(start);
			}
		});

		about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent about = new Intent(getApplicationContext(), About.class);
				startActivity(about);

			}
		});

		tutorial.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent tutor = new Intent(getApplicationContext(), Tutorial.class);
				startActivity(tutor);

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
