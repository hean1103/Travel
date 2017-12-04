package org.androidtown.travel;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.TabHost;

/**
 * Created by hyean on 2017-12-03.
 */
@SuppressWarnings("deprecation")
public class TabsActivity extends TabActivity {
    TabHost mTab;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        TabHost mTab = getTabHost();

        TabHost.TabSpec spec ;
        LayoutInflater.from(this).inflate(R.layout.activity_tab,mTab.getTabContentView(),true);

        spec = mTab.newTabSpec("tab1").setIndicator("내 피드").setContent(R.id.tab1);
        mTab.addTab(spec);

        spec = mTab.newTabSpec("tab2").setIndicator("여행 친구").setContent(R.id.tab2);
        mTab.addTab(spec);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.activity_tab,menu);
//        return true;
//    }


}
