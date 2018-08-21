package com.edu.iuh.week01_bai3;

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
    public void convertDLtoAL(View v){
        TextView kq = findViewById(R.id.textViewKq);
        TextView message = findViewById(R.id.textViewMessage);
        try {
            EditText ndl = (EditText) findViewById(R.id.editTextDL);
            int a = Integer.parseInt(ndl.getText()+"");
            if(a>=1900){
                kq.setText(String.valueOf(a));
            }
            else{
                String error = "Năm phải lớn hơn 1900!";
                message.setText(error + "");
            }
        }catch (Exception e) {
            String error = "Lỗi nhập không hợp lệ!";
            message.setText(error + "");
        }
    }
}
