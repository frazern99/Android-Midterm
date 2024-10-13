package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag1 extends Fragment {
    Button lesson1;
    Button lesson2;
    Button lesson3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.frag1_layout, container, false);

        lesson1= (Button) view.findViewById(R.id.lesson_1);
        lesson1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        Intent intent= new Intent(getActivity(), Lesson1.class);
                        startActivity(intent);

                    }


                });


        lesson2= (Button) view.findViewById(R.id.lesson_2);
        lesson2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        Intent intent= new Intent(getActivity(), Lesson2.class);
                        startActivity(intent);

                    }


                });


        lesson3= (Button) view.findViewById(R.id.lesson_3);
        lesson3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        Intent intent= new Intent(getActivity(), Lesson3.class);
                        startActivity(intent);

                    }


                });


        return view;
    }


}
