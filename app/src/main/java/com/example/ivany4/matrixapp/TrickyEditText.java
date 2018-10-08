package com.example.ivany4.matrixapp;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;


public class TrickyEditText extends android.support.v7.widget.AppCompatEditText {

    private boolean mFocused = false;
    private boolean mTouched = false;

    public TrickyEditText(Context context) {
        super(context);
    }

    public TrickyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TrickyEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(28)
    public TrickyEditText(Context context, AttributeSet attrs, int defStyleAttr, int style) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    public boolean didTouchFocusSelect() {
        if (mTouched && mFocused) {
            return true;
        } else {
            return super.didTouchFocusSelect();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mTouched = true;
        return super.onTouchEvent(event);
    }

    @Override
    protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        mFocused = focused;
        if (!focused) {
            mTouched = false;
        }
        super.onFocusChanged(focused, direction, previouslyFocusedRect);
    }
}

