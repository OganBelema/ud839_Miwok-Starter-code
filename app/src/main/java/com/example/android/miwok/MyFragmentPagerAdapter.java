package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ogan on 6/7/17.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new NumberFragment();
        } else if(position == 1){
            return new FamilyMembersFragment();
        } else if(position == 2){
            return new ColorFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Number";
        } else if(position == 1){
            return "Family";
        } else if(position == 2){
            return "Color";
        } else {
            return "Phrases";
        }
    }
}
