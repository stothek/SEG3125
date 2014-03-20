package com.example.fff;

import com.example.fbgvffdbhsj.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
	//MediaPlayer song;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		//song = MediaPlayer.create(Splash.this, R.raw.smb);
		//song.start();
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(2500);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
				finally{
					Intent mainActivity = new Intent(Splash.this, MainActivity.class);
					startActivity(mainActivity);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		//song.release();
		finish();
	}
	
}
