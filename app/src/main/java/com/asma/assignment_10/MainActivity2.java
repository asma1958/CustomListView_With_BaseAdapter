package com.asma.assignment_10;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView txttitle , txtLocation, txtDescription, txtTimeDate, txtDate;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        txtDescription = findViewById(R.id.txtDescription);
        txtTimeDate = findViewById(R.id.txtTimeDate);
        //txtDate = findViewById(R.id.txtDate);
        txtLocation = findViewById(R.id.txtLocation);
        txttitle = findViewById(R.id.txtDistrict);
        imgView = findViewById(R.id.imgView);

        Intent intent = getIntent();
        String description = intent.getStringExtra("description");
        String timedate = intent.getStringExtra("timedate");
        // String date = intent.getStringExtra("date");
        String location = intent.getStringExtra("location");
        String title = intent.getStringExtra("title ");
        int imageId = intent.getIntExtra("imageId", 0);



        txtDescription.setText(description);
        txtTimeDate.setText(timedate);
        //txtDate.setText(date);
        txtLocation.setText(location);
        txttitle .setText(title );
        imgView.setImageResource(imageId);
    }
}

