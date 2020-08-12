package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button button=findViewById(R.id.ok);
        final Intent intent=new Intent(this,SecondActivity.class);


        final EditText editText1=findViewById(R.id.num1);
        final EditText editText2=findViewById(R.id.num2);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String num1= editText1.getText().toString();
                final String num2= editText2.getText().toString();

                intent.putExtra("num1",num1);
                intent.putExtra("num2",num2);

                //Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();
                //Getting the View object as defined in the customtoast.xml file
                View layout = li.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.custom_toast_layout));
                Toast toast=new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);
                toast.show();

                startActivity(intent);
            }
        });


    }
}