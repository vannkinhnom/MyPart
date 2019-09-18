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

public class Cool extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_foods, container,false);

        ImageAndStringArrayAdapter adapter = new ImageAndStringArrayAdapter(
                (NewMainActivity) this.getContext(),
                R.layout.grid_item,
                Arrays.asList(new ImageAndString(R.drawable.coool4,"cool"),
                        new ImageAndString(R.drawable.cool1jpg,"cool"),
                        new ImageAndString(R.drawable.cool2,"cool"),
                        new ImageAndString(R.drawable.cool3,"cool"),
                        new ImageAndString(R.drawable.cool4,"cool"),
                        new ImageAndString(R.drawable.cool5,"cool"),
                        new ImageAndString(R.drawable.greentea,"cool"),
                        new ImageAndString(R.drawable.ladygaga,"cool"),
                        new ImageAndString(R.drawable.minichocolatedrink,"cool"),
                        new ImageAndString(R.drawable.pinkdrink,"cool"),
                        new ImageAndString(R.drawable.cool1jpg,"cool"),
                        new ImageAndString(R.drawable.teavana,"cool"),
                        new ImageAndString(R.drawable.witchbrew,"cool"),
                        new ImageAndString(R.drawable.cool1jpg,"cool"),
                        new ImageAndString(R.drawable.cool6,"cool"))

        );


        GridView gridView = view.findViewById(R.id.foods);
        gridView.setAdapter(adapter);

        return view;
    }
}
