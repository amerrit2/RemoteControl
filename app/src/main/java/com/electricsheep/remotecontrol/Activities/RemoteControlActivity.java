package com.electricsheep.remotecontrol.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Window;

import Fragments.RemoteControlFragment;

/**
 * Created by Adam on 10/14/2015.
 */
public class RemoteControlActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new RemoteControlFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
    }
}
