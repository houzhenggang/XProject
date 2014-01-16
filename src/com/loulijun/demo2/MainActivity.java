package com.loulijun.demo2;


import android.os.Bundle;
import com.phonegap.*;

public class MainActivity extends DroidGap {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        super.loadUrl("file:///android_asset/www/index.html");
	    }
}
