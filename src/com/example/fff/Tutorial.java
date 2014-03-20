package com.example.fff;

import com.example.fbgvffdbhsj.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tutorial  extends Activity{

	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tutorial);
		
		TextView tutorial_text = (TextView) findViewById(R.id.editText1);
		Button b_back = (Button) findViewById(R.id.bBack);
		Button b_start = (Button) findViewById(R.id.bStart);		
		tutorial_text.setText("1. Enter budget. \n"
				+ "2. Enter tax rate.\n"
				+ "3. Start adding items into basket by stating their name, benefit and price.\n"
				+ "4. Click calculate and see the optimal item set.");
	
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
