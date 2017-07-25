package com.example.hardik.delhitourism;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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
    public void a(View view)
    {
        Intent intent = new Intent(this, MainActivity22Activity.class);
        startActivity(intent);
    }
    public void b(View view)
    {
        Intent intent = new Intent(this, MainActivity23Activity.class);
        startActivity(intent);
    }
    public void c(View view)
    {
        Intent intent = new Intent(this, MainActivity24Activity.class);
        startActivity(intent);
    }
    public void d(View view)
    {
        Intent intent = new Intent(this, MainActivity25Activity.class);
        startActivity(intent);
    }
    public void e(View view)
    {
        Intent intent = new Intent(this, MainActivity26Activity.class);
        startActivity(intent);
    }
    public void f(View view)
    {
        Intent intent = new Intent(this, MainActivity27Activity.class);
        startActivity(intent);
    }
    public void g(View view)
    {
        Intent intent = new Intent(this, MainActivity28Activity.class);
        startActivity(intent);
    }
    public void h(View view)
    {
        Intent intent = new Intent(this, MainActivity29Activity.class);
        startActivity(intent);
    }
    public void i(View view)
    {
        Intent intent = new Intent(this, MainActivity210Activity.class);
        startActivity(intent);
    }
    public void j(View view)
    {
        Intent intent = new Intent(this, MainActivity211Activity.class);
        startActivity(intent);
    }
    public void k(View view)
    {
        Intent intent = new Intent(this, MainActivity212Activity.class);
        startActivity(intent);
    }
    public void l(View view)
    {
        Intent intent = new Intent(this, MainActivity213Activity.class);
        startActivity(intent);
    }
    public void m(View view)
    {
        Intent intent = new Intent(this, MainActivity214Activity.class);
        startActivity(intent);
    }
    public void n(View view)
    {
        Intent intent = new Intent(this, MainActivity215Activity.class);
        startActivity(intent);
    }
    public void o(View view)
    {
        Intent intent = new Intent(this, MainActivity216Activity.class);
        startActivity(intent);
    }
    public void p(View view)
    {
        Intent intent = new Intent(this, MainActivity217Activity.class);
        startActivity(intent);
    }
    public void q(View view)
    {
        Intent intent = new Intent(this, MainActivity218Activity.class);
        startActivity(intent);
    }
    public void r(View view)
    {
        Intent intent = new Intent(this, MainActivity220Activity.class);
        startActivity(intent);
    }
    public void s(View view)
    {
        Intent intent = new Intent(this, MainActivity219Activity.class);
        startActivity(intent);
    }
    public void t(View view)
    {
        Intent intent = new Intent(this, MainActivity221Activity.class);
        startActivity(intent);
    }
    public void u(View view)
    {
        Intent intent = new Intent(this, MainActivity222Activity.class);
        startActivity(intent);
    }
    public void v(View view)
    {
        Intent intent = new Intent(this, MainActivity223Activity.class);
        startActivity(intent);
    }
}
