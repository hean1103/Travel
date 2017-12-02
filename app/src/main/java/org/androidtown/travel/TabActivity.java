package org.androidtown.travel;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

/**
 * Created by hyean on 2017-12-02.
 */

public class TabActivity  extends Activity{
    ActionBar actionBar;  //ActionBar 참조변수



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_page);

        actionBar= getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab=null;

        tab= actionBar.newTab(); //ActionBar에 붇는 Tab객체 생성

        tab.setText("내 피드");    //Tab에 보여지는 글씨

        //Tab의 선택이 변경되는 것을 인지하는 TabListener 설정(아래쪽 객체 생성 코드 참고)

        tab.setTabListener(listener);

        //ActionBar에 Tab 추가

        actionBar.addTab(tab);

        tab= actionBar.newTab();//ActionBar에 붇는 Tab객체 생성

        tab.setText("여행 친구");   //Tab에 보여지는 글씨

        //Tab의 선택이 변경되는 것을 인지하는 TabListener 설정(아래쪽 객체 생성 코드 참고)

        tab.setTabListener(listener);

        actionBar.addTab(tab);

    }





    //Tab의 선택변화를 인지하는 Listener 객체 생성

    //(Button의 onClickListner 처럼 생각하시면 됩니다.)

    ActionBar.TabListener listener= new ActionBar.TabListener() {

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
            int position = tab.getPosition();

            switch( position ){

                case 0: //가장 왼쪽 Tab 선택(Analog)

                    setContentView(R.layout.layout_tab1);

                    break;



                case 1: //두번째 Tab 선택(Digital)
                    setContentView(R.layout.layout_tab2);

                    break;

            }

        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }


        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }


    };

}
