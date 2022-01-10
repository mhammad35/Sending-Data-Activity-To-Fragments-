package com.example.tasksendingdataactivitytoactivityfragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentRecieveData extends Fragment {

    String posted;
    TextView textView;
        public  FragmentRecieveData ()  {

        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_recieve_data, container, false);
        textView = view.findViewById(R.id.DisplayTextViewID);
        textView.setText(this.getArguments().getString("message"));
        return  view;





    }
}