package com.ielts.mamun.ieltsassistance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void listening(View view) {
        startActivity(new Intent(MainActivity.this,listening.class));
    }

    public void reading(View view) {
        startActivity(new Intent(MainActivity.this,reading.class));
    }

    public void writing(View view) {
        startActivity(new Intent(MainActivity.this,writing.class));
    }

    public void speaking(View view) {
        startActivity(new Intent(MainActivity.this,speaking.class));
    }

    public void resouce(View view) {
        startActivity(new Intent(MainActivity.this,resource.class));
    }

    public void ielts(View view) {
        startActivity(new Intent(MainActivity.this,ielts.class));
    }

    public void author(View view) {
        startActivity(new Intent(MainActivity.this,author.class));
    }
}
