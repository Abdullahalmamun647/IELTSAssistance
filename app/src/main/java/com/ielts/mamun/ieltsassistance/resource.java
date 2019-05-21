package com.ielts.mamun.ieltsassistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class resource extends AppCompatActivity {
TextView r11,r22,r33,r44,r55,r66,r77,r88,r99,r100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Resource");

        setContentView(R.layout.activity_resource);
        r11=findViewById(R.id.r1);
        r22=findViewById(R.id.r2);
        r33=findViewById(R.id.r3);
        r44=findViewById(R.id.r4);
        r55=findViewById(R.id.r5);
        r66=findViewById(R.id.r6);
        r77=findViewById(R.id.r7);
        r88=findViewById(R.id.r8);
        r99=findViewById(R.id.r9);
        r100=findViewById(R.id.r10);

        r11.setMovementMethod(LinkMovementMethod.getInstance());
        r22.setMovementMethod(LinkMovementMethod.getInstance());
        r33.setMovementMethod(LinkMovementMethod.getInstance());
        r44.setMovementMethod(LinkMovementMethod.getInstance());
        r55.setMovementMethod(LinkMovementMethod.getInstance());
        r66.setMovementMethod(LinkMovementMethod.getInstance());
        r77.setMovementMethod(LinkMovementMethod.getInstance());
        r88.setMovementMethod(LinkMovementMethod.getInstance());
        r99.setMovementMethod(LinkMovementMethod.getInstance());
        r100.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
