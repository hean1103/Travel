package org.androidtown.travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class AfterMapActivity extends AppCompatActivity {

    ImageView map;
    TextView location;
    TextView location_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_map);

        map = (ImageView) findViewById(R.id.map);
        location =(TextView)findViewById(R.id.location);
        location_answer = (TextView)findViewById(R.id.location_answer);

        setTitle("Travel of Mission");

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return true;
    }
}
