package com.example.administrador.meuprimeiroquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Quiz1Activity extends AppCompatActivity {

    // Declarando variaveis
    Button bt_resp1;
    Button bt_resp2;
    Button bt_resp3;
    Button bt_respCerta;
    //o que acontece talvez não

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        //Preenchendo variaveis
        bt_resp1 = (Button) findViewById(R.id.bt_tq1_respErrada1);
        bt_resp2 = (Button) findViewById(R.id.bt_tq1_respErrada2);
        bt_resp3 = (Button) findViewById(R.id.bt_tq1_respErrada3);
        bt_respCerta = (Button) findViewById(R.id.bt_tq1_respCerta);

        bt_respCerta.setOnClickListener(escutabotao);
        bt_resp1.setOnClickListener(escutabotao);
        bt_resp2.setOnClickListener(escutabotao);
        bt_resp3.setOnClickListener(escutabotao);
    }


    private View.OnClickListener escutabotao = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            final Button botaoResp = (Button) findViewById(v.getId());
            if (botaoResp.equals(bt_respCerta)){
                Intent telaWinner = new Intent(Quiz1Activity.this, WinnerActivity.class);
                startActivity(telaWinner);
            } else {
                Intent telaLoser = new Intent(Quiz1Activity.this, LoserActivity.class);
                startActivity(telaLoser);
            }
        }
    };

}
