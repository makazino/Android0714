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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1,text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdodog,rdocat,rdorabbit;
    Button btnOk;
    ImageView imgPet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1=findViewById(R.id.Text1);
        chkAgree=findViewById(R.id.ChkAgree);
        text2=findViewById(R.id.Text2);
        rGroup1=findViewById(R.id.Rgroup1);
        rdodog=findViewById(R.id.Rdodog);
        rdocat=findViewById(R.id.Rdocat);
        rdorabbit=findViewById(R.id.Rdorabbit);
        btnOk=findViewById(R.id.BtnOk);
        imgPet=findViewById(R.id.ImgPet);
        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked()==true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }
                else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.Rdodog:
                        imgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.Rdocat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.Rdorabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "동물을 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}