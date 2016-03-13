package com.borombo.demo.tabbarlayout_demo.TabFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.borombo.demo.tabbarlayout_demo.R;

/**
 * Created by Erwan on 13/03/2016.
 */
public class TabFragment2 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_fragment_2, container, false);
    }
}
