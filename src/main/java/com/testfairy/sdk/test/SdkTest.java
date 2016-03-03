package com.testfairy.sdk.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.testfairy.TestFairy;


public class SdkTest extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//	    TestFairy.setServerEndpoint("http://giltsl.gs.dev.testfairy.net/services/");
	    TestFairy.begin(SdkTest.this, "a79971822e08306fd2c7eb1c3f421ed3b0b497da");
	    ((TextView)findViewById(R.id.sdk_version)).setText(TestFairy.getVersion());

    }
}
