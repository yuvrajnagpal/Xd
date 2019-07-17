package com.example.xd;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.viewpagerindicator.CirclePageIndicator;

public class HomeFragmnet extends Fragment {

  ViewPager viewpager;
    PagerAdapter pagerAdapter;

   CirclePageIndicator circleIndicator;

 @SuppressWarnings("deprecation")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
   View view= inflater.inflate(R.layout.fragment_home,container,false);

   viewpager=view.findViewById(R.id.viewPager);
   circleIndicator=view.findViewById(R.id.indicator);

   pagerAdapter=new PagerAdapter(getFragmentManager());
   pagerAdapter.addFragment(new Screen1());
   pagerAdapter.addFragment(new Screen2());

   viewpager.setAdapter(pagerAdapter);
   circleIndicator.setViewPager(viewpager);
   circleIndicator.setFillColor(getResources().getColor(R.color.colorPrimaryDark));

   return  view;
    }
}
