package com.example.fff;

import com.example.fbgvffdbhsj.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class Start extends Activity{
	Button delete, listread, additem, listsave;
	EditText itemname, itemquantity, itemprice;
	SeekBar itemavailability;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add__item);

		delete = (Button) findViewById(R.id.button_Delete);
		listread = (Button) findViewById(R.id.button_ListRead);
		additem = (Button) findViewById(R.id.button_AddItem);
		listsave = (Button) findViewById(R.id.button_ListSave);
		
		itemname = (EditText) findViewById(R.id.itemName);
		itemquantity = (EditText) findViewById(R.id.itemQuantity);
		itemprice = (EditText) findViewById(R.id.itemPrice);
		
		itemavailability = (SeekBar) findViewById(R.id.itemAvailability);
		
		delete.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				itemname.setText("");
				itemquantity.setText("");
				itemprice.setText("");
			}
		});
		
		listread.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent start = new Intent(getApplicationContext(), ItemList.class);
				startActivity(start);
			}
		});
	
		
		additem.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				String name = itemname.getText().toString();
				double quantity = Integer.parseInt(itemquantity.getText().toString());
				double price = Double.parseDouble(itemprice.getText().toString());
				
				node n = new node(name, quantity, price);
			}
		});
		
		listsave.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				String name = itemname.getText().toString();
				double quantity = Integer.parseInt(itemquantity.getText().toString());
				double price = Double.parseDouble(itemprice.getText().toString());
				
				node n = new node(name, quantity, price);
			}
		});	
}
}