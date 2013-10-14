package com.example.loginanimation;

import android.os.Bundle;
import android.view.*;
import android.app.Activity;
import android.content.*;
import android.view.Menu;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
        
        //Login button onClick action
        findViewById(R.id.login_button).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent myIntent = new Intent(LoginActivity.this, LoginFormActivity.class);
            	//myIntent.putExtra("key", value); //Optional parameters
            	startActivity(myIntent);
            	overridePendingTransition ( R.anim.incoming_slide ,  R.anim.outgoing_slide );
            }
        });
     
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }
    
}
