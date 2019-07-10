package com.jym.betabox;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BetaBox mBetaBox;

    public SoundViewModel(BetaBox betaBox) {
        mBetaBox = betaBox;
    }
    @Bindable

    public Sound getSound(){
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    public String getTitle() {
        return mSound.getName();
    }
    public void onButtonClicked(){
        mBetaBox.play(mSound);
    }
}
