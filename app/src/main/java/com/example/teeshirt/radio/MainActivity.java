package com.example.teeshirt.radio;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    public static RadioGroup radioGroup;
    public static RadioButton radio;
    public static Button button;

    private static RatingBar rating;
    private static Button btn;
    private static TextView txt;

    private static Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClickListener();
        ratingBarListener();
        buttonClickListener();
        alertButtonClick();
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


   public void ratingBarListener(){
       rating = (RatingBar)findViewById(R.id.rating);
       txt = (TextView)findViewById(R.id.txt);
       rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
           @Override
           public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
               txt.setText(String.valueOf(rating));
           }
       });
   }

    public void buttonClickListener(){
        rating = (RatingBar)findViewById(R.id.rating);
        btn = (Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, String.valueOf(rating.getRating()) ,Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void alertButtonClick(){
        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertbuilder = new AlertDialog.Builder(MainActivity.this);
                alertbuilder.setMessage("Do you want to close this App?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alert = alertbuilder.create();
                alert.setTitle("Alert!!!");
                alert.show();
            }
        });
    }
}
