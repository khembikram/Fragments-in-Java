package com.firstproject.fragementsapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FourthFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fourth,container,false);

        Button firstBtn = view.findViewById(R.id.fourth_btn);
        TextView text = view.findViewById(R.id.text_frag4);

        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),
                        "Byee Thanks for the visit",
                        Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}