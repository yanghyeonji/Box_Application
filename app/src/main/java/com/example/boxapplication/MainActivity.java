package com.example.boxapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView; //바텀 네비게이션 뷰

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavi);

        //처음화면
        getSupportFragmentManager().beginTransaction().add(R.id.main_frame, new Home()).commit(); //FrameLayout에 fragment.xml 띄우기

        //바텀 네비게이션뷰 안의 아이템 설정
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    //item을 클릭시 id값을 가져와 FrameLayout에 fragment.xml 띄우기
                    case R.id.action_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Home()).commit();
                        break;
                    case R.id.action_reserve:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Reserve()).commit();
                        break;
                    case R.id.action_alarm:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Alarm()).commit();
                        break;
                    case R.id.action_mypage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new Mypage()).commit();
                        break;

                }
                return true;
            }

            });

    }

}








































//
//
//
//public class MainActivity extends AppCompatActivity {
//
//    private BottomNavigationView bottomNavigationView; // 바텀 네비게이션 뷰
//    private FragmentManager fm;
//    private FragmentTransaction ft;
//    private Home home;
//    private Reserve reserve;
//    private Alarm alarm;
//    private Mypage mypage;
//
//
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        // 왼쪽 상단에 앱 아이콘 출력
//        //getSupportActionBar().setDisplayShowHomeEnabled(true);
//        //getSupportActionBar().setIcon(R.drawable.ic_launcher);
//
//        // 상태바 숨기기
//        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//        //        WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        // 타이틀바 숨기기
//        getSupportActionBar().hide();
//
//
//            bottomNavigationView = findViewById(R.id.bottomNavi);
//            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
//            {
//                @Override
//                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
//                {
//                    switch (menuItem.getItemId())
//                    {
//                        case R.id.action_home:
//                            setFrag(0);
//                            break;
//                        case R.id.action_reserve:
//                            setFrag(1);
//                            break;
//                        case R.id.action_alarm:
//                            setFrag(2);
//                            break;
//                        case R.id.action_mypage:
//                            setFrag(3);
//                            break;
//                    }
//                    return true;
//                }
//            });
//
//            home = new Home();
//            reserve = new Reserve();
//            alarm = new Alarm();
//            mypage = new Mypage();
//
//            setFrag(0); // 첫 프래그먼트 화면 지정
//        }
//
//        // 프레그먼트 교체
//        private void setFrag(int n)
//        {
//            fm = getSupportFragmentManager();
//            ft= fm.beginTransaction();
//            switch (n)
//            {
//                case 0:
//                    ft.replace(R.id.Main_Frame,home);
//                    ft.commit();
//                    break;
//
//                case 1:
//                    ft.replace(R.id.Main_Frame,reserve);
//                    ft.commit();
//                    break;
//
//                case 2:
//                    ft.replace(R.id.Main_Frame,alarm);
//                    ft.commit();
//                    break;
//
//                case 3:
//                    ft.replace(R.id.Main_Frame, mypage);
//                    ft.commit();
//                    break;
//            }
//        }
//
//}
