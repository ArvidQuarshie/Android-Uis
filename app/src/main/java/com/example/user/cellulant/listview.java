package com.example.user.cellulant;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by user on 8/5/16.
 */
public class listview extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
//
//        getting a list view object from xml
        listview = (ListView)findViewById(R.id.list);

        //array to show values in the listview

        String[] Content= new String[]{
          "Airtime", "SchoolFees", "Tokens" , "Crates Of Soda"

        };

        //defining a new adapter

        ArrayAdapter<String>Adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,Content);

//Assigning the adapter to the listview

        listview.setAdapter(Adapter);


        //add an item listener on the listview

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = null;


                //listview clicked item position

                int position=0;
                int itemPosition= position;

                //listview clicked item value

                String itemValue = (String)listview.getItemAtPosition(position);


                //alert or next activity

                Toast.makeText(getApplicationContext(),
                        "Position :"+i+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();


            }


        });
    }
}
