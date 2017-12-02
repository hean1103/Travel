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
    ArrayList countryList;
    ArrayList cityList;
    ArrayList subcityList;
    ArrayList dayList;
    Spinner countrySpinner;
    Spinner citySpinner;
    Spinner subcitySpinner;
    Spinner daySpinner;

    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        context = this;
        setView();
    }

    private void setView() {
        countryList = new ArrayList();
        cityList = new ArrayList();
        subcityList = new ArrayList();
        dayList = new ArrayList();
        countryList.add("대한민국");

        cityList.add("종로구");
        cityList.add("서대문구");
        cityList.add("동대문구");
        cityList.add("은평구");
        cityList.add("중랑구");
        cityList.add("수지구");
        cityList.add("성북구");
        //종로구 선택시만 뜨게 해줘. subcity...
        subcityList.add("지역 전체");
        subcityList.add("인사동");
        subcityList.add("통인시장");
        subcityList.add("청계천 ");

        dayList.add("당일치기");
        dayList.add("1박");
        dayList.add("2박");
        dayList.add("3박");
        dayList.add("4박");


        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, countryList);
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, cityList);
        ArrayAdapter adapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, subcityList);
        ArrayAdapter adapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, dayList);

        countrySpinner = (Spinner) findViewById(R.id.spinner1);
        countrySpinner.setPrompt("골라주세요.");
        countrySpinner.setAdapter(adapter1);
        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int arg2, long arg3) {
            }

            @Override
            public void onNothingSelected(AdapterView arg0) {

            }
        });

        citySpinner = (Spinner) findViewById(R.id.spinner2);
        citySpinner.setPrompt("구 정하기");
        citySpinner.setAdapter(adapter2);
        citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int arg2, long arg3) {
            }

            @Override
            public void onNothingSelected(AdapterView arg0) {

            }
        });

        subcitySpinner = (Spinner) findViewById(R.id.spinner3);
        subcitySpinner.setPrompt("지역 정하기");
        subcitySpinner.setAdapter(adapter3);
        subcitySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int arg2, long arg3) {
            }

            @Override
            public void onNothingSelected(AdapterView arg0) {

            }
        });

        daySpinner = (Spinner) findViewById(R.id.spinner4);
        daySpinner.setPrompt("일정 정하기");
        daySpinner.setAdapter(adapter4);
        daySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int arg2, long arg3) {
            }

            @Override
            public void onNothingSelected(AdapterView arg0) {

            }
        });
    }
}
