package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void displayName(View view) {

        EditText firstName = (EditText)findViewById(R.id.first_Name_Input);
        EditText lastName = (EditText)findViewById(R.id.last_Name_Input);
        TextView result = (TextView)findViewById(R.id.result_view);


        String fName = firstName.getText().toString();
        String lName = lastName.getText().toString();

        String fullName = fName + " " + lName;

        result.setText("Hi " + fullName);




    }






}