package com.jym.betabox;

import androidx.fragment.app.Fragment;

public class BetaBoxActivity extends BaseFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BetaBoxFragment.newInstance();
    }
}
