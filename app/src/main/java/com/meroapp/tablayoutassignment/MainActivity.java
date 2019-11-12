package com.meroapp.tablayoutassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.meroapp.tablayoutassignment.adapter.ViewPageAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewpage);
        tabLayout=findViewById(R.id.tablayout);
        ViewPageAdapter viewPageAdapteR = new ViewPageAdapter(getSupportFragmentManager());
        viewPageAdapteR.addFragment(new LoginFragment(),"LogIn");
        viewPageAdapteR.addFragment(new SignUpFragment(),"SignUp");
        viewPager.setAdapter(viewPageAdapteR);
        tabLayout.setupWithViewPager(viewPager);
    }
}
