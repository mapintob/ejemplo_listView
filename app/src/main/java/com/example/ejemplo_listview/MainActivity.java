package com.example.ejemplo_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listViewMain);

        final List<String> names = new ArrayList<String>();

        // datos del listview
        names.add("Juan");
        names.add("Armando");
        names.add("Eduardo");
        names.add("Ernie");
        names.add("Gonzalo");
        names.add("Ismael");

        names.add("Juan");
        names.add("Armando");
        names.add("Eduardo");
        names.add("Ernie");
        names.add("Gonzalo");
        names.add("Ismael");

        names.add("Juan");
        names.add("Armando");
        names.add("Eduardo");
        names.add("Ernie");
        names.add("Gonzalo");
        names.add("Ismael");
        //Adaptador de la vista por defecto de android.

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);

        //unir nuestro adaptador con el listView
        listView.setAdapter(adapter);

        //evento para mostrar nombre donde se hizo clic

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"clic en..."+names.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
