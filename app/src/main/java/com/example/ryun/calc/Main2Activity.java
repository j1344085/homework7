package com.example.ryun.calc;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    CheckBox chk1;
    RadioButton btn1;
    RadioButton btn2;
    RadioButton btn3;
    ImageView cat1;
    ImageView dog2;
    ImageView rabbit3;
    ImageView img;

    LinearLayout hiddenLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        chk1 = (CheckBox)findViewById(R.id.check2);
        btn1 = (RadioButton)findViewById(R.id.radioButton7);
        btn2 = (RadioButton)findViewById(R.id.radioButton8);
        btn3 = (RadioButton)findViewById(R.id.radioButton9);
        hiddenLayout = (LinearLayout)findViewById(R.id.SelectLayout);
        dog2 = (ImageView)findViewById(R.id.imageView);
        cat1 = (ImageView)findViewById(R.id.imageView);
        rabbit3 = (ImageView)findViewById(R.id.imageView);
        img =(ImageView)findViewById(R.id.imageView);

        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chk1.isChecked() == true){
                    hiddenLayout.setVisibility(View.VISIBLE);

                    if(btn1.isSelected() == true){
                        dog2.setImageResource(R.drawable.dog);
                    }
                    if(btn2.isSelected() == true){
                        cat1.setImageResource(R.drawable.cat);
                    }
                    if(btn3.isSelected() == true){
                        rabbit3.setImageResource(R.drawable.rabbit);
                    }

                }
                else hiddenLayout.setVisibility(View.GONE);
            }
        });
    }
}
