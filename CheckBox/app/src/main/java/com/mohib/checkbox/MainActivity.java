package com.mohib.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatCheckBox appCompatCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.checkbox_id);

        appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b){

                    Toast.makeText(getApplicationContext(),"CheckBox is Enable",Toast.LENGTH_LONG).show();

                }else {

                    Toast.makeText(getApplicationContext(),"CheckBox is Disable",Toast.LENGTH_LONG).show();

                }
            }
        });

        /**
         * When there is list of checkbox and only one should be selected
         * Used in adapter
         */
        /*appCompatCheckBox.setChecked(position==selected_position);
        appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    selected_position =  position;
                }
                else{
                    selected_position = -1;
                }
                notifyDataSetChanged();
            }
        });*/
    }
}
