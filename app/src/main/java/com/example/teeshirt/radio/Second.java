package com.example.teeshirt.radio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.TextView;


public class Second extends ActionBarActivity {
    private static Button button;
    private static AnalogClock analog;
    private static DigitalClock digital;

    private static Button addbtn;
    private static EditText e1, e2;
    private static TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButtonClickListener();
        addbtnClickListener();
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

    public void addbtnClickListener(){
        addbtn = (Button)findViewById(R.id.addbtn);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        tv = (TextView)findViewById(R.id.tv);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e2.getText().toString());
                int sum = num1+num2;
                tv.setText(Integer.toString(sum));
            }
        });
    }
}
