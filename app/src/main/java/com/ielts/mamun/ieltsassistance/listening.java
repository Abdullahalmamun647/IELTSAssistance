package com.ielts.mamun.ieltsassistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class listening extends AppCompatActivity {
TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Listening");
        setContentView(R.layout.activity_listening);
ans=findViewById(R.id.answerl);

        ans.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
