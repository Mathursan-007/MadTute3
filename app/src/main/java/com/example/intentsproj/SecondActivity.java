package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText editText1=findViewById(R.id.num1);
        EditText editText2=findViewById(R.id.num2);

        Intent intent=getIntent();

        final String n1= intent.getStringExtra("num1");
        final String n2=intent.getStringExtra("num2");

        editText1.setText(n1);
        editText2.setText(n2);


        final TextView num1=findViewById(R.id.n1);
        final TextView num2=findViewById(R.id.n2);
        final TextView operator=findViewById(R.id.operator);
        final TextView equal=findViewById(R.id.equal);
        final TextView result=findViewById(R.id.result);

        final int no1=Integer.parseInt(n1);
        final int no2=Integer.parseInt(n2);

         final Button add=findViewById(R.id.add);
         final Button subtract=findViewById(R.id.subtract);
         final Button multiply=findViewById(R.id.multiply);
         final Button divide=findViewById(R.id.divide);

         add.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 num1.setText(n1);
                 num2.setText(n2);
                 operator.setText(add.getText());
                 equal.setText("=");
                 result.setText(String.valueOf(no1+no2));

             }
         });

         subtract.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 num1.setText(n1);
                 num2.setText(n2);
                 operator.setText(subtract.getText());
                 equal.setText("=");
                 result.setText(String.valueOf(no1-no2));

             }
         });

         multiply.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 num1.setText(n1);
                 num2.setText(n2);
                 operator.setText(multiply.getText());
                 equal.setText("=");
                 result.setText(String.valueOf(no1*no2));
             }
         });

         divide.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 num1.setText(n1);
                 num2.setText(n2);
                 operator.setText(divide.getText());
                 equal.setText("=");
                 result.setText(String.valueOf(no1/no2));
             }
         });



    }
}