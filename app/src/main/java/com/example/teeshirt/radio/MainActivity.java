package com.example.teeshirt.radio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    public static RadioGroup radioGroup;
    public static RadioButton radio;
    public static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClickListener();
    }


   public void onButtonClickListener(){
       radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
       button = (Button)findViewById(R.id.button);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int selected = radioGroup.getCheckedRadioButtonId();
               radio = (RadioButton)findViewById(selected);
               Toast.makeText(MainActivity.this, radio.getText().toString(), Toast.LENGTH_SHORT).show();
           }
       });

   }
}
