package com.example.administrador.meuprimeiroquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz3Activity extends AppCompatActivity {

    // Declarando variaveis
    Button bt_resp1;
    Button bt_resp2;
    Button bt_resp3;
    Button bt_respCerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        //Preenchendo variaveis
        bt_resp1 = (Button) findViewById(R.id.bt_tq3_respErrada1);
        bt_resp2 = (Button) findViewById(R.id.bt_tq3_respErrada2);
        bt_resp3 = (Button) findViewById(R.id.bt_tq3_respErrada3);
        bt_respCerta = (Button) findViewById(R.id.bt_tq3_respCerta);

        bt_respCerta.setOnClickListener(escutabotao);
        bt_resp1.setOnClickListener(escutabotao);
        bt_resp2.setOnClickListener(escutabotao);
        bt_resp3.setOnClickListener(escutabotao);
    }

    private View.OnClickListener escutabotao = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            final Button botaoResp = (Button) findViewById(v.getId());
            if (botaoResp.equals(bt_respCerta)) {
                Score.setScore(Score.getScore(Quiz3Activity.this) + 1, Quiz3Activity.this);
                //Intent telaLoser = new Intent(Quiz1Activity.this, LoserActivity.class);
                //startActivity(telaLoser);
            }
            Intent telaScore = new Intent(Quiz3Activity.this, ScoreActivity.class);
            startActivity(telaScore);

            finish();
        }
    };
}
