package com.example.jorjborj.avocadomenu;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> categories = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        categories.add("فطور لوكندة");
        categories.add("سلطات لوكندة");
        categories.add("ايطاليا في لوكندة");
        categories.add("فوكاتشا لوكندة");
        categories.add("منوعات لوكندة");
        categories.add("باستا");
        categories.add("وجبات رئيسية");
        categories.add("وجبات اطفال");
        categories.add("عصائر لوكندة");
        categories.add("شاي");
        categories.add("مشروبات ساخنة");

        ListView categorieslv = (ListView)findViewById(R.id.categories);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, categories);

        categorieslv.setAdapter(adapter);
    }
}
