package com.example.b4learning;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class fragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view;

        view = inflater.inflate(R.layout.fragment2,container);

        return view;

        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
