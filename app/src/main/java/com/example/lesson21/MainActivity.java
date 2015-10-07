package com.example.lesson21;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.explicitIntentButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO shareEditTextにある文章を添付し、明示的Intentを使ってSubActivityを起動してみる
                // TODO Extra:"text",shareText

            }
        });

        findViewById(R.id.implicitIntentButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO shareEditTextにある文章を添付し、暗黙的Intentを使ってシェアしてみる
                // TODO Action:Intent.ACTION_SEND Type:"text/plain" Extra:Intent.EXTRA_TEXT,shareText

            }
        });

    }
}
