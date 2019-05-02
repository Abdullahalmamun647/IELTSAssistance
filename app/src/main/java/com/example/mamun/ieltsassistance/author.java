package com.example.mamun.ieltsassistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.ImageView;

public class author extends AppCompatActivity {
Button face;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);
        face=findViewById(R.id.facebook);
        face.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
