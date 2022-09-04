package com.example.sumofdonations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaration of Variables

    TextView tvValueStep;
    TextView tvQty200bks, tvQty100bks, tvQty50bks, tvQty20bks, tvQty10bks, tvQty5bks, tvQty2bks;
    TextView tvTtl200bks, tvTtl100bks, tvTtl50bks, tvTtl20bks, tvTtl10bks, tvTtl5bks, tvTtl2bks;
    TextView tvQty100cts, tvQty50cts, tvQty25cts, tvQty10cts, tvQty5cts;
    TextView tvTtl100cts, tvTtl50cts, tvTtl25cts, tvTtl10cts, tvTtl5cts;
    TextView tvTotalValue;

    Button btnChange;

    ImageButton ibInc200bks, ibInc100bks, ibInc50bks, ibInc20bks, ibInc10bks, ibInc5bks, ibInc2bks;
    ImageButton ibDec200bks, ibDec100bks, ibDec50bks, ibDec20bks, ibDec10bks, ibDec5bks, ibDec2bks;
    ImageButton ibInc100cts, ibInc50cts, ibInc25cts, ibInc10cts, ibInc5cts;
    ImageButton ibDec100cts, ibDec50cts, ibDec25cts, ibDec10cts, ibDec5cts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Association of Variables

        tvValueStep = (TextView) findViewById(R.id.valueStep);

        tvQty200bks = (TextView) findViewById(R.id.txtQty200bks);
        tvQty100bks = (TextView) findViewById(R.id.txtQty100bks);
        tvQty50bks = (TextView) findViewById(R.id.txtQty50bks);
        tvQty20bks = (TextView) findViewById(R.id.txtQty20bks);
        tvQty10bks = (TextView) findViewById(R.id.txtQty10bks);
        tvQty5bks = (TextView) findViewById(R.id.txtQty5bks);
        tvQty2bks = (TextView) findViewById(R.id.txtQty2bks);

        tvTtl200bks = (TextView) findViewById(R.id.txtTtl200bks);
        tvTtl100bks = (TextView) findViewById(R.id.txtTtl100bks);
        tvTtl50bks = (TextView) findViewById(R.id.txtTtl50bks);
        tvTtl20bks = (TextView) findViewById(R.id.txtTtl20bks);
        tvTtl10bks = (TextView) findViewById(R.id.txtTtl10bks);
        tvTtl5bks = (TextView) findViewById(R.id.txtTtl5bks);
        tvTtl2bks = (TextView) findViewById(R.id.txtTtl2bks);

        tvQty100cts = (TextView) findViewById(R.id.txtQty100cts);
        tvQty50cts = (TextView) findViewById(R.id.txtQty50cts);
        tvQty25cts = (TextView) findViewById(R.id.txtQty25cts);
        tvQty10cts = (TextView) findViewById(R.id.txtQty10cts);
        tvQty5cts = (TextView) findViewById(R.id.txtQty5cts);

        tvTtl100cts = (TextView) findViewById(R.id.txtTtl100cts);
        tvTtl50cts = (TextView) findViewById(R.id.txtTtl50cts);
        tvTtl25cts = (TextView) findViewById(R.id.txtTtl25cts);
        tvTtl10cts = (TextView) findViewById(R.id.txtTtl10cts);
        tvTtl5cts = (TextView) findViewById(R.id.txtTtl5cts);

        tvTotalValue = (TextView) findViewById(R.id.txtTotal);

        btnChange = (Button) findViewById(R.id.btnChange);

        ibInc200bks = (ImageButton) findViewById(R.id.ibInc200bks);
        ibInc100bks = (ImageButton) findViewById(R.id.ibInc100bks);
        ibInc50bks = (ImageButton) findViewById(R.id.ibInc50bks);
        ibInc20bks = (ImageButton) findViewById(R.id.ibInc20bks);
        ibInc10bks = (ImageButton) findViewById(R.id.ibInc10bks);
        ibInc5bks = (ImageButton) findViewById(R.id.ibInc5bks);
        ibInc2bks = (ImageButton) findViewById(R.id.ibInc2bks);

        ibDec200bks = (ImageButton) findViewById(R.id.ibDec200bks);
        ibDec100bks = (ImageButton) findViewById(R.id.ibDec100bks);
        ibDec50bks = (ImageButton) findViewById(R.id.ibDec50bks);
        ibDec20bks = (ImageButton) findViewById(R.id.ibDec20bks);
        ibDec10bks = (ImageButton) findViewById(R.id.ibDec10bks);
        ibDec5bks = (ImageButton) findViewById(R.id.ibDec5bks);
        ibDec2bks = (ImageButton) findViewById(R.id.ibDec2bks);

        ibInc100cts = (ImageButton) findViewById(R.id.ibInc100cts);
        ibInc50cts = (ImageButton) findViewById(R.id.ibInc50cts);
        ibInc25cts = (ImageButton) findViewById(R.id.ibInc25cts);
        ibInc10cts = (ImageButton) findViewById(R.id.ibInc10cts);
        ibInc5cts = (ImageButton) findViewById(R.id.ibInc5cts);

        ibDec100cts = (ImageButton) findViewById(R.id.ibDec100cts);
        ibDec50cts = (ImageButton) findViewById(R.id.ibDec50cts);
        ibDec25cts = (ImageButton) findViewById(R.id.ibDec25cts);
        ibDec10cts = (ImageButton) findViewById(R.id.ibDec10cts);
        ibDec5cts = (ImageButton) findViewById(R.id.ibDec5cts);


        // Code starts here




    }
}