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

public class Frappes extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_drinks, container,false);

        ImageAndStringArrayAdapter adapter = new ImageAndStringArrayAdapter(
                (NewMainActivity) this.getContext(),
                R.layout.grid_item,
                Arrays.asList(new ImageAndString(R.drawable.frap5,"Frappe"),
                        new ImageAndString(R.drawable.frap1,"Frappes"),
                        new ImageAndString(R.drawable.frap2,"Frappes"),
                        new ImageAndString(R.drawable.frap4,"Frappes"),
                        new ImageAndString(R.drawable.frap3,"Frappes"))

        );



        GridView gridView = view.findViewById(R.id.drinks);
        gridView.setAdapter(adapter);

        return view;
    }
}
