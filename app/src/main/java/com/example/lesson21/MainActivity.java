package com.example.lesson21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.explicitIntentButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO shareEditTextにある文章を添付し、明示的Intentを使ってSubActivityを起動してみる

                EditText shareEditText = (EditText) findViewById(R.id.shareEditText);
                String shareText = shareEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("shareText", shareText);

                startActivity(intent);

            }
        });

        findViewById(R.id.implicitIntentButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO shareEditTextにある文章を添付し、暗黙的Intentを使ってシェアしてみる

                EditText shareEditText = (EditText) findViewById(R.id.shareEditText);
                String shareText = shareEditText.getText().toString();

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, shareText);

                startActivity(intent);
            }
        });

    }
}
