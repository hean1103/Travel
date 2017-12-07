package org.androidtown.travel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by hyean on 2017-12-06.
 */

public class ReccomAfterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recom_after);

        Button ok_page = (Button) findViewById(R.id.ok_button);
        ok_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReccomAfterActivity.this, MissionActivity.class);
                startActivity(intent);
            }
        });

        Button modi_page = (Button) findViewById(R.id.modi_button);
        modi_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReccomAfterActivity.this, DropMapActivity.class);
                startActivity(intent);
            }
        });

        Button ok_page2 = (Button)findViewById(R.id.ok_button2);
        ok_page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReccomAfterActivity.this, MissionActivity.class);
                startActivity(intent);
            }
        });

        Button modi_page2 = (Button) findViewById(R.id.modi_button2);
        modi_page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReccomAfterActivity.this, DropMapActivity.class);
                startActivity(intent);
            }
        });

    }
}
