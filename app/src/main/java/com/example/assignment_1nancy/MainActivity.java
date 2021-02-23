package com.example.assignment_1nancy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random_class;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button higher_button = (Button) findViewById(R.id.button_id);
            Button lower_button = (Button) findViewById(R.id.Button2_id);
            TextView win_loose = (TextView) findViewById(R.id.result);
            ImageView user_dice= (ImageView) findViewById(R.id.DiceImg);
            ImageView computer_dice = (ImageView) findViewById(R.id.DiceImg2);
            random_class = new Random();
            higher_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int user_random = generate_random();
                    int computer_random = generate_random();
                    if(user_random == computer_random){
                        win_loose.setText("Its a Tie!");
                    }
                    else if(user_random > computer_random){
                        win_loose.setText("User WIN!");
                    }
                    else {
                        win_loose.setText("Computer Win!");
                    }

                    switch (user_random){
                        case 1:
                            user_dice.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            user_dice.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            user_dice.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            user_dice.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            user_dice.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            user_dice.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (computer_random){
                        case 1:
                            computer_dice.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            computer_dice.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            computer_dice.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            computer_dice.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            computer_dice.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            computer_dice.setImageResource(R.drawable.dice6);
                            break;
                    }
                }
            });
            lower_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int user_random = generate_random();
                    int computer_random = generate_random();
                    if(user_random == computer_random){
                        win_loose.setText("Its a Tie!");
                    }
                    else if(user_random < computer_random){
                        win_loose.setText("User WIN!");
                    }
                    else {
                        win_loose.setText("Computer Win!");
                    }

                    switch (user_random){
                        case 1:
                            user_dice.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            user_dice.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            user_dice.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            user_dice.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            user_dice.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            user_dice.setImageResource(R.drawable.dice6);
                            break;
                    }
                    switch (computer_random){
                        case 1:
                            computer_dice.setImageResource(R.drawable.dice1);
                            break;
                        case 2:
                            computer_dice.setImageResource(R.drawable.dice2);
                            break;
                        case 3:
                            computer_dice.setImageResource(R.drawable.dice3);
                            break;
                        case 4:
                            computer_dice.setImageResource(R.drawable.dice4);
                            break;
                        case 5:
                            computer_dice.setImageResource(R.drawable.dice5);
                            break;
                        case 6:
                            computer_dice.setImageResource(R.drawable.dice6);
                            break;
                    }
                }
            });
        }

        public int generate_random(){
            return  random_class.nextInt(6) + 1;
        }
    }