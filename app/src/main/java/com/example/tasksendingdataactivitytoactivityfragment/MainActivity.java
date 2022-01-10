package com.example.tasksendingdataactivitytoactivityfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
            Button postButton;
            EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        postButton = findViewById(R.id.PostButton);
        editText = findViewById(R.id.textViewID);
        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String posteddata = editText.getText().toString();

                Intent i = new Intent(MainActivity.this,ActivityForDataReciving.class);
                i.putExtra("postedData",posteddata);
                startActivity(i);

            }
        });


    }
}