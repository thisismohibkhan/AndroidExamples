package com.mohib.snackbar;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.fab_id);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                snackbar = Snackbar.make(view,"Message Sent.",Snackbar.LENGTH_INDEFINITE);
                snackbar.setDuration(8000);
                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        snackbar.dismiss();
                    }
                });

                View v = snackbar.getView();
                v.setBackgroundColor(getResources().getColor(R.color.colorSnackbarBackground));

                TextView txt = (TextView) v.findViewById(android.support.design.R.id.snackbar_text);
                txt.setTextColor(getResources().getColor(R.color.colorSnackbarText));

                TextView txtAction = (TextView) v.findViewById(android.support.design.R.id.snackbar_action);
                txtAction.setTextColor(getResources().getColor(R.color.colorSnackbarActionText));

                snackbar.show();
            }
        });
    }
}
