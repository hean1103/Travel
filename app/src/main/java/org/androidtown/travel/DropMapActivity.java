package org.androidtown.travel;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class DropMapActivity extends AppCompatActivity implements View.OnClickListener {


    ArrayList cityList1;
    ArrayList cityList2;
    ArrayList cityList3;
    ArrayList cityList4;

    Spinner citySpinner1;
    Spinner citySpinner2;
    Spinner citySpinner3;
    Spinner citySpinner4;



    RadioButton redRadioBtn;
    RadioButton yellowRadioBtn;
    RadioButton greenRadioBtn;
    RadioButton blueRadioBtn;
    RadioButton blackRadioBtn;
    RadioButton violetRadioBtn;
    RadioButton totalRadioBtn;

    ImageView mapImageView;
    Button optimizeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_map);


        setView1();
        setView2();
    }

    public void setView1(){
        totalRadioBtn = (RadioButton)findViewById(R.id.totalRadioBtn);
        redRadioBtn = (RadioButton)findViewById(R.id.redRadioBtn);
        yellowRadioBtn = (RadioButton)findViewById(R.id.yellowRadioBtn);
        greenRadioBtn = (RadioButton)findViewById(R.id.greenRadioBtn);
        blueRadioBtn = (RadioButton)findViewById(R.id.blueRadioBtn);
        blackRadioBtn = (RadioButton)findViewById(R.id.blackRadioBtn);
        violetRadioBtn = (RadioButton)findViewById(R.id.redRadioBtn);
        optimizeButton = (Button)findViewById(R.id.optimize);

        mapImageView = (ImageView)findViewById(R.id.mapImageView);

        totalRadioBtn.setOnClickListener(this);
        redRadioBtn.setOnClickListener(this);
        yellowRadioBtn.setOnClickListener(this);
        greenRadioBtn.setOnClickListener(this);
        blackRadioBtn.setOnClickListener(this);
        blueRadioBtn.setOnClickListener(this);
        violetRadioBtn.setOnClickListener(this);
        optimizeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.redRadioBtn)    {mapImageView.setImageResource(R.drawable.map_red);}
        else if(v.getId() == R.id.yellowRadioBtn)    {mapImageView.setImageResource(R.drawable.map_yellow);}
        else if(v.getId() == R.id.greenRadioBtn)    {mapImageView.setImageResource(R.drawable.map_green);}
        else if(v.getId() == R.id.blueRadioBtn)    {mapImageView.setImageResource(R.drawable.map_blue);}
        else if(v.getId() == R.id.blackRadioBtn)    {mapImageView.setImageResource(R.drawable.map_black);}
        else if(v.getId() == R.id.violetRadioBtn)    {mapImageView.setImageResource(R.drawable.map_violet);}
        else if(v.getId() == R.id.totalRadioBtn)    {mapImageView.setImageResource(R.drawable.total_category_map);}
        else if(v.getId() == R.id.optimize){
            Intent intent = new Intent(DropMapActivity.this, ReccomAfterActivity.class);
            startActivity(intent);
        }
    }

    private void setView2() {
        cityList1= new ArrayList();
        cityList2 = new ArrayList();
        cityList3= new ArrayList();
        cityList4 = new ArrayList();
        cityList1.add("인사동 쌈짓길");

        cityList2.add("청계천거리");

        cityList3.add("통인시장");
        cityList3.add("국립 민속 박물관");
        cityList3.add("창덕궁");
        cityList3.add("조계사");
        cityList3.add("명동");
        cityList3.add("광화문");
        cityList3.add("광장시장");
        cityList3.add("동대입구");
        cityList3.add("동대문");

        cityList4.add("경복궁");

        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, cityList1);
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, cityList2);
        ArrayAdapter adapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, cityList3);
        ArrayAdapter adapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, cityList4);

        citySpinner1 = (Spinner) findViewById(R.id.spinner1);
        citySpinner1.setPrompt("골라주세요.");
        citySpinner1.setAdapter(adapter1);
        citySpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int arg2, long arg3) {
            }

            @Override
            public void onNothingSelected(AdapterView arg0) {

            }
        });

        citySpinner2 = (Spinner) findViewById(R.id.spinner2);
        citySpinner2.setPrompt("구 정하기");
        citySpinner2.setAdapter(adapter2);
        citySpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int arg2, long arg3) {
            }

            @Override
            public void onNothingSelected(AdapterView arg0) {

            }
        });

        citySpinner3 = (Spinner) findViewById(R.id.spinner3);
        citySpinner3.setPrompt("지역 정하기");
        citySpinner3.setAdapter(adapter3);
        citySpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int arg2, long arg3) {
            }

            @Override
            public void onNothingSelected(AdapterView arg0) {

            }
        });

        citySpinner4 = (Spinner) findViewById(R.id.spinner4);
        citySpinner4.setPrompt("일정 정하기");
        citySpinner4.setAdapter(adapter4);
        citySpinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int arg2, long arg3) {
            }

            @Override
            public void onNothingSelected(AdapterView arg0) {

            }
        });
    }
}
