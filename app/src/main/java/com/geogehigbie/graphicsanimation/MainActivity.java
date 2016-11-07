package com.geogehigbie.graphicsanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView kitten;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kitten = (ImageView) findViewById(R.id.kitten);

    }


    public void onClickRotate(View view){

        kitten.animate().rotation(720).setDuration(1500).start();

    }

    public void onClickTrans(View view){

        kitten.animate().translationY(700).setDuration(200).start();

    }

    public void onClickScale(View view){

        kitten.animate().scaleX(0.5f).setDuration(1500).start();
        kitten.animate().scaleY(0.5f).setDuration(1500).start();


    }

    public void onClickAlpha(View view){

        kitten.animate().alpha(0.5f).setDuration(3000).start();

    }
}
