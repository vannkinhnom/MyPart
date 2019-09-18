package com.example.drinkpart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ImageAndStringArrayAdapter extends ArrayAdapter<ImageAndString> {
    public ImageAndStringArrayAdapter(Context context, int resource, List<ImageAndString> objects) {
        super(context, resource, objects);
    }

    public ImageAndStringArrayAdapter(Context context, int resource, ImageAndString[] textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public ImageAndStringArrayAdapter(NewMainActivity context, int gridview_image_and_string, List<ImageAndString> asList) {
        super(context, gridview_image_and_string, asList);
    }


    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //TODO check convertView if not null (cached)
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridview_image_and_string,parent,false);

        //TODO fill data here
        ImageAndString item =  getItem(position);
        ImageView iv = convertView.findViewById(R.id.imageView);
        iv.setImageResource(item.getImageRes());
        TextView tv = convertView.findViewById(R.id.textView);
        tv.setText(item.getName());

        return  convertView;
    }
}
