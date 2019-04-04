package com.example.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View v is a reference to the checkbox view,
        // cast it to Checkbox to access all Checkbox' methods
        CheckBox checkbox = (CheckBox) v;

        // get name of the checkbox that was clicked as a String
        String clicked_image = checkbox.getText().toString();

        // check if the clicked box was already checked or not
        if (clicked_image.isChecked()) {

        }



    }
}
