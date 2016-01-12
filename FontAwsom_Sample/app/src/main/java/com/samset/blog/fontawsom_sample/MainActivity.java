package com.samset.blog.fontawsom_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.samset.blog.fontawsom_sample.utils.DrawableAwesome;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DrawableAwesome drable = new DrawableAwesome.DrawableAwesomeBuilder(this,R.mipmap.ic_launcher).build();
        drable.setAlpha(30);
    }


}
