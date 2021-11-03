package com.example.sudoku6;

import java.util.Random;

public class Helper {







//check
    public String[][] h(String [][]p1)
    {

        Random random = new Random();

        //LS
        for(int c = 0;c<=16;c++)
        {

            int a = random.nextInt(6);
            int b = random.nextInt(6);


            for(int i =0;i<=5;i++)
            {
                for(int j=0;j<=5;j++)
                {


                    p1[a][b] =p1[i][j];
                   // p1[1][0] = "0";



                }




            }

        }//LF



        return p1;
    }


    //check

    public String[][] h2(String [][]p1)
    {


        for(int i = 0;i<=5;i++)
        {
            for(int j =0;j<=5;j++)
            {

                p1[i][j] = "0";



            }






        }




        return p1;
    }
















}
