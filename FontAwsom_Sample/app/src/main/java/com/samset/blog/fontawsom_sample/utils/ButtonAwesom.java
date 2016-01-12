package com.samset.blog.fontawsom_sample.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.util.LruCache;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Samset on 11/01/16.
 */
public class ButtonAwesom extends Button
{
    private final static String NAME = "FONTAWESOME";
    private static LruCache<String, Typeface> sTypefaceCache = new LruCache<String, Typeface>(12);


    public ButtonAwesom(Context context) {
        super(context);
        init();

    }
    public ButtonAwesom(Context context,AttributeSet attrs) {
        super(context,attrs);
        init();
    }
    public ButtonAwesom(Context context, AttributeSet attrs, int defStyle){
        super(context,attrs,defStyle);
        init();
    }

    public void init(){
        Typeface typeface = sTypefaceCache.get(NAME);

        if (typeface == null) {

            typeface = Typeface.createFromAsset(getContext().getAssets(), "fontawesom.ttf");
            sTypefaceCache.put(NAME, typeface);

        }

        setTypeface(typeface);
    }

}
