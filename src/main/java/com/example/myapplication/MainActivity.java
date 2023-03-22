package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnDisable(View view) {
        //select element id by findViewById() method and assign it to its relevant object
        TextView label = findViewById(R.id.lblHeading);  //make sure this is created inside a
        //a method like here..

        //disable btn on click
        if (view.isEnabled()) {
            //set text
            label.setText("Why did you click the button!");
            //findViewById(R.id.lblHeading).setEnabled(false); //in one line
        }
        view.setEnabled(false);
    }
}