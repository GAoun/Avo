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

        categories.add("فطور لوكندا");
        categories.add("سلطات لوكندا");
        categories.add("ايطاليا في لوكندا");
        categories.add("فوكاتشا لوكندا");
        categories.add("منوعات لوكندا");
        categories.add("باستا");
        categories.add("وجبات رئيسية");
        categories.add("وجبات اطفال");
        categories.add("عصائر لوكندا");
        categories.add("شاي");
        categories.add("مشروبات ساخنة");

        ListView categorieslv = (ListView)findViewById(R.id.categories);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, categories);

        categorieslv.setAdapter(adapter);
    }
}
