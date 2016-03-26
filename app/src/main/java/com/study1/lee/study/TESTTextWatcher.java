package com.study1.lee.study;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

/**
 * Created by lee on 2016-03-24.
 */
public class TESTTextWatcher implements TextWatcher {
    private EditText et;
    private String beforeText;

    public TESTTextWatcher(EditText et){
        this.et = et;
    }
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        beforeText = s.toString();
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if(s.toString().length() > 0) if (Integer.parseInt(s.toString()) > 12) {
            et.setText(beforeText);
        }

    }
}
