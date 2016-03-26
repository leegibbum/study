package com.study1.lee.study;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.StringWriter;

import static com.study1.lee.study.R.id.list_item;
import static com.study1.lee.study.R.id.testSMS;



public class MainActivity extends ActionBarActivity {
    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  /*      Button button1 =(Button)findViewById(R.id.button1);
        Button button2 =(Button)findViewById(R.id.button2);*/
        edittext=(EditText)findViewById(R.id.testSMS);


        edittext.addTextChangedListener(new TextWatcher() {

            EditText et;
            String beforeText;
            @Override
            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
                Log.e("gibbum",s.toString());
            }


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
                beforeText = s.toString();
            }


            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void onButton1Clicked(View view){
        EditText edittext=(EditText)findViewById(R.id.testSMS);
        Toast.makeText(getApplicationContext(),(String)edittext.getText().toString(),Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
