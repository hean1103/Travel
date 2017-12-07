package org.androidtown.travel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hyean on 2017-12-05.
 */

public class ReccomActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recom);

        Button next_page = (Button) findViewById(R.id.next);
        next_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReccomActivity.this, CategoriedMapActivity.class);
                startActivity(intent);
            }
        });



        Button ok_page = (Button) findViewById(R.id.ok_button);
        ok_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReccomActivity.this, MissionActivity.class);
                startActivity(intent);
            }
        });

        Button modi_page = (Button)findViewById(R.id.modi_button);
        modi_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReccomActivity.this, DropMapActivity.class);
                startActivity(intent);
            }
        });

    }
}
