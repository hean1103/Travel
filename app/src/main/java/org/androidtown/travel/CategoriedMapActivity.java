package org.androidtown.travel;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class CategoriedMapActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton headerImageView;

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
        setContentView(R.layout.activity_categoried_map);

        setView();
    }

    public void setView(){
        headerImageView = (ImageButton) findViewById(R.id.headerImageView);
        totalRadioBtn = (RadioButton)findViewById(R.id.totalRadioBtn);
        redRadioBtn = (RadioButton)findViewById(R.id.redRadioBtn);
        yellowRadioBtn = (RadioButton)findViewById(R.id.yellowRadioBtn);
        greenRadioBtn = (RadioButton)findViewById(R.id.greenRadioBtn);
        blueRadioBtn = (RadioButton)findViewById(R.id.blueRadioBtn);
        blackRadioBtn = (RadioButton)findViewById(R.id.blackRadioBtn);
        violetRadioBtn = (RadioButton)findViewById(R.id.redRadioBtn);
        optimizeButton = (Button)findViewById(R.id.optimize);

        mapImageView = (ImageView)findViewById(R.id.mapImageView);

        headerImageView.setOnClickListener(this);

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
            Intent intent = new Intent(CategoriedMapActivity.this, ReccomAfterActivity.class);
            startActivity(intent);
        }
    }

}
