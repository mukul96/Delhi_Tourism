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


public class MainActivity225Activity extends Activity implements AdapterView.OnItemClickListener  {
ListView lv;
    String[] names = {"Akshardham Temple","Gurudwara Bangla Sahib","ISKCON Temple","Jama Masjid","Laxminarayan Temple","Lotus Temple","Sacred Heart Cathedral","Nizamuddin Dargah" };
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
                Intent intent = new Intent(this, MainActivity22Activity.class);
                startActivity(intent);
                break;
            }
            case (1):
            {
                Intent intent = new Intent(this, MainActivity23Activity.class);
                startActivity(intent);
                break;
            }
            case (2):
            {
                Intent intent = new Intent(this, MainActivity229Activity.class);
                startActivity(intent);
                break;
            }
            case (3):
            {
                Intent intent = new Intent(this, MainActivity26Activity.class);
                startActivity(intent);
                break;
            }
            case (4):
            {
                Intent intent = new Intent(this, MainActivity228Activity.class);
                startActivity(intent);
                break;
            }
            case (5):
            {
                Intent intent = new Intent(this, MainActivity28Activity.class);
                startActivity(intent);
                break;
            }
            case (6):
            {
                Intent intent = new Intent(this, MainActivity215Activity.class);
                startActivity(intent);
                break;
            }
            case (7):
            {
                Intent intent = new Intent(this, MainActivity231Activity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
