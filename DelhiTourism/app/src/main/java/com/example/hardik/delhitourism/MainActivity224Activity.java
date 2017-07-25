package com.example.hardik.delhitourism;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity224Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity224);
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }
public void wp(View view){
    Intent intent = new Intent(this,MainActivity225Activity.class);
    startActivity(intent);
}
    public void tp(View view){
        Intent intent = new Intent(this,MainActivity226Activity.class);
        startActivity(intent);
    }
    public void sp(View view){
        Intent intent = new Intent(this,MainActivity227Activity.class);
        startActivity(intent);
    }
}
