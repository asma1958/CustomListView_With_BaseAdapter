package com.asma.assignment_10;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    private final Activity context;
    private final String[] title;
    private final String[] location;
    private final String[] description;
    private final String[] timedate;
    private final Integer[] imageId;

    public CustomAdapter(Activity context, String[] title , String[] location, String[] description, String[] timedate, Integer[] imageId) {
        this.context = context;
        this.title = title ;
        this.location = location;
        this.description = description;
        this.timedate = timedate;
        this.imageId = imageId;
    }

    @Override
    public int getCount() {
        return title .length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mycustomlayout, null, true);

        TextView txtTitle = rowView.findViewById(R.id.txtDistrict);
        TextView txtTitle1 = rowView.findViewById(R.id.txtLocation);
        TextView txtDescription = rowView.findViewById(R.id.txtDescription);
        TextView txtTimeDate = rowView.findViewById(R.id.txtTimeDate);
        ImageView imageView = rowView.findViewById(R.id.imgView);

        txtTitle.setText(title [position]);
        txtTitle1.setText(location[position]);
        txtTimeDate.setText(timedate[position]);
        imageView.setImageResource(imageId[position]);
        txtDescription.setVisibility(View.GONE);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, MainActivity2.class);

                intent.putExtra("title ", title [position]);
                intent.putExtra("description", description[position]);
                intent.putExtra("timedate", timedate[position]);
                intent.putExtra("location", location[position]);
                intent.putExtra("imageId", imageId[position]);
                context.startActivity(intent);
            }
        });

        return rowView;
    }
}
