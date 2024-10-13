package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lesson1 extends AppCompatActivity {
    Button next;
    Button back;
    Button submit1;
    Button submit2;
    Button submit3;
    TextView message;
    int count=1;
    String newString;
    private EditText input1;
    private EditText input2;
    private EditText input3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);
        submit1= (Button) findViewById(R.id.submit1);
        submit2= (Button) findViewById(R.id.submit2);
        next= (Button) findViewById(R.id.next);
        next.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        count=count+1;

                        if(count==1){
                            message=(TextView) findViewById(R.id.textView2);
                            message.setVisibility(View.VISIBLE);
                            message=(TextView) findViewById(R.id.textView5);
                            message.setVisibility(View.VISIBLE);

                        }
                        if(count==2){
                            message=(TextView) findViewById(R.id.textView2);
                            message.setVisibility(View.INVISIBLE);
                            message=(TextView) findViewById(R.id.textView5);
                            message.setVisibility(View.INVISIBLE);
                            message=(TextView) findViewById(R.id.textView6);
                            message.setVisibility(View.VISIBLE);

                        }
                        if(count==3){

                            message=(TextView) findViewById(R.id.textView6);
                            message.setVisibility(View.INVISIBLE);
                            message=(TextView) findViewById(R.id.textView7);
                            message.setVisibility(View.VISIBLE);
                        }
                        if(count==4){

                            message=(TextView) findViewById(R.id.textView7);
                            message.setVisibility(View.INVISIBLE);
                            message=(TextView) findViewById(R.id.textView11);
                            message.setVisibility(View.VISIBLE);
                            input1=findViewById(R.id.answer1);
                            input2=findViewById(R.id.answer2);
                            input1.setVisibility(View.VISIBLE);
                            submit1.setVisibility(View.VISIBLE);
                            input2.setVisibility(View.VISIBLE);
                            submit2= (Button) findViewById(R.id.submit2);
                            submit2.setVisibility(View.VISIBLE);
                            message=(TextView) findViewById(R.id.textView12);
                            message.setVisibility(View.VISIBLE);
                        }
                        if(count==5){
                            Intent intent= new Intent(Lesson1.this, MainActivity.class);


                            startActivity(intent);
                        }
                    }


                });

        back= (Button) findViewById(R.id.back);
        back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        count=count-1;

                        if(count==0){

                            Intent intent= new Intent(Lesson1.this, MainActivity.class);
                            startActivity(intent);

                        }
                        if(count==1){
                            message=(TextView) findViewById(R.id.textView2);
                            message.setVisibility(View.VISIBLE);
                            message=(TextView) findViewById(R.id.textView5);
                            message.setVisibility(View.VISIBLE);
                            message=(TextView) findViewById(R.id.textView6);
                            message.setVisibility(View.INVISIBLE);

                        }
                        if(count==2){

                            message=(TextView) findViewById(R.id.textView6);
                            message.setVisibility(View.VISIBLE);
                            message=(TextView) findViewById(R.id.textView7);
                            message.setVisibility(View.INVISIBLE);

                        }
                        if(count==3){


                            message=(TextView) findViewById(R.id.textView7);
                            message.setVisibility(View.VISIBLE);
                            message=(TextView) findViewById(R.id.textView11);
                            message.setVisibility(View.INVISIBLE);
                            input1=findViewById(R.id.answer1);
                            input1.setVisibility(View.INVISIBLE);
                            submit1.setVisibility(View.INVISIBLE);
                            input2=findViewById(R.id.answer2);
                            input2.setVisibility(View.INVISIBLE);
                            submit2.setVisibility(View.INVISIBLE);
                            message=(TextView) findViewById(R.id.textView12);
                            message.setVisibility(View.INVISIBLE);

                        }
                    }


                });
        submit1= (Button) findViewById(R.id.submit1);
        submit1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        Toast.makeText(Lesson1.this,"CORRECT",Toast.LENGTH_SHORT);
                        input1=findViewById(R.id.answer1);
                        newString=input1.getText().toString();


                        if(newString.equals("good morning")){
                            Toast.makeText(Lesson1.this,"CORRECT",Toast.LENGTH_SHORT).show();

                        }else{

                            Toast.makeText(Lesson1.this,"INCORRECT",Toast.LENGTH_SHORT).show();
                        }




                    }


                });
        submit2= (Button) findViewById(R.id.submit2);
        submit2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        Toast.makeText(Lesson1.this,"CORRECT",Toast.LENGTH_SHORT);
                        input2=findViewById(R.id.answer2);
                        newString=input2.getText().toString();


                        if(newString.equals("whether")){
                            Toast.makeText(Lesson1.this,"CORRECT",Toast.LENGTH_SHORT).show();

                        }else{

                            Toast.makeText(Lesson1.this,"INCORRECT",Toast.LENGTH_SHORT).show();
                        }




                    }


                });



    }
}

