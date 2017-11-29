package org.androidtown.travel;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by hyean on 2017-11-28.
 */

public class SelectActivity extends AppCompatActivity{
    ArrayList categoryList;
    Spinner categorySpinner;
    Spinner countySpinner;
    Context context;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        context = this;
        setView();
    }

    private void setView() {
        categoryList = new ArrayList();
        categoryList.add("대한민국");


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categoryList);

        categorySpinner = (Spinner) findViewById(R.id.spinner1);
        categorySpinner.setPrompt("골라주세요.");
        categorySpinner.setAdapter(adapter);
        categorySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int arg2, long arg3) {
            }

            @Override
            public void onNothingSelected(AdapterView arg0) {

            }
        });
    }
}
