package com.kimery.memegen;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment {

    private static EditText bottomEditText;
    private static EditText topEditText;

    TopSectionListener activityCommander;

    public interface  TopSectionListener{

        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);

        try{
            activityCommander =(TopSectionListener) activity;

        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        topEditText = (EditText) view.findViewById(R.id.topEditText);
        bottomEditText = (EditText) view.findViewById(R.id.bottomEditText);
        final Button applyButton = (Button) view.findViewById(R.id.applyButton);

        applyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                buttonClicked(v);
            }
        });

        return view;
    }

    public void buttonClicked(View v){

        activityCommander.createMeme(topEditText.getText().toString(),bottomEditText.getText().toString());
    }
}
