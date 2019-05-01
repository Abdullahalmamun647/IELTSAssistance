package com.example.mamun.ieltsassistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class writing extends AppCompatActivity {
TextView W1,W2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Writing");
        setContentView(R.layout.activity_writing);
        W1=findViewById(R.id.answerW1);
        W2=findViewById(R.id.answerW2);
        W1.setMovementMethod(LinkMovementMethod.getInstance());
        W2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
