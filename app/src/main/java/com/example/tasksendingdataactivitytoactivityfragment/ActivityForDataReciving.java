package com.example.tasksendingdataactivitytoactivityfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityForDataReciving extends AppCompatActivity {
        TextView textView,txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_data_reciving);

     textView = findViewById(R.id.temDisplayId);
        Intent i = getIntent();
        String  posted = i.getStringExtra("postedData");
        textView.setText( posted);


        FragmentManager  fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Bundle bundle = new Bundle();
        txtView = findViewById(R.id.DisplayTextViewID);


    FragmentRecieveData fragmentRecieveData = new FragmentRecieveData();
//  fragmentTransaction.replace(R.id.FrameLayoutID, fragmentRecieveData);

        fragmentRecieveData.setArguments(bundle);

        fragmentTransaction.add(R.id.FrameLayoutID,fragmentRecieveData);
        bundle.putString("message", textView.getText().toString());
        fragmentTransaction.commit();





    }







}