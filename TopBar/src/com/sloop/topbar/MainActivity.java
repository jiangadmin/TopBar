package com.sloop.topbar;

import com.sloop.view.TopBar;
import com.sloop.view.TopBar.TopBarClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState){

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TopBar topBar = (TopBar) findViewById(R.id.topbar);
/*		topBar.setLeftIsVisible(false);
		topBar.setRightIsVisible(false);*/
		topBar.setOnTopBarClickListener(new TopBarClickListener() {

			@Override
			public void rightclick(){
				Toast.makeText(MainActivity.this, "Right Clicked", Toast.LENGTH_SHORT).show();
			}

			@Override
			public void leftclick(){
				Toast.makeText(MainActivity.this, "Left Clicked", Toast.LENGTH_SHORT).show();
			}
		});
	}

}
