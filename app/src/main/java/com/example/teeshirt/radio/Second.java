package com.example.teeshirt.radio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;


public class Second extends ActionBarActivity {
    private static Button button;
    private static AnalogClock analog;
    private static DigitalClock digital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButtonClickListener();
    }


    public void ButtonClickListener(){
        button = (Button)findViewById(R.id.button);
        analog = (AnalogClock)findViewById(R.id.analog);
        digital = (DigitalClock)findViewById(R.id.digital);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (digital.getVisibility()== DigitalClock.GONE){
                    digital.setVisibility(DigitalClock.VISIBLE);
                    analog.setVisibility(AnalogClock.GONE);
                }
                else {
                    analog.setVisibility(AnalogClock.VISIBLE);
                    digital.setVisibility(DigitalClock.GONE);
                }
            }
        });
    }
}
