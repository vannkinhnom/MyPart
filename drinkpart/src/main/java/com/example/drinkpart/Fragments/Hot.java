package com.example.drinkpart.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.drinkpart.ImageAndString;
import com.example.drinkpart.ImageAndStringArrayAdapter;
import com.example.drinkpart.NewMainActivity;
import com.example.drinkpart.R;

import java.util.Arrays;

public class Hot extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_cashiers, container,false);

        ImageAndStringArrayAdapter adapter = new ImageAndStringArrayAdapter(
                (NewMainActivity) this.getContext(),
                R.layout.grid_item,
                Arrays.asList(new ImageAndString(R.drawable.hot1,"hot"),
                        new ImageAndString(R.drawable.hot2,"hot"),
                        new ImageAndString(R.drawable.hot3,"hot"),
                        new ImageAndString(R.drawable.hot5,"hot"),
                        new ImageAndString(R.drawable.hot6,"hot"),
                        new ImageAndString(R.drawable.hot2,"hot"),
                        new ImageAndString(R.drawable.hot4,"hot"))

        );


        GridView gridView = view.findViewById(R.id.cashiers);
        gridView.setAdapter(adapter);

        return view;
    }
}
