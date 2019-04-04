package com.example.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // restore visibility settings if screen is reloaded
        if (savedInstanceState != null) {
            findViewById(R.id.Arms).setVisibility(savedInstanceState.getInt("arms"));
            findViewById(R.id.Ears).setVisibility(savedInstanceState.getInt("ears"));
            findViewById(R.id.Eyebrows).setVisibility(savedInstanceState.getInt("eyebrows"));
            findViewById(R.id.Eyes).setVisibility(savedInstanceState.getInt("eyes"));
            findViewById(R.id.Glasses).setVisibility(savedInstanceState.getInt("glasses"));
            findViewById(R.id.Hat).setVisibility(savedInstanceState.getInt("hat"));
            findViewById(R.id.Mouth).setVisibility(savedInstanceState.getInt("mouth"));
            findViewById(R.id.Mustache).setVisibility(savedInstanceState.getInt("mustache"));
            findViewById(R.id.Nose).setVisibility(savedInstanceState.getInt("nose"));
            findViewById(R.id.Shoes).setVisibility(savedInstanceState.getInt("shoes"));
        }
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        // save the visibility states of all the images
        savedInstanceState.putInt("arms", findViewById(R.id.Arms).getVisibility());
        savedInstanceState.putInt("ears", findViewById(R.id.Ears).getVisibility());
        savedInstanceState.putInt("eyebrows", findViewById(R.id.Eyebrows).getVisibility());
        savedInstanceState.putInt("eyes", findViewById(R.id.Eyes).getVisibility());
        savedInstanceState.putInt("glasses", findViewById(R.id.Glasses).getVisibility());
        savedInstanceState.putInt("hat", findViewById(R.id.Hat).getVisibility());
        savedInstanceState.putInt("mouth", findViewById(R.id.Mouth).getVisibility());
        savedInstanceState.putInt("mustache", findViewById(R.id.Mustache).getVisibility());
        savedInstanceState.putInt("nose", findViewById(R.id.Nose).getVisibility());
        savedInstanceState.putInt("shoes", findViewById(R.id.Shoes).getVisibility());
    }

    public void checkClicked(View v) {
        // View v is a reference to the checkbox view,
        // cast it to Checkbox to access all Checkbox' methods
        CheckBox checkbox = (CheckBox) v;

        // get name of the checkbox that was clicked as a String
        String box_text = checkbox.getText().toString();

        // get the Resource id of the image referred to with the box_text
        int resID = getResources().getIdentifier(box_text,"id", getPackageName());

        // get the ImageView that belongs to the referred body part
        ImageView image = findViewById(resID);

        // if checkbox is now checked, turn image visible
        if (checkbox.isChecked()) {
            image.setVisibility(View.VISIBLE);
        }

        // if checkbox is now unchecked, turn image invisible
        else {
            image.setVisibility(View.INVISIBLE);
        }
    }
}
