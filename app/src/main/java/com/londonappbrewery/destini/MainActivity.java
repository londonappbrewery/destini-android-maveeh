package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonTop;
    Button buttonBottom;
    TextView storyTextView;
    int mStoryIndex;

    // TODO: Steps 4 & 8 - Declare member variables here:


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        buttonTop =(Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);
        storyTextView = (TextView) findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:


        if (savedInstanceState!= null){

            mStoryIndex = savedInstanceState.getInt("StoryIndex");


        } else {

            mStoryIndex  = 1;


        }



        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex==1 || mStoryIndex==5 ) {

                String newQuestion = getResources().getString(R.string.T3_Story);
                storyTextView.setText(newQuestion);

                String T3_Ans1 = getResources().getString(R.string.T3_Ans1);
                buttonTop.setText(T3_Ans1);

                String T3_Ans2 = getResources().getString(R.string.T3_Ans2);
                buttonBottom.setText(T3_Ans2);

                mStoryIndex=  2;

                }else if (mStoryIndex==2){

                    String T6_End = getResources().getString(R.string.T6_End);
                    storyTextView.setText(T6_End);

                    buttonTop.setVisibility(View.INVISIBLE);
                    buttonBottom.setVisibility(View.INVISIBLE);

                    mStoryIndex= 3;


                }






            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex==1) {
                    String newQuestion = getResources().getString(R.string.T2_Story);
                    storyTextView.setText(newQuestion);

                    String T2_Ans1 = getResources().getString(R.string.T2_Ans1);
                    buttonTop.setText(T2_Ans1);

                    String T2_Ans2 = getResources().getString(R.string.T2_Ans2);
                    buttonBottom.setText(T2_Ans2);

                    mStoryIndex = 5;

                }

            else if (mStoryIndex==2){

                    String T5_End = getResources().getString(R.string.T5_End);
                    storyTextView.setText(T5_End);

                    buttonTop.setVisibility(View.INVISIBLE);
                    buttonBottom.setVisibility(View.INVISIBLE);

                    mStoryIndex= 4;


                }



                else if (mStoryIndex==5){

                    String T4_End = getResources().getString(R.string.T4_End);
                    storyTextView.setText(T4_End);

                    buttonTop.setVisibility(View.INVISIBLE);
                    buttonBottom.setVisibility(View.INVISIBLE);

                    mStoryIndex= 6;


                }


            }
        });

    }

    @Override

    public void onSaveInstanceState (Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putInt("StoryIndex",mStoryIndex);


    }


}
