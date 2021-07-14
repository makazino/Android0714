package com.example.project30514;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1,text2;
    Switch swAgree;
    RadioGroup rGroup1;
    RadioButton rdoOreo,rdoPie,rdoQ10;
    Button btnQuit,btngoback;
    ImageView imgPet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1=findViewById(R.id.Text1);
        swAgree=findViewById(R.id.SwAgree);
        text2=findViewById(R.id.Text2);
        rGroup1=findViewById(R.id.Rgroup1);
        rdoOreo=findViewById(R.id.RdoOreo);
        rdoPie=findViewById(R.id.RdoPie);
        rdoQ10=findViewById(R.id.RdoQ10);
        btnQuit=findViewById(R.id.BtnQuit);
        btngoback=findViewById(R.id.BtnGoBack);
        imgPet=findViewById(R.id.ImgPet);

        swAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(swAgree.isChecked()==true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                    btnQuit.setVisibility(View.VISIBLE);
                    btngoback.setVisibility(View.VISIBLE);
                }
                else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                    btnQuit.setVisibility(View.INVISIBLE);
                    btngoback.setVisibility(View.VISIBLE);
                }
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.RdoOreo:
                        imgPet.setImageResource(R.drawable.oreo);
                        break;
                    case R.id.RdoPie:
                        imgPet.setImageResource(R.drawable.pie);
                        break;
                    case R.id.RdoQ10:
                        imgPet.setImageResource(R.drawable.q10);
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "버전을 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}