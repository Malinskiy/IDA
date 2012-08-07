package com.samsung.infrastructure;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.actionbarsherlock.app.SherlockFragment;
import com.samsung.infrastructure.R;

public class FragmentA extends SherlockFragment{
//    Button button;
    ImageView Bulb0,Bulb1,Bulb2,Bulb3,Bulb4,Bulb5,Bulb6,Bulb7,Bulb8,Bulb9;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle saved) {
        return inflater.inflate(R.layout.public_layout, group, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bulb0 = (ImageView) getActivity().findViewById(R.id.imageView1);
        Bulb0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 0", Toast.LENGTH_LONG).show();
            }
        });
        Bulb1 = (ImageView) getActivity().findViewById(R.id.imageView2);
        Bulb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 1", Toast.LENGTH_LONG).show();
            }
        });
        Bulb2 = (ImageView) getActivity().findViewById(R.id.imageView3);
        Bulb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 2", Toast.LENGTH_LONG).show();
            }
        });
        Bulb3 = (ImageView) getActivity().findViewById(R.id.imageView4);
        Bulb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 3", Toast.LENGTH_LONG).show();
            }
        });
        Bulb4 = (ImageView) getActivity().findViewById(R.id.imageView5);
        Bulb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 4", Toast.LENGTH_LONG).show();
            }
        });
        Bulb5 = (ImageView) getActivity().findViewById(R.id.imageView6);
        Bulb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 5", Toast.LENGTH_LONG).show();
            }
        });
        Bulb6 = (ImageView) getActivity().findViewById(R.id.imageView7);
        Bulb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 6", Toast.LENGTH_LONG).show();
            }
        });
        Bulb7 = (ImageView) getActivity().findViewById(R.id.imageView8);
        Bulb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 7", Toast.LENGTH_LONG).show();
            }
        });
        Bulb8 = (ImageView) getActivity().findViewById(R.id.imageView9);
        Bulb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 8", Toast.LENGTH_LONG).show();
            }
        });
        Bulb9 = (ImageView) getActivity().findViewById(R.id.imageView10);
        Bulb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 9", Toast.LENGTH_LONG).show();
            }
        });

//        button = (Button) getActivity().findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity(), "You clicked button in Public group", Toast.LENGTH_LONG).show();
//            }
//        });
    }
}