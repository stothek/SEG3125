package com.example.fff;

import com.example.fbgvffdbhsj.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class About  extends Activity{

	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aboutscreen);
		
		TextView about_text = (TextView) findViewById(R.id.editText1);
		Button b_back = (Button) findViewById(R.id.bBack);
		Button b_start = (Button) findViewById(R.id.bStart);
		Button b_tutorial = (Button) findViewById(R.id.bTutorial);
		
		about_text.setText("Shopping Cart Optimizer was created by Scott Hassoun and Keith Noakes to let users make better decisions in the grocery store.");
	
		b_back.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent main = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(main);

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
