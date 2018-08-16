package com.activityandintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private NextDto dto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        try {
            dto2 = getIntent().getExtras().getParcelable(Tags.DTO_KEY);
        } catch (Exception e) {
            Toast.makeText(this, "Ex is : " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }


        Toast.makeText(this, "Name = " + dto2.getName(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Age = " + dto2.getAge() , Toast.LENGTH_SHORT).show();
    }
}
