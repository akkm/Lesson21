package com.example.lesson21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        String shareText = intent.getStringExtra("text");
        if (shareText != null) {
            Toast.makeText(this, shareText + " を受け取りました", Toast.LENGTH_SHORT).show();
        }

        LessonDatabaseHelper helper = new LessonDatabaseHelper(this);

        List<String> nameList = helper.selectAll();

        if (nameList.isEmpty()) {
            helper.insert("Dさん");
            helper.insert("Bさん");
            helper.insert("Fさん");
            helper.insert("Aさん");
            helper.insert("Cさん");
            helper.insert("Eさん");

            nameList = helper.selectAll();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, nameList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        helper.close();
    }
}
