package com.example.mamun.ieltsassistance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView listening1,reading1,writing,speaking;
Button author1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
author1=findViewById(R.id.author);
author1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
      //  startActivity(new Intent(MainActivity.this,pop.class));
        Intent intent=new Intent(MainActivity.this,author.class);
        startActivity(intent);
    }
});

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
}
