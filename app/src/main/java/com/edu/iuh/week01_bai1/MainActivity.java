package com.edu.iuh.week01_bai1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txta,txtb;
    TextView   ketqua;
    Button btnTong,btnTru,btnNhan,btnChia,btnThoat,btnUoc;
    float a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txta=(EditText)findViewById(R.id.editText3);
        txtb=(EditText)findViewById(R.id.editText4);
        btnTong=(Button)findViewById(R.id.btn6);
        btnTru=(Button)findViewById(R.id.btn7);
        btnNhan=(Button)findViewById(R.id.btn8);
        btnChia=(Button)findViewById(R.id.btn9);
        btnUoc=(Button)findViewById(R.id.btn10);
        btnThoat=(Button)findViewById(R.id.btn11);

        ketqua=(TextView)findViewById(R.id.textView6);

//
//


        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    a=Float.parseFloat(txta.getText().toString());
                    b=Float.parseFloat(txtb.getText().toString());
                    ketqua.setText(String.valueOf(a+b));
                }catch (Exception e) {
                    String error = "Lỗi nhập không hợp lệ!";
                    ketqua.setText(error + "");
                }

            }
        });

        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    a=Float.parseFloat(txta.getText().toString());
                    b=Float.parseFloat(txtb.getText().toString());
                    ketqua.setText(String.valueOf(a-b));
                }catch (Exception e) {
                    String error = "Lỗi nhập không hợp lệ!";
                    ketqua.setText(error + "");
                }
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    a=Float.parseFloat(txta.getText().toString());
                    b=Float.parseFloat(txtb.getText().toString());
                    ketqua.setText(String.valueOf(a/b));
                }catch (Exception e) {
                    String error = "Lỗi nhập không hợp lệ!";
                    ketqua.setText(error + "");
                }
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    a=Float.parseFloat(txta.getText().toString());
                    b=Float.parseFloat(txtb.getText().toString());
                    ketqua.setText(String.valueOf(a*b));
                }catch (Exception e) {
                    String error = "Lỗi nhập không hợp lệ!";
                    ketqua.setText(error + "");
                }
            }
        });
        btnUoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    a=Float.parseFloat(txta.getText().toString());
                    b=Float.parseFloat(txtb.getText().toString());
                    int uoc=1;
                    for(int i =1; i<a+b;i++){
                        if(a%i ==0 && b%i==0 && i<=a && i<=b)
                            uoc = i;
                    }
                    ketqua.setText(String.valueOf(uoc));
                }catch (Exception e) {
                    String error = "Lỗi nhập không hợp lệ!";
                    ketqua.setText(error + "");
                }
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
