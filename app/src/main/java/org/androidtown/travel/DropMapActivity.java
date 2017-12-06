package org.androidtown.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class DropMapActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_drop_map);

        Button next = (Button) findViewById(R.id.optimize);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DropMapActivity.this, ReccomAfterActivity.class);
                startActivity(intent);
            }
        });

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

    }
}
