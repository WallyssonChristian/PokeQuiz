package com.example.administrador.meuprimeiroquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Declarando as variaveis
    Button bt_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Preenchendo as variaveis
        bt_play = (Button) findViewById(R.id.bt_t1_start);

        // Botao Play ( GO )
        bt_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaQuiz1 = new Intent(MainActivity.this, Quiz1Activity.class);
                startActivity(telaQuiz1);
            }
        });

        onResume();
    }

    // Zerando Score
    protected void onResume(){
        super.onResume();
        Score.setScore(0, MainActivity.this);
    }
}
