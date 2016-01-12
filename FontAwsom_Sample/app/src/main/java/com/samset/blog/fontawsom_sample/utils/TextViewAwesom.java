package com.samset.blog.fontawsom_sample.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.util.LruCache;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Samset on 11/01/16.
 */
public class TextViewAwesom  extends TextView {

    private final static String NAME = "FONTAWESOME";
    private static LruCache<String, Typeface> sTypefaceCache = new LruCache<String, Typeface>(12);

    public TextViewAwesom(Context context) {
        super(context);
        init();

    }

    public TextViewAwesom(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public void init() {

        Typeface typeface = sTypefaceCache.get(NAME);

        if (typeface == null) {

            typeface = Typeface.createFromAsset(getContext().getAssets(), "fontawesom.ttf");
            sTypefaceCache.put(NAME, typeface);

        }

        setTypeface(typeface);

    }



}
