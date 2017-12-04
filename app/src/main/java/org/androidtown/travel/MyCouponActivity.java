package org.androidtown.travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCouponActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_coupon);

        setView();
    }

    public void setView(){
        ImageView coupon = (ImageView)findViewById(R.id.couponImageView);

        TextView couponTextView = (TextView)findViewById(R.id.couponTextView);
        TextView locaionTextView = (TextView)findViewById(R.id.locationTextView);

        ImageView missionImageView = (ImageView)findViewById(R.id.missionImageView);

        TextView mycouponTextView = (TextView)findViewById(R.id.mycouponTextView);
        ImageView starbucks = (ImageView)findViewById(R.id.starbucksImageView);
        TextView couponName = (TextView)findViewById(R.id.couponNameTextView);
        TextView couponDate = (TextView)findViewById(R.id.couponExpDateTextView);


    }
}
