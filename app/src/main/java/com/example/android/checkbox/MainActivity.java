package com.example.android.checkbox;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

   public void check(View view){
       CheckBox chckOne=(CheckBox)findViewById(R.id.checkBox1);
       CheckBox chckTwo=(CheckBox)findViewById(R.id.checkBox2);
       if(chckOne.isChecked() && chckTwo.isChecked()) {
           Toast.makeText(getApplicationContext(),
                   "CheckBox Both are Checked. ", Toast.LENGTH_SHORT).show();
       }else if(chckOne.isChecked()) {
           Toast.makeText(getApplicationContext(),
                   "CheckBox One is Checked. ", Toast.LENGTH_SHORT).show();
       }else if(chckTwo.isChecked()) {
           Toast.makeText(getApplicationContext(),
                   "CheckBox Two is Checked. ", Toast.LENGTH_SHORT).show();
       }else
          Toast.makeText(getApplicationContext(),"Both Checkboxes are unchecked",Toast.LENGTH_LONG).show();
   }
}
