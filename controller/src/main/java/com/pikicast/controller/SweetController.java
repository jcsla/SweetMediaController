package com.pikicast.controller;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by leejun-young on 2016. 1. 29..
 */
public class SweetController extends RelativeLayout {

    public SweetController(Context context) {
        super(context);
    }

    public SweetController(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SweetController(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SweetController(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public enum ControllerType {
        NONE,
        DEFAULT,
        MUTABLE
    }
}