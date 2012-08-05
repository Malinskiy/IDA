package com.samsung.infrastructure;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created with IntelliJ IDEA.
 * User: root
 * Date: 8/5/12
 * Time: 4:49 PM
 * To change this template use File | Settings | File Templates.
 */

public class FragmentB extends Fragment {
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle saved) {
        return inflater.inflate(R.layout.private, group, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Private");
                builder.setMessage("What would you like me to do?");
                builder.setPositiveButton("Nothing", null);
                builder.setNegativeButton("Leave me alone!", null);
                builder.show();
            }
        });
    }
}