package com.example.colores;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected TextView tv1, tv2, tv3, tv4, tv5;
    protected RadioGroup rg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Textview
        tv1 = (TextView) findViewById(R.id.txtMain);
        tv2 = (TextView) findViewById(R.id.txtMini1);
        tv3 = (TextView) findViewById(R.id.txtMini2);
        tv4 = (TextView) findViewById(R.id.txtMini3);
        tv5 = (TextView) findViewById(R.id.txtMini4);
        //Radiogroup
        rg1 = (RadioGroup) findViewById(R.id.rbGrp);
        //onCheckChange del Radiogroup
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                ColorDrawable color;
                int colorId;
                String hex;

                switch (rg1.getCheckedRadioButtonId()) {
                    case R.id.rbRed:
                        tv1.setBackgroundColor(Color.parseColor("#fc0303"));
                        //Copiado desde StackOverflow
                        color = (ColorDrawable) tv1.getBackground();
                        colorId = color.getColor();
                        hex = String.format("#%06X", (0xFFFFFF & colorId));
                        //Para imprimir el codogo hex
                        tv1.setText(hex);
                        break;
                    case R.id.rbOrange:
                        tv1.setBackgroundColor(Color.parseColor("#fc7703"));
                        color = (ColorDrawable) tv1.getBackground();
                        colorId = color.getColor();
                        hex = String.format("#%06X", (0xFFFFFF & colorId));
                        tv1.setText(hex);
                        break;
                    case R.id.rbYellow:
                        tv1.setBackgroundColor(Color.parseColor("#f0fc03"));
                        color = (ColorDrawable) tv1.getBackground();
                        colorId = color.getColor();
                        hex = String.format("#%06X", (0xFFFFFF & colorId));
                        tv1.setText(hex);
                        break;
                    case R.id.rbGreen:
                        tv1.setBackgroundColor(Color.parseColor("#1cfc03"));
                        color = (ColorDrawable) tv1.getBackground();
                        colorId = color.getColor();
                        hex = String.format("#%06X", (0xFFFFFF & colorId));
                        tv1.setText(hex);
                        break;
                    case R.id.rbBlue:
                        tv1.setBackgroundColor(Color.parseColor("#0328fc"));
                        color = (ColorDrawable) tv1.getBackground();
                        colorId = color.getColor();
                        hex = String.format("#%06X", (0xFFFFFF & colorId));
                        tv1.setText(hex);
                        break;
                    case R.id.rbPurple:
                        tv1.setBackgroundColor(Color.parseColor("#ba03fc"));
                        color = (ColorDrawable) tv1.getBackground();
                        colorId = color.getColor();
                        hex = String.format("#%06X", (0xFFFFFF & colorId));
                        tv1.setText(hex);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value");
                }
            }
        });//Fin del OnCheckedChangedListener
    }//Fin del onCreate

    //Monocromático
    @SuppressLint("NonConstantResourceId")
    public void monocromatico(View view) {
        //Para codigo hex
        ColorDrawable color1, color2, color3, color4;
        int colorId1, colorId2, colorId3, colorId4;
        String hex1, hex2, hex3, hex4;

        //visibilidad
        tv4.setVisibility(View.VISIBLE);
        tv5.setVisibility(View.VISIBLE);

        switch (rg1.getCheckedRadioButtonId()) {
            case R.id.rbRed:
                tv2.setBackgroundColor(Color.parseColor("#fc0303"));
                tv3.setBackgroundColor(Color.parseColor("#ff2121"));
                tv4.setBackgroundColor(Color.parseColor("#ff3f3f"));
                tv5.setBackgroundColor(Color.parseColor("#ff5d5d"));
                break;
            case R.id.rbOrange:
                tv2.setBackgroundColor(Color.parseColor("#fc7703"));
                tv3.setBackgroundColor(Color.parseColor("#ff9521"));
                tv4.setBackgroundColor(Color.parseColor("#ffb33f"));
                tv5.setBackgroundColor(Color.parseColor("#ffd15d"));
                break;
            case R.id.rbYellow:
                tv2.setBackgroundColor(Color.parseColor("#f0fc03"));
                tv3.setBackgroundColor(Color.parseColor("#ffff21"));
                tv4.setBackgroundColor(Color.parseColor("#ffff3f"));
                tv5.setBackgroundColor(Color.parseColor("#ffff5d"));
                break;
            case R.id.rbGreen:
                tv2.setBackgroundColor(Color.parseColor("#1cfc03"));
                tv3.setBackgroundColor(Color.parseColor("#3aff21"));
                tv4.setBackgroundColor(Color.parseColor("#58ff3f"));
                tv5.setBackgroundColor(Color.parseColor("#76ff5d"));
                break;
            case R.id.rbBlue:
                tv2.setBackgroundColor(Color.parseColor("#0328fc"));
                tv3.setBackgroundColor(Color.parseColor("#2146ff"));
                tv4.setBackgroundColor(Color.parseColor("#3f64ff"));
                tv5.setBackgroundColor(Color.parseColor("#5d82ff"));
                break;
            case R.id.rbPurple:
                tv2.setBackgroundColor(Color.parseColor("#ba03fc"));
                tv3.setBackgroundColor(Color.parseColor("#d821ff"));
                tv4.setBackgroundColor(Color.parseColor("#f63fff"));
                tv5.setBackgroundColor(Color.parseColor("#ff5dff"));
                break;
        }

        color1 = (ColorDrawable) tv2.getBackground();
        color2 = (ColorDrawable) tv3.getBackground();
        color3 = (ColorDrawable) tv4.getBackground();
        color4 = (ColorDrawable) tv5.getBackground();

        colorId1 = color1.getColor();
        colorId2 = color2.getColor();
        colorId3 = color3.getColor();
        colorId4 = color4.getColor();

        hex1 = String.format("#%06X", (0xFFFFFF & colorId1));
        hex2 = String.format("#%06X", (0xFFFFFF & colorId2));
        hex3 = String.format("#%06X", (0xFFFFFF & colorId3));
        hex4 = String.format("#%06X", (0xFFFFFF & colorId4));

        tv2.setText(hex1);
        tv3.setText(hex2);
        tv4.setText(hex3);
        tv5.setText(hex4);

        Toast.makeText(getApplicationContext(), "Monocromático", Toast.LENGTH_SHORT).show();

    }//Fin del Monocromático

    //Análogo
    @SuppressLint("NonConstantResourceId")
    public void analogo(View view) {
        //Para codigo hex
        ColorDrawable color1, color2, color3;
        int colorId1, colorId2, colorId3;
        String hex1, hex2, hex3;

        //visibilidad
        tv4.setVisibility(View.VISIBLE);
        tv5.setVisibility(View.GONE);

        switch (rg1.getCheckedRadioButtonId()) {
            case R.id.rbRed:
                tv2.setBackgroundColor(Color.parseColor("#fc0303"));
                tv3.setBackgroundColor(Color.parseColor("#e60977"));
                tv4.setBackgroundColor(Color.parseColor("#e62909"));
                break;
            case R.id.rbOrange:
                tv2.setBackgroundColor(Color.parseColor("#fc7703"));
                tv3.setBackgroundColor(Color.parseColor("#e65009"));
                tv4.setBackgroundColor(Color.parseColor("#e68e09"));
                break;
            case R.id.rbYellow:
                tv2.setBackgroundColor(Color.parseColor("#f0fc03"));
                tv3.setBackgroundColor(Color.parseColor("#e6d209"));
                tv4.setBackgroundColor(Color.parseColor("#8ee609"));
                break;
            case R.id.rbGreen:
                tv2.setBackgroundColor(Color.parseColor("#1cfc03"));
                tv3.setBackgroundColor(Color.parseColor("#6ce609"));
                tv4.setBackgroundColor(Color.parseColor("#09e636"));
                break;
            case R.id.rbBlue:
                tv2.setBackgroundColor(Color.parseColor("#0328fc"));
                tv3.setBackgroundColor(Color.parseColor("#0964e6"));
                tv4.setBackgroundColor(Color.parseColor("#2309e6"));
                break;
            case R.id.rbPurple:
                tv2.setBackgroundColor(Color.parseColor("#ba03fc"));
                tv3.setBackgroundColor(Color.parseColor("#6f09e6"));
                tv4.setBackgroundColor(Color.parseColor("#e609e3"));
                break;
        }

        color1 = (ColorDrawable) tv2.getBackground();
        color2 = (ColorDrawable) tv3.getBackground();
        color3 = (ColorDrawable) tv4.getBackground();

        colorId1 = color1.getColor();
        colorId2 = color2.getColor();
        colorId3 = color3.getColor();

        hex1 = String.format("#%06X", (0xFFFFFF & colorId1));
        hex2 = String.format("#%06X", (0xFFFFFF & colorId2));
        hex3 = String.format("#%06X", (0xFFFFFF & colorId3));

        tv2.setText(hex1);
        tv3.setText(hex2);
        tv4.setText(hex3);

        Toast.makeText(getApplicationContext(), "Análogo", Toast.LENGTH_SHORT).show();

    }//Fin del Análogo

    //Complementario
    @SuppressLint("NonConstantResourceId")
    public void complementario(View view) {
        //Para codigo hex
        ColorDrawable color1, color2;
        int colorId1, colorId2;
        String hex1, hex2;

        //visibilidad
        tv4.setVisibility(View.GONE);
        tv5.setVisibility(View.GONE);

        switch (rg1.getCheckedRadioButtonId()) {
            case R.id.rbRed:
                tv2.setBackgroundColor(Color.parseColor("#fc0303"));
                tv3.setBackgroundColor(Color.parseColor("#03fc49"));
                break;
            case R.id.rbOrange:
                tv2.setBackgroundColor(Color.parseColor("#fc7703"));
                tv3.setBackgroundColor(Color.parseColor("#03d1fc"));
                break;
            case R.id.rbYellow:
                tv2.setBackgroundColor(Color.parseColor("#f0fc03"));
                tv3.setBackgroundColor(Color.parseColor("#8703fc"));
                break;
            case R.id.rbGreen:
                tv2.setBackgroundColor(Color.parseColor("#1cfc03"));
                tv3.setBackgroundColor(Color.parseColor("#fc03a3"));
                break;
            case R.id.rbBlue:
                tv2.setBackgroundColor(Color.parseColor("#0328fc"));
                tv3.setBackgroundColor(Color.parseColor("#fcc103"));
                break;
            case R.id.rbPurple:
                tv2.setBackgroundColor(Color.parseColor("#ba03fc"));
                tv3.setBackgroundColor(Color.parseColor("#affc03"));
                break;
        }

        color1 = (ColorDrawable) tv2.getBackground();
        color2 = (ColorDrawable) tv3.getBackground();

        colorId1 = color1.getColor();
        colorId2 = color2.getColor();

        hex1 = String.format("#%06X", (0xFFFFFF & colorId1));
        hex2 = String.format("#%06X", (0xFFFFFF & colorId2));

        tv2.setText(hex1);
        tv3.setText(hex2);

        Toast.makeText(getApplicationContext(), "Complementario", Toast.LENGTH_SHORT).show();

    }//Fin del complementario

    //Seperación complementaria
    @SuppressLint("NonConstantResourceId")
    public void seperacionComplementaria(View view) {
        //Para codigo hex
        ColorDrawable color1, color2, color3;
        int colorId1, colorId2, colorId3;
        String hex1, hex2, hex3;

        //visibilidad
        tv4.setVisibility(View.VISIBLE);
        tv5.setVisibility(View.GONE);
        switch (rg1.getCheckedRadioButtonId()) {
            case R.id.rbRed:
                tv2.setBackgroundColor(Color.parseColor("#fc0303"));
                tv3.setBackgroundColor(Color.parseColor("#62fc0f"));
                tv4.setBackgroundColor(Color.parseColor("#0ffcd9"));
                break;
            case R.id.rbOrange:
                tv2.setBackgroundColor(Color.parseColor("#fc7703"));
                tv3.setBackgroundColor(Color.parseColor("#0ffca3"));
                tv4.setBackgroundColor(Color.parseColor("#0f56fc"));
                break;
            case R.id.rbYellow:
                tv2.setBackgroundColor(Color.parseColor("#f0fc03"));
                tv3.setBackgroundColor(Color.parseColor("#0f13fc"));
                tv4.setBackgroundColor(Color.parseColor("#fc0fdc"));
                break;
            case R.id.rbGreen:
                tv2.setBackgroundColor(Color.parseColor("#1cfc03"));
                tv3.setBackgroundColor(Color.parseColor("#a90ffc"));
                tv4.setBackgroundColor(Color.parseColor("#fc280f"));
                break;
            case R.id.rbBlue:
                tv2.setBackgroundColor(Color.parseColor("#0328fc"));
                tv3.setBackgroundColor(Color.parseColor("#fc910f"));
                tv4.setBackgroundColor(Color.parseColor("#fcf40f"));
                break;
            case R.id.rbPurple:
                tv2.setBackgroundColor(Color.parseColor("#ba03fc"));
                tv3.setBackgroundColor(Color.parseColor("#fce20f"));
                tv4.setBackgroundColor(Color.parseColor("#0ffc11"));
                break;
        }

        color1 = (ColorDrawable) tv2.getBackground();
        color2 = (ColorDrawable) tv3.getBackground();
        color3 = (ColorDrawable) tv4.getBackground();

        colorId1 = color1.getColor();
        colorId2 = color2.getColor();
        colorId3 = color3.getColor();

        hex1 = String.format("#%06X", (0xFFFFFF & colorId1));
        hex2 = String.format("#%06X", (0xFFFFFF & colorId2));
        hex3 = String.format("#%06X", (0xFFFFFF & colorId3));

        tv2.setText(hex1);
        tv3.setText(hex2);
        tv4.setText(hex3);

        Toast.makeText(getApplicationContext(), "Seperación complementaria", Toast.LENGTH_SHORT).show();

    }//Fin del Seperación complementaria

    //Tríada
    @SuppressLint("NonConstantResourceId")
    public void triada(View view) {
        //Para codigo hex
        ColorDrawable color1, color2, color3;
        int colorId1, colorId2, colorId3;
        String hex1, hex2, hex3;

        //visibilidad
        tv4.setVisibility(View.VISIBLE);
        tv5.setVisibility(View.GONE);

        switch (rg1.getCheckedRadioButtonId()) {
            case R.id.rbRed:
                tv2.setBackgroundColor(Color.parseColor("#fc0303"));
                tv3.setBackgroundColor(Color.parseColor("#fcf903"));
                tv4.setBackgroundColor(Color.parseColor("#1ca6fc"));
                break;
            case R.id.rbOrange:
                tv2.setBackgroundColor(Color.parseColor("#fc7703"));
                tv3.setBackgroundColor(Color.parseColor("#03fc11"));
                tv4.setBackgroundColor(Color.parseColor("#511cfc"));
                break;
            case R.id.rbYellow:
                tv2.setBackgroundColor(Color.parseColor("#f0fc03"));
                tv3.setBackgroundColor(Color.parseColor("#038afc"));
                tv4.setBackgroundColor(Color.parseColor("#fc251c"));
                break;
            case R.id.rbGreen:
                tv2.setBackgroundColor(Color.parseColor("#1cfc03"));
                tv3.setBackgroundColor(Color.parseColor("#1c03fc"));
                tv4.setBackgroundColor(Color.parseColor("#fc751c"));
                break;
            case R.id.rbBlue:
                tv2.setBackgroundColor(Color.parseColor("#0328fc"));
                tv3.setBackgroundColor(Color.parseColor("#fc4303"));
                tv4.setBackgroundColor(Color.parseColor("#7dfc1c"));
                break;
            case R.id.rbPurple:
                tv2.setBackgroundColor(Color.parseColor("#ba03fc"));
                tv3.setBackgroundColor(Color.parseColor("#fcae03"));
                tv4.setBackgroundColor(Color.parseColor("#1cfc9c"));
                break;
        }

        color1 = (ColorDrawable) tv2.getBackground();
        color2 = (ColorDrawable) tv3.getBackground();
        color3 = (ColorDrawable) tv4.getBackground();

        colorId1 = color1.getColor();
        colorId2 = color2.getColor();
        colorId3 = color3.getColor();

        hex1 = String.format("#%06X", (0xFFFFFF & colorId1));
        hex2 = String.format("#%06X", (0xFFFFFF & colorId2));
        hex3 = String.format("#%06X", (0xFFFFFF & colorId3));

        tv2.setText(hex1);
        tv3.setText(hex2);
        tv4.setText(hex3);

        Toast.makeText(getApplicationContext(), "Tríada", Toast.LENGTH_SHORT).show();

    }//Fin del tríada

    //Cuadrado
    @SuppressLint("NonConstantResourceId")
    public void cuadrado(View view) {
        //Para codigo hex
        ColorDrawable color1, color2, color3, color4;
        int colorId1, colorId2, colorId3, colorId4;
        String hex1, hex2, hex3, hex4;

        //visibilidad
        tv4.setVisibility(View.VISIBLE);
        tv5.setVisibility(View.VISIBLE);

        switch (rg1.getCheckedRadioButtonId()) {
            case R.id.rbRed:
                tv2.setBackgroundColor(Color.parseColor("#fc0303"));
                tv3.setBackgroundColor(Color.parseColor("#fccc1c"));
                tv4.setBackgroundColor(Color.parseColor("#1cfc5b"));
                tv5.setBackgroundColor(Color.parseColor("#0f24fc"));
                break;
            case R.id.rbOrange:
                tv2.setBackgroundColor(Color.parseColor("#fc7703"));
                tv3.setBackgroundColor(Color.parseColor("#a9fc1c"));
                tv4.setBackgroundColor(Color.parseColor("#1cd5fc"));
                tv5.setBackgroundColor(Color.parseColor("#c90ffc"));
                break;
            case R.id.rbYellow:
                tv2.setBackgroundColor(Color.parseColor("#f0fc03"));
                tv3.setBackgroundColor(Color.parseColor("#1cfcec"));
                tv4.setBackgroundColor(Color.parseColor("#931cfc"));
                tv5.setBackgroundColor(Color.parseColor("#fc5e0f"));
                break;
            case R.id.rbGreen:
                tv2.setBackgroundColor(Color.parseColor("#1cfc03"));
                tv3.setBackgroundColor(Color.parseColor("#1c7cfc"));
                tv4.setBackgroundColor(Color.parseColor("#fc1cac"));
                tv5.setBackgroundColor(Color.parseColor("#fcab0f"));
                break;
            case R.id.rbBlue:
                tv2.setBackgroundColor(Color.parseColor("#0328fc"));
                tv3.setBackgroundColor(Color.parseColor("#fc1c36"));
                tv4.setBackgroundColor(Color.parseColor("#fcc71c"));
                tv5.setBackgroundColor(Color.parseColor("#0ffc42"));
                break;
            case R.id.rbPurple:
                tv2.setBackgroundColor(Color.parseColor("#ba03fc"));
                tv3.setBackgroundColor(Color.parseColor("#fc7f1c"));
                tv4.setBackgroundColor(Color.parseColor("#b7fc1c"));
                tv5.setBackgroundColor(Color.parseColor("#0fdefc"));
                break;
        }

        color1 = (ColorDrawable) tv2.getBackground();
        color2 = (ColorDrawable) tv3.getBackground();
        color3 = (ColorDrawable) tv4.getBackground();
        color4 = (ColorDrawable) tv5.getBackground();

        colorId1 = color1.getColor();
        colorId2 = color2.getColor();
        colorId3 = color3.getColor();
        colorId4 = color4.getColor();

        hex1 = String.format("#%06X", (0xFFFFFF & colorId1));
        hex2 = String.format("#%06X", (0xFFFFFF & colorId2));
        hex3 = String.format("#%06X", (0xFFFFFF & colorId3));
        hex4 = String.format("#%06X", (0xFFFFFF & colorId4));

        tv2.setText(hex1);
        tv3.setText(hex2);
        tv4.setText(hex3);
        tv5.setText(hex4);

        Toast.makeText(getApplicationContext(), "Cuadrado", Toast.LENGTH_SHORT).show();

    }//Fin del cuadrada
}