package com.example.student.nttv_cau2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PTB2 extends AppCompatActivity {
    Float a,b,c;
    EditText edA, edB, edC;
    Button tinhtoan;
    String A,B,C;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        edA = findViewById(R.id.edA);
        edB = findViewById(R.id.edB);
        edC = findViewById(R.id.edC);

        tinhtoan = findViewById(R.id.btnGiai);
        tinhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A = edA.getText().toString();
                B = edB.getText().toString();
                C = edC.getText().toString();
                if(A==null || B==null || C==null){
                    Toast.makeText(PTB2.this,"nhap day du tham so").show();
                }else {
                    String output =
                }
            }
        });
    }
}
