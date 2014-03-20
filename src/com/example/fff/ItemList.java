package com.example.fff;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

public class ItemList extends Activity{
	Button addItem, cancel;
	Spinner itemList;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(0x7f030003);
		cancel = (Button) findViewById(R.id.closeButton);
	}
	
}
