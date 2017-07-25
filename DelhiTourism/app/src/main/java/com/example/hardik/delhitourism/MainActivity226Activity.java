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


public class MainActivity226Activity extends Activity implements AdapterView.OnItemClickListener  {
    ListView lv;
    String[] names = {"Humayun's Tomb","India Gate","Jantar Mantar","National Museum","Parliament House","Purana Quila","Qutub Minar","Rashtrapati Bhavan","Red Fort","Safdarjung Tomb","The Garden of Five Senses","Tughlaqabad Fort","National Zoological Park","Agrasen ki Baoli" };
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
                Intent intent = new Intent(this, MainActivity24Activity.class);
                startActivity(intent);
                break;
            }
            case (1):
            {
                Intent intent = new Intent(this, MainActivity25Activity.class);
                startActivity(intent);
                break;
            }
            case (2):
            {
                Intent intent = new Intent(this, MainActivity27Activity.class);
                startActivity(intent);
                break;
            }
            case (3):
            {
                Intent intent = new Intent(this, MainActivity29Activity.class);
                startActivity(intent);
                break;
            }
            case (4):
            {
                Intent intent = new Intent(this, MainActivity210Activity.class);
                startActivity(intent);
                break;
            }
            case (5):
            {
                Intent intent = new Intent(this, MainActivity211Activity.class);
                startActivity(intent);
                break;
            }
            case (6):
            {
                Intent intent = new Intent(this, MainActivity212Activity.class);
                startActivity(intent);
                break;
            }
            case (7):
            {
                Intent intent = new Intent(this, MainActivity213Activity.class);
                startActivity(intent);
                break;
            }
            case (8):
            {
                Intent intent = new Intent(this, MainActivity214Activity.class);
                startActivity(intent);
                break;
            }
            case (9):
            {
                Intent intent = new Intent(this, MainActivity216Activity.class);
                startActivity(intent);
                break;
            }
            case (10):
            {
                Intent intent = new Intent(this, MainActivity217Activity.class);
                startActivity(intent);
                break;
            }
            case (11):
            {
                Intent intent = new Intent(this, MainActivity218Activity.class);
                startActivity(intent);
                break;
            }
            case (12):
            {
                Intent intent = new Intent(this, MainActivity232Activity.class);
                startActivity(intent);
                break;
            }
            case (13):
            {
                Intent intent = new Intent(this, MainActivity233Activity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
