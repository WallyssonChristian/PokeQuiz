package com.example.administrador.meuprimeiroquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    TextView tv_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        tv_score = (TextView) findViewById(R.id.tv_score);
        tv_score.setText(String.valueOf(Score.getScore(ScoreActivity.this)));
        Score.setScore(0, ScoreActivity.this);

    }
}
