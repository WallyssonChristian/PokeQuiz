package com.example.administrador.meuprimeiroquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    TextView tv_score;
    ImageButton bt_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        // Preenchendo
        tv_score = (TextView) findViewById(R.id.tv_score);
        bt_score = (ImageButton) findViewById(R.id.bt_tscore_back);

        tv_score.setText(String.valueOf(Score.getScore(ScoreActivity.this)));

        bt_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

}
