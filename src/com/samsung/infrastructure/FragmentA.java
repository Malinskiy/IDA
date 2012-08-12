package com.samsung.infrastructure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;
import com.actionbarsherlock.app.SherlockFragment;

public class FragmentA extends SherlockFragment{
//    Button button;
    ImageButton Bulb0,Bulb1,Bulb2,Bulb3,Bulb4,Bulb5,Bulb6,Bulb7,Bulb8,Bulb9;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle saved) {
        return inflater.inflate(R.layout.public_layout, group, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bulb0 = (ImageButton) getActivity().findViewById(R.id.imageButton0);
        Bulb0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 0", Toast.LENGTH_SHORT).show();
            }
        });
        Bulb1 = (ImageButton) getActivity().findViewById(R.id.imageButton1);
        Bulb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 1", Toast.LENGTH_SHORT).show();
            }
        });
        Bulb2 = (ImageButton) getActivity().findViewById(R.id.imageButton2);
        Bulb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 2", Toast.LENGTH_SHORT).show();
            }
        });
        Bulb3 = (ImageButton) getActivity().findViewById(R.id.imageButton3);
        Bulb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 3", Toast.LENGTH_SHORT).show();
            }
        });
        Bulb4 = (ImageButton) getActivity().findViewById(R.id.imageButton4);
        Bulb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 4", Toast.LENGTH_SHORT).show();
            }
        });
        Bulb5 = (ImageButton) getActivity().findViewById(R.id.imageButton5);
        Bulb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 5", Toast.LENGTH_SHORT).show();
            }
        });
        Bulb6 = (ImageButton) getActivity().findViewById(R.id.imageButton6);
        Bulb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 6", Toast.LENGTH_SHORT).show();
            }
        });
        Bulb7 = (ImageButton) getActivity().findViewById(R.id.imageButton7);
        Bulb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 7", Toast.LENGTH_SHORT).show();
            }
        });
        Bulb8 = (ImageButton) getActivity().findViewById(R.id.imageButton8);
        Bulb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 8", Toast.LENGTH_SHORT).show();
            }
        });
        Bulb9 = (ImageButton) getActivity().findViewById(R.id.imageButton9);
        Bulb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You clicked Bulb 9", Toast.LENGTH_SHORT).show();
            }
        });
    }
}