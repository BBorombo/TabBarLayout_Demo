package com.borombo.demo.tabbarlayout_demo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.borombo.demo.tabbarlayout_demo.TabFragment.TabFragment1;
import com.borombo.demo.tabbarlayout_demo.TabFragment.TabFragment2;
import com.borombo.demo.tabbarlayout_demo.TabFragment.TabFragment3;

/**
 * Created by Erwan on 13/03/2016.
 */
public class PageAdapter  extends FragmentStatePagerAdapter {

    int nbOfTab;

    public PageAdapter(FragmentManager fm, int nbOfTab) {
        super(fm);
        this.nbOfTab = nbOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TabFragment1();
            case 1:
                return new TabFragment2();
            case 2:
                return new TabFragment3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return nbOfTab;
    }
}
