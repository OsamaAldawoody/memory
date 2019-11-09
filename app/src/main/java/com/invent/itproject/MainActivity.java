package com.invent.itproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    TextView tv_1 , tv_2;
    ImageView iv_11,iv_12,iv_13,iv_14,iv_21,iv_22,iv_23,iv_24,iv_31,iv_32,iv_33,iv_34;

    // array for images.
    int [] cardArray = {101,102,103,104,105,106,201,202,203,204,205,206};

    int image101,image102,image103,image104,image105,image106,
            image201,image202,image203,image204,image205,image206;

    int firstCard,secondCard;

    int checkedFirst,checkedSecond;

    int cardNUmber = 1;

    int turn = 1;

    int player1Points = 0 , player2Points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_1 = (TextView) findViewById(R.id.textView);
        tv_2 = (TextView) findViewById(R.id.textView2);

        int [] ids = {R.id.iv_11,R.id.iv_12,R.id.iv_13,R.id.iv_14,R.id.iv_21,R.id.iv_22,R.id.iv_23,R.id.iv_24,R.id.iv_31,R.id.iv_32,R.id.iv_33,R.id.iv_34};
        shuffleArray(ids);


        iv_11 = (ImageView) findViewById(ids[0]);
        iv_12 = (ImageView) findViewById(ids[1]);
        iv_13 = (ImageView) findViewById(ids[2]);
        iv_14 = (ImageView) findViewById(ids[3]);
        iv_21 = (ImageView) findViewById(ids[4]);
        iv_22 = (ImageView) findViewById(ids[5]);
        iv_23 = (ImageView) findViewById(ids[6]);
        iv_24 = (ImageView) findViewById(ids[7]);
        iv_31 = (ImageView) findViewById(ids[8]);
        iv_32 = (ImageView) findViewById(ids[9]);
        iv_33 = (ImageView) findViewById(ids[10]);
        iv_34 = (ImageView) findViewById(ids[11]);


        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        frontOfCardResources();

        tv_1.setTextColor(Color.BLACK);
        tv_2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(iv_11,theCard);
            }
        });


        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(iv_12,theCard);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(iv_13,theCard);
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(iv_14,theCard);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(iv_21,theCard);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(iv_22,theCard);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(iv_23,theCard);
            }
        });

        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(iv_24,theCard);
            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(iv_31,theCard);
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(iv_32,theCard);
            }
        });

        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(iv_33,theCard);
            }
        });

        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(iv_34,theCard);
            }
        });

    }
    private void doStuff(ImageView iv,int card){
        if (cardArray[card]==101){
            iv.setImageResource(image101);
        }else if (cardArray[card]==102){
            iv.setImageResource(image102);
        }else if (cardArray[card]==103){
            iv.setImageResource(image103);
        }else if (cardArray[card]==104){
            iv.setImageResource(image104);
        }else if (cardArray[card]==105){
            iv.setImageResource(image105);
        }else if (cardArray[card]==106){
            iv.setImageResource(image106);
        }else if (cardArray[card]==201){
            iv.setImageResource(image201);
        }else if (cardArray[card]==202){
            iv.setImageResource(image202);
        }else if (cardArray[card]==203){
            iv.setImageResource(image203);
        }else if (cardArray[card]==204){
            iv.setImageResource(image204);
        }else if (cardArray[card]==205){
            iv.setImageResource(image205);
        }else if (cardArray[card]==206){
            iv.setImageResource(image206);
        }

        //check which image is selected and save it in temporary variable.
        if (cardNUmber == 1){
            firstCard = cardArray[card];
            if (firstCard>200){
                firstCard = firstCard - 100;
            }
            cardNUmber = 2;
            checkedFirst = card;

            iv.setEnabled(false);
        }else if (cardNUmber == 2){
            secondCard = cardArray[card];
            if (secondCard>200){
                secondCard = secondCard - 100;
            }
            cardNUmber = 1;
            checkedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if the selected images are the same.
                    calculate();
                }
            },1000);
        }

    }

    private void calculate(){
        if (firstCard == secondCard){
            if (checkedFirst == 0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if (checkedFirst == 1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if (checkedFirst == 2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if (checkedFirst == 3){
                iv_14.setVisibility(View.INVISIBLE);
            }else if (checkedFirst == 4){
                iv_21.setVisibility(View.INVISIBLE);
            }else if (checkedFirst == 5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if (checkedFirst == 6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if (checkedFirst == 7){
                iv_24.setVisibility(View.INVISIBLE);
            }else if (checkedFirst == 8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if (checkedFirst == 9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if (checkedFirst == 10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if (checkedFirst == 11){
                iv_34.setVisibility(View.INVISIBLE);
            }

            if (checkedSecond == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (checkedSecond == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (checkedSecond == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (checkedSecond == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (checkedSecond == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (checkedSecond == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (checkedSecond == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (checkedSecond == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (checkedSecond == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (checkedSecond == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (checkedSecond == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (checkedSecond == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }

            //add points to correct player.
            if (turn == 1) {
                player1Points++;
                tv_1.setText("P1 = " + player1Points);
            } else if (turn == 2) {
                player2Points++;
                tv_2.setText("P2 = " + player2Points);
            }

        }else{
                iv_11.setImageResource(R.drawable.ic_back);
                iv_12.setImageResource(R.drawable.ic_back);
                iv_13.setImageResource(R.drawable.ic_back);
                iv_14.setImageResource(R.drawable.ic_back);
                iv_21.setImageResource(R.drawable.ic_back);
                iv_22.setImageResource(R.drawable.ic_back);
                iv_23.setImageResource(R.drawable.ic_back);
                iv_24.setImageResource(R.drawable.ic_back);
                iv_31.setImageResource(R.drawable.ic_back);
                iv_32.setImageResource(R.drawable.ic_back);
                iv_33.setImageResource(R.drawable.ic_back);
                iv_34.setImageResource(R.drawable.ic_back);

                if (turn == 1){
                    turn = 2;
                    tv_1.setTextColor(Color.GRAY);
                    tv_2.setTextColor(Color.BLACK);
                }else if (turn ==2){
                    turn = 1;
                    tv_2.setTextColor(Color.GRAY);
                    tv_1.setTextColor(Color.BLACK);
                }
            }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        //check if the game is over
        checkEnd();

    }

    private  void checkEnd(){
        if (iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE ){
            AlertDialog.Builder  alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("Game Over \n P1: "+ player1Points +"\nP2: "+ player2Points)
                    .setCancelable(false)
                    .setPositiveButton("new", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }
    private void frontOfCardResources(){
        image101 = R.drawable.ic_image101;
        image102 = R.drawable.ic_image102;
        image103 = R.drawable.ic_image103;
        image104 = R.drawable.ic_image104;
        image105 = R.drawable.ic_image105;
        image106 = R.drawable.ic_image106;
        image201 = R.drawable.ic_image201;
        image202 = R.drawable.ic_image202;
        image203 = R.drawable.ic_image203;
        image204 = R.drawable.ic_image204;
        image205 = R.drawable.ic_image205;
        image206 = R.drawable.ic_image206;
    }

    void shuffleArray(int[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
