package com.dk.animation.effect;

import android.support.v7.widget.RecyclerView.ViewHolder;

public class PackageAnimator extends BaseItemAnimator {
    private SegmentAnimator mInAnimator;
    private SegmentAnimator mOutAnimator;

    public PackageAnimator(SegmentAnimator in, SegmentAnimator out) {
        super();
        mInAnimator = in;
        mOutAnimator = out;
        setAddDuration(800);
        setMoveDuration(800);
        setRemoveDuration(800);
    }

    @Override
    protected void prepareAnimateAdd(ViewHolder holder) {
        mInAnimator.animationPrepare(holder);
    }

    @Override
    protected void animateAddImpl(ViewHolder holder) {
        mInAnimator.startAnimation(holder, getAddDuration(), this);

    }

    @Override
    protected void animateRemoveImpl(ViewHolder holder) {
        mOutAnimator.startAnimation(holder, getAddDuration(), this);
    }

}
