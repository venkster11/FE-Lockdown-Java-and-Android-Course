package com.venkat.fe_app_session;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class DiceActivity extends AppCompatActivity {

    private Button Roll;
    private ImageView diceImg;
    private int[] diceArray = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        Roll = findViewById(R.id.btn_roll);
        diceImg = findViewById(R.id.img_dice);

        Roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int random_number = random.nextInt(6);
                diceImg.setImageResource(diceArray[random_number]);
            }
        });

    }
}
