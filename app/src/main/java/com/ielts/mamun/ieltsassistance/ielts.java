package com.ielts.mamun.ieltsassistance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ielts extends AppCompatActivity {
TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ielts);
        this.setTitle("What is IELTS");
        textView1=findViewById(R.id.what);
        textView1.setText("What is IELTS?\n\n" +
                "The International English Language Testing System (IELTS) is the world’s most popular English language proficiency.The purpose of the IELTS exam is to test the candidates' ability of handling English language who want to study or work in a country where English is the language of communication." +
                "Trusted for excellence in English language learning More than 10,000 organisations globally trust IELTS, so when you take the assessment you can be confident that it is recognised by educational institutions, employers, governments and professional bodies around the world.\n" +


                "Find out which organisations currently accept IELTS\n" +
                "\n" +
                "How does IELTS work?\n" +
                "\n" +
                "IELTS has been developed by some of the world’s leading language assessment experts and will test the full range of English skills needed for success in your new job or study placement abroad. You’ll be assessed on the following elements:\n" +
                "\n" +
                        "*Listening\n" +
                        "*Reading\n" +
                        "*Writing\n" +
                        "*Speaking\n\n"+
                "Lets know more about IELTS from this question\n\n"+
                        "1.What is the duration of every module in ielts?\n" +
                "Answer:IELTS has four parts – Listening (30 minutes), Reading (60 minutes), Writing (60 minutes) and Speaking (11–14 minutes). The total test time is 2 hours and 45 minutes\n\n"+
                "2.Can ielts be taken twice?\n"+
                "Answer:\"You can give it for as many as times you want. IELTS exam is conducted every month for 2 - 3 times. So you can book your exam dates in a same month as well but it is normally advised that you should not appear for the exam no closer than once in a period of two months. ... At last your test score is valid for 2 Years\n\n"+
        "3.What is the syllabus of ielts?\n"+
                "Answe: According to the IELTS 2019 syllabus, IELTS exam consists of four compulsory sections – Listening, Reading, Writing and Speaking sections.\n\n"+
                "4.How many times can you take ielts?\n"+
                "Answer:here is no limit to the number of times you can take the IELTS test. You can take it as many times as you wish until you achieve your dream score. However, you will need to pay the test fee for each attempt.\n\n"+
                "5.When can we give ielts exam?\n"+
                "Answer:For the IELTS exam, British Council Global Schedule for global exam dates is 48 days per year. You can choose any date according to your convenience and availability. The exam date that you choose should be at least three-four months before your first application deadline.\n\n");





    }

    public void online(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://takeielts.britishcouncil.org/prepare-test/free-sample-tests/writing-sample-test-1-academic/writing-task-2"));
        startActivity(browserIntent);
    }

  /*  public void internet(View view) {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://fast.com/"));
       startActivity(browserIntent);
    }*/
}

