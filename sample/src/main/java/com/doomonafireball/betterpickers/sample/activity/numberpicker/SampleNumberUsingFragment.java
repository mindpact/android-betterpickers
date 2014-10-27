package com.doomonafireball.betterpickers.sample.activity.numberpicker;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.doomonafireball.betterpickers.sample.R;
import com.doomonafireball.betterpickers.sample.activity.BaseSampleActivity;
import com.doomonafireball.betterpickers.sample.fragment.SampleNumberFragment;

/**
 * User: derek Date: 3/17/13 Time: 3:59 PM
 */
public class SampleNumberUsingFragment extends BaseSampleActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);

        Fragment fragment = new SampleNumberFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        transaction.replace(R.id.frame, fragment);

        transaction.commit();
    }
}
