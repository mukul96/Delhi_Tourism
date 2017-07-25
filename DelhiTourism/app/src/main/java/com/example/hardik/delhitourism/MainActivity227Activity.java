package com.example.hardik.delhitourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity227Activity extends Activity implements AdapterView.OnItemClickListener  {
    ListView lv;
    String[] names = {"Ansal Plaza","Chandni Chowk","Connaught Place","Delhi Haat","Hauz Khas Village","Karol Bagh","Select Citywalk","DLF Emporio" };
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity225);
        lv=(ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,names);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(position){
            case (0):
            {
                Intent intent = new Intent(this, MainActivity220Activity.class);
                startActivity(intent);
                break;
            }
            case (1):
            {
                Intent intent = new Intent(this, MainActivity221Activity.class);
                startActivity(intent);
                break;
            }
            case (2):
            {
                Intent intent = new Intent(this, MainActivity222Activity.class);
                startActivity(intent);
                break;
            }
            case (3):
            {
                Intent intent = new Intent(this, MainActivity219Activity.class);
                startActivity(intent);
                break;
            }
            case (4):
            {
                Intent intent = new Intent(this, MainActivity230Activity.class);
                startActivity(intent);
                break;
            }
            case (5):
            {
                Intent intent = new Intent(this, MainActivity223Activity.class);
                startActivity(intent);
                break;
            }
            case (6):
            {
                Intent intent = new Intent(this, MainActivity234Activity.class);
                startActivity(intent);
                break;
            }
            case (7):
            {
                Intent intent = new Intent(this, MainActivity235Activity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
