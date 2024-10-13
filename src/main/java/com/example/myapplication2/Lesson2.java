package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lesson2 extends AppCompatActivity {
    Button next;
    Button back;
    TextView message;
    int count=1;
    private EditText input;
    Button submit1;
    Button submit2;
    private EditText input1;
    private EditText input2;
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);

        next= (Button) findViewById(R.id.next2);
        next.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        count=count+1;
                        if(count==1){

                            message=(TextView) findViewById(R.id.textView);
                            message.setVisibility(View.VISIBLE);


                        }
                        if(count==2){

                            message=(TextView) findViewById(R.id.textView);
                            message.setVisibility(View.INVISIBLE);
                            message=(TextView) findViewById(R.id.textView3);
                            message.setVisibility(View.VISIBLE);


                        }
                        if(count==3){

                            message=(TextView) findViewById(R.id.textView3);
                            message.setVisibility(View.INVISIBLE);
                            message=(TextView) findViewById(R.id.textView4);
                            message.setVisibility(View.VISIBLE);


                        }
                        if(count==4){
                            message=(TextView) findViewById(R.id.textView4);
                            message.setVisibility(View.INVISIBLE);
                            message=(TextView) findViewById(R.id.textView13);
                            message.setVisibility(View.VISIBLE);
                            message=(TextView) findViewById(R.id.textView14);
                            message.setVisibility(View.VISIBLE);
                            submit1= (Button) findViewById(R.id.submit3);
                            submit1.setVisibility(View.VISIBLE);
                            submit2= (Button) findViewById(R.id.submit4);
                            submit2.setVisibility(View.VISIBLE);
                            input2=findViewById(R.id.answer4);
                            input1=findViewById(R.id.answer3);
                            input1.setVisibility(View.VISIBLE);
                            input2.setVisibility(View.VISIBLE);

                        }

                        if(count==5){
                            Intent intent= new Intent(Lesson2.this, MainActivity.class);
                            startActivity(intent);

                        }
                    }


                });

        back= (Button) findViewById(R.id.back2);
        back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        count=count-1;

                        if(count==0){

                            Intent intent= new Intent(Lesson2.this, MainActivity.class);
                            startActivity(intent);

                        }
                        if(count==1){

                            message=(TextView) findViewById(R.id.textView);
                            message.setVisibility(View.VISIBLE);
                            message=(TextView) findViewById(R.id.textView3);
                            message.setVisibility(View.INVISIBLE);

                        }
                        if(count==2){

                            message=(TextView) findViewById(R.id.textView3);
                            message.setVisibility(View.VISIBLE);
                            message=(TextView) findViewById(R.id.textView4);
                            message.setVisibility(View.INVISIBLE);

                        }
                        if(count==3){


                            message=(TextView) findViewById(R.id.textView4);
                            message.setVisibility(View.VISIBLE);
                            message=(TextView) findViewById(R.id.textView13);
                            message.setVisibility(View.INVISIBLE);
                            message=(TextView) findViewById(R.id.textView14);
                            message.setVisibility(View.INVISIBLE);
                            submit1= (Button) findViewById(R.id.submit3);
                            submit1.setVisibility(View.INVISIBLE);
                            submit2= (Button) findViewById(R.id.submit4);
                            submit2.setVisibility(View.INVISIBLE);
                            input2=findViewById(R.id.answer4);
                            input1=findViewById(R.id.answer3);
                            input1.setVisibility(View.INVISIBLE);
                            input2.setVisibility(View.INVISIBLE);
                        }

                    }


                });
        submit1= (Button) findViewById(R.id.submit3);
        submit1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        Toast.makeText(Lesson2.this,"CORRECT",Toast.LENGTH_SHORT);
                        input1=findViewById(R.id.answer3);
                        newString=input1.getText().toString();


                        if(newString.equals("kohi")){
                            Toast.makeText(Lesson2.this,"CORRECT",Toast.LENGTH_SHORT).show();

                        }else{

                            Toast.makeText(Lesson2.this,"INCORRECT",Toast.LENGTH_SHORT).show();
                        }




                    }


                });
        submit2= (Button) findViewById(R.id.submit4);
        submit2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        Toast.makeText(Lesson2.this,"CORRECT",Toast.LENGTH_SHORT);
                        input2=findViewById(R.id.answer4);
                        newString=input2.getText().toString();


                        if(newString.equals("drink")){
                            Toast.makeText(Lesson2.this,"CORRECT",Toast.LENGTH_SHORT).show();

                        }else{

                            Toast.makeText(Lesson2.this,"INCORRECT",Toast.LENGTH_SHORT).show();
                        }




                    }


                });

    }
}