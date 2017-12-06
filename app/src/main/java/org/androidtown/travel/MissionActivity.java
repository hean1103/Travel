package org.androidtown.travel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by hyean on 2017-12-02.
 */

public class MissionActivity extends ActionBarActivity{
    int img1 = R.drawable.mission3;
    int img2 = R.drawable.mission4;
    ImageView iv;
    ImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission);

        iv = (ImageView)findViewById(R.id.image1);
        iv.setImageResource(R.drawable.mission3b);

        iv2 = (ImageView)findViewById(R.id.image2);
        iv2.setImageResource(R.drawable.mission4b);

        iv.setOnClickListener(new MyListner1());
        iv2.setOnClickListener(new MyListner2());

        Button next = (Button) findViewById(R.id.bnt);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MissionActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });
    }

    class MyListner1 implements View.OnClickListener{
        @Override
        public void onClick(View v){
            iv.setImageResource(img1);
        }
    }

    class MyListner2 implements View.OnClickListener{
        @Override
        public void onClick(View v){
            iv2.setImageResource(img2);
        }
    }

}
