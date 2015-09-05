package com.kimery.memegen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MemeGenActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme_gen);
    }

    public void createMeme(String top, String bottom){
       BottomPhotoFragment bottomFragment = (BottomPhotoFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
       bottomFragment.setMemeText(top, bottom);
   }
}
