package com.kimery.memegen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BottomPhotoFragment extends Fragment {

    private static TextView topTextView;
    private static TextView bottomTextView;


   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.bottom_photo_fragment, container, false);

       topTextView = (TextView) view.findViewById(R.id.topTextView);
       bottomTextView = (TextView) view.findViewById(R.id.bottomTextView);

       return view;
    }

    public void setMemeText(String top, String bottom){
        topTextView.setText(top);
        bottomTextView.setText(bottom);
    }





}
