package com.edu.iuh.week01_bai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CtoF(View v){
        EditText doF = (EditText) findViewById(R.id.editTextDoF);
        EditText doC = (EditText) findViewById(R.id.editTextDoC);
        TextView message =(TextView) findViewById(R.id.textViewThongBao);
        try {
            float c = Float.parseFloat(doC.getText()+"");
            doF.setText(String.valueOf((c*1.8)+32));
        }catch (Exception e) {
            String error = "Lỗi nhập không hợp lệ!";
            message.setText(error + "");
        }
    }
    public void FtoC(View v){
        EditText doF = (EditText) findViewById(R.id.editTextDoF);
        EditText doC = (EditText) findViewById(R.id.editTextDoC);
        TextView message =(TextView) findViewById(R.id.textViewThongBao);
        try {
            float f = Float.parseFloat(doF.getText()+"");
            doC.setText(String.valueOf((f-32)/1.8));
        }catch (Exception e) {
            String error = "Lỗi nhập không hợp lệ!";
            message.setText(error + "");
        }
    }
    public void clear(View v){
        EditText doF = (EditText) findViewById(R.id.editTextDoF);
        EditText doC = (EditText) findViewById(R.id.editTextDoC);
        TextView message =(TextView) findViewById(R.id.textViewThongBao);
        try {
            doF.setText("");
            doC.setText("");
        }catch (Exception e) {
            String error = "Lỗi nhập không hợp lệ!";
            message.setText(error + "");
        }
    }
}
