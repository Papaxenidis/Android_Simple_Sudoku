package com.example.sudoku6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button b_return;
        Button b_renew;


        b_renew = findViewById(R.id.button);
        b_return = findViewById(R.id.button2);


        b_renew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity2.this, MainActivity2.class);
                startActivity(i);

            }
        });

        b_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);

            }
        });





        Random random = new Random();
        int ra2 = random.nextInt(5-1)+1;

        String[][] p1 = {{"1","6","4","2","3","5"},{"3","4","5","1","2","6"},{"5","2","3","6","4","1"},{"4","3","1","5","6","2"},{"2","5","6","4","1","3"},{"6","1","2","3","5","4"}};

        String[][] p2 = {{"1","5","2","4","6","3"},{"3","6","1","5","4","2"},{"4","2","3","6","1","5"},{"2","1","4","3","5","6"},{"6","4","5","2","3","1"},{"5","3","6","1","2","4"}};

        String[][] p3 = {{"6","4","2","5","3","1"},{"2","1","3","4","5","6"},{"5","3","6","1","2","4"},{"4","5","1","2","6","3"},{"3","2","4","6","1","5"},{"1","6","5","3","4","2"}};

        String[][] p4 = {{"5","6","4","2","3","1"},{"4","2","3","1","6","5"},{"1","3","6","5","2","4"},{"3","5","2","4","1","6"},{"6","1","5","3","4","2"},{"2","4","1","6","5","3"}};


        TextView[] arrTxtView = new TextView[36]; // Ορισμός μήτρας textview

        //******************************************************************************************************

        for(int i = 0;i<=35;i++)
        {


             String texId = "t" + (i+1);

            int resID = getResources().getIdentifier(texId, "id", getPackageName());
            arrTxtView[i] = findViewById(resID);



        }



        for(int c = 0;c<=30;c++)
        {
            int a = random.nextInt(6);
            int b = random.nextInt(6);

            if(ra2==1)
            {
                p1[a][b] = " ";

            }else if(ra2==2)
            {

                p2[a][b] = " ";


            }else if(ra2==3)
            {

                p3[a][b] = " ";

            }else if(ra2==4)
            {


                p4[a][b] = " ";

            }










        }













        //check
        int counter=0;
        for(int i =0;i<=5;i++)
        {
            for(int j =0;j<=5;j++)
            {



                if(ra2==1)
                {
                    arrTxtView[counter].setText(p1[i][j]);

                }else if(ra2==2)
                {
                    arrTxtView[counter].setText(p2[i][j]);


                }else if(ra2==3)
                {
                    arrTxtView[counter].setText(p3[i][j]);

                }else  if(ra2==4)
                {

                    arrTxtView[counter].setText(p4[i][j]);

                }

                counter++;




            }
        }








































    }








}

