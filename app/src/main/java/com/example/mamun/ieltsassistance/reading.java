package com.example.mamun.ieltsassistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class reading extends AppCompatActivity {
TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Reading");
        setContentView(R.layout.activity_reading);
        ans=findViewById(R.id.answerR);
        ans.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
