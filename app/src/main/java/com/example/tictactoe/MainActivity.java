package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int turn = 0;
    //0 for cross and 1 for circle;

    int[] arr = {2,2,2,2,2,2,2,2,2};

    int cross = 0;
    int circle = 0;






    public void click (View view) {

        ImageView imageView = (ImageView) view;

        TextView p1 = (TextView) findViewById(R.id.p1);
        TextView p2 = (TextView) findViewById(R.id.p2);


            int tagg = Integer.parseInt(imageView.getTag().toString());// this statement provide the tag of the images which is given in xml file


            if (arr[tagg] == 2) {
                arr[tagg] = turn;

                if (turn == 0) {
                    imageView.setImageResource(R.drawable.x_image);
                    imageView.animate().rotation(360).setDuration(1000);
                    turn = 1;

                    if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                        Toast.makeText(MainActivity.this, "cross wins", Toast.LENGTH_SHORT).show();
                        cross++;
                        p1.setText("" + cross);
                        turn=3;



                    } else if (arr[3] == 0 && arr[4] == 0 && arr[5] == 0) {
                        Toast.makeText(MainActivity.this, "cross wins", Toast.LENGTH_SHORT).show();
                        cross++;
                        p1.setText("" + cross);
                        turn=3;

                    } else if (arr[6] == 0 && arr[7] == 0 && arr[8] == 0) {
                        Toast.makeText(MainActivity.this, "cross wins", Toast.LENGTH_SHORT).show();
                        cross++;
                        p1.setText("" + cross);
                        turn=3;

                    } else if (arr[0] == 0 && arr[3] == 0 && arr[6] == 0) {
                        Toast.makeText(MainActivity.this, "cross wins", Toast.LENGTH_SHORT).show();
                        cross++;
                        p1.setText("" + cross);
                        turn=3;

                    } else if (arr[1] == 0 && arr[4] == 0 && arr[7] == 0) {
                        Toast.makeText(MainActivity.this, "cross wins", Toast.LENGTH_SHORT).show();
                        cross++;
                        p1.setText("" + cross);
                        turn=3;

                    }
                    if (arr[2] == 0 && arr[5] == 0 && arr[8] == 0) {
                        Toast.makeText(MainActivity.this, "cross wins", Toast.LENGTH_SHORT).show();
                        cross++;
                        p1.setText("" + cross);
                        turn=3;

                    } else if (arr[0] == 0 && arr[4] == 0 && arr[8] == 0) {
                        Toast.makeText(MainActivity.this, "cross wins", Toast.LENGTH_SHORT).show();
                        cross++;
                        p1.setText("" + cross);
                        turn=3;

                    } else if (arr[2] == 0 && arr[4] == 0 && arr[6] == 0) {
                        Toast.makeText(MainActivity.this, "cross wins", Toast.LENGTH_SHORT).show();
                        cross++;
                        p1.setText("" + cross);
                        turn=3;
                    }



                }
               else if (turn == 1){
                    imageView.setImageResource(R.drawable.o_image);

                    imageView.animate().rotation(360).setDuration(1000);
                    turn = 0;

                    if (arr[0] == 1 && arr[1] == 1 && arr[2] == 1) {
                        Toast.makeText(MainActivity.this, "circle wins", Toast.LENGTH_SHORT).show();
                        circle++;
                        p2.setText("" + circle);
                        turn=3;


                    } else if (arr[3] == 1 && arr[4] == 1 && arr[5] == 1) {
                        Toast.makeText(MainActivity.this, "circle wins", Toast.LENGTH_SHORT).show();
                        circle++;
                        p2.setText("" + circle);
                        turn=3;

                    } else if (arr[6] == 1 && arr[7] == 1 && arr[8] == 1) {
                        Toast.makeText(MainActivity.this, "circle wins", Toast.LENGTH_SHORT).show();
                        circle++;
                        p2.setText("" + circle);
                        turn=3;

                    } else if (arr[0] == 1 && arr[3] == 1 && arr[6] == 1) {
                        Toast.makeText(MainActivity.this, "circle wins", Toast.LENGTH_SHORT).show();
                        circle++;
                        p2.setText("" + circle);
                        turn=3;

                    } else if (arr[1] == 1 && arr[4] == 1 && arr[7] == 1) {
                        Toast.makeText(MainActivity.this, "circle wins", Toast.LENGTH_SHORT).show();
                        circle++;
                        p2.setText("" + circle);
                        turn=3;

                    } else if (arr[2] == 1 && arr[5] == 1 && arr[8] == 1) {
                        Toast.makeText(MainActivity.this, "circle wins", Toast.LENGTH_SHORT).show();
                        circle++;
                        p2.setText("" + circle);
                        turn=3;

                    } else if (arr[0] == 1 && arr[4] == 1 && arr[8] == 1) {
                        Toast.makeText(MainActivity.this, "circle wins", Toast.LENGTH_SHORT).show();
                        circle++;
                        p2.setText("" + circle);
                        turn=3;

                    } else if (arr[2] == 1 && arr[4] == 1 && arr[6] == 1) {
                        Toast.makeText(MainActivity.this, "circle wins", Toast.LENGTH_SHORT).show();
                        circle++;
                        p2.setText("" + circle);
                        turn=3;


                    }


                }
               else
                    Toast.makeText(MainActivity.this, "Press Try Again Button", Toast.LENGTH_SHORT).show();



            }
        }



    public void onclick (View view){


        turn = 0;
        for (int i=0;i<9;i++)
        {
            arr[i] = 2;
        }
        ImageView imageView1 = (ImageView) findViewById(R.id.img1);
        imageView1.setImageResource(R.drawable.ml2);
        ImageView imageView2 = (ImageView) findViewById(R.id.img2);
        imageView2.setImageResource(R.drawable.ml2);
        ImageView imageView3 = (ImageView) findViewById(R.id.img3);
        imageView3.setImageResource(R.drawable.ml2);
        ImageView imageView4 = (ImageView) findViewById(R.id.img4);
        imageView4.setImageResource(R.drawable.ml2);
        ImageView imageView5 = (ImageView) findViewById(R.id.img5);
        imageView5.setImageResource(R.drawable.ml2);
        ImageView imageView6 = (ImageView) findViewById(R.id.img6);
        imageView6.setImageResource(R.drawable.ml2);
        ImageView imageView7 = (ImageView) findViewById(R.id.img7);
        imageView7.setImageResource(R.drawable.ml2);
        ImageView imageView8 = (ImageView) findViewById(R.id.img8);
        imageView8.setImageResource(R.drawable.ml2);
        ImageView imageView9 = (ImageView) findViewById(R.id.img9);
        imageView9.setImageResource(R.drawable.ml2);








    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView1 = (TextView)findViewById(R.id.tv1);
        TextView textView2 = (TextView)findViewById(R.id.tv2);




        textView1.setText(getIntent().getStringExtra("player1")+"  (cross)");
            textView2.setText(getIntent().getStringExtra("player2")+"  (circle)");


    }
}

