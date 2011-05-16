package com.example.checkdateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheckDateTime extends Activity {

	private TextView myDateTimeView;
	private Button myShowDate;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        myDateTimeView = (TextView) findViewById(R.id.DateTimeDisplay);
        myShowDate = (Button) findViewById(R.id.WhatTime);

        myShowDate.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				showCurrentDate();
			}
		});

		//初回起動時の表示用
		showCurrentDate();
	}

	private void showCurrentDate(){
		SimpleDateFormat sdf =
			new SimpleDateFormat("yyyy.MM.dd '/' hh:mm:ss a zzz");
		Date currentTime =new Date();
		myDateTimeView.setText(sdf.format(currentTime));
	}
}