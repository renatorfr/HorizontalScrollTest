package com.nitryx.horizontalscrolltest;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	private MyHorizontalLayout myHorizontalLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		myHorizontalLayout = (MyHorizontalLayout) findViewById(R.id.mygallery);

		String externalStorageDirectoryPath = Environment.getExternalStorageDirectory()
				.getAbsolutePath();

		String targetPath = externalStorageDirectoryPath + "/test/";

		Toast.makeText(getApplicationContext(), targetPath, Toast.LENGTH_LONG).show();

		File targetDirector = new File(targetPath);

		File[] files = targetDirector.listFiles();

		for (File file : files) {
			myHorizontalLayout.add(file.getAbsolutePath());
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
