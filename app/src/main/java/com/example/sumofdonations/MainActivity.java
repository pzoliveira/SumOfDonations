package com.example.sumofdonations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    // Declaration of Variables

    TextView tvValueStep;
    TextView tvQty200bks, tvQty100bks, tvQty50bks, tvQty20bks, tvQty10bks, tvQty5bks, tvQty2bks;
    TextView tvTtl200bks, tvTtl100bks, tvTtl50bks, tvTtl20bks, tvTtl10bks, tvTtl5bks, tvTtl2bks;
    TextView tvQty100cts, tvQty50cts, tvQty25cts, tvQty10cts, tvQty5cts;
    TextView tvTtl100cts, tvTtl50cts, tvTtl25cts, tvTtl10cts, tvTtl5cts;
    TextView tvSubtotalBills, tvSubtotalCoins, tvTotalValue;

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

        tvSubtotalBills = (TextView) findViewById(R.id.txtSubtotalBills);
        tvSubtotalCoins = (TextView) findViewById(R.id.txtSubtotalCoins);
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


        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvValueStep.getText().equals("01")){
                tvValueStep.setText("05");
                } else if(tvValueStep.getText().equals("05")){
                tvValueStep.setText("10");
                } else if(tvValueStep.getText().equals("10")){
                tvValueStep.setText("01");
                }
            }
        });

        ibInc200bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("plus", tvQty200bks, tvValueStep, 200.0f, tvTtl200bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibDec200bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("minus", tvQty200bks, tvValueStep, 200.0f, tvTtl200bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibInc100bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("plus", tvQty100bks, tvValueStep, 100.0f, tvTtl100bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibDec100bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("minus", tvQty100bks, tvValueStep, 100.0f, tvTtl100bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibInc50bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("plus", tvQty50bks, tvValueStep, 50.0f, tvTtl50bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibDec50bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("minus", tvQty50bks, tvValueStep, 50.0f, tvTtl50bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibInc20bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("plus", tvQty20bks, tvValueStep, 20.0f, tvTtl20bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibDec20bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("minus", tvQty20bks, tvValueStep, 20.0f, tvTtl20bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibInc10bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("plus", tvQty10bks, tvValueStep, 10.0f, tvTtl10bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibDec10bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("minus", tvQty10bks, tvValueStep, 10.0f, tvTtl10bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibInc5bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("plus", tvQty5bks, tvValueStep, 5.0f, tvTtl5bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibDec5bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("minus", tvQty5bks, tvValueStep, 5.0f, tvTtl5bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibInc2bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("plus", tvQty2bks, tvValueStep, 2.0f, tvTtl2bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibDec2bks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("minus", tvQty2bks, tvValueStep, 2.0f, tvTtl2bks);
                evaluateSubtotalBills();
                evaluateTotal();
            }
        });

        ibInc100cts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("plus", tvQty100cts, tvValueStep, 1.0f, tvTtl100cts);
                evaluateSubtotalCoins();
                evaluateTotal();
            }
        });

        ibDec100cts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("minus", tvQty100cts, tvValueStep, 1.0f, tvTtl100cts);
                evaluateSubtotalCoins();
                evaluateTotal();
            }
        });

        ibInc50cts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("plus", tvQty50cts, tvValueStep, 0.5f, tvTtl50cts);
                evaluateSubtotalCoins();
                evaluateTotal();
            }
        });

        ibDec50cts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("minus", tvQty50cts, tvValueStep, 0.5f, tvTtl50cts);
                evaluateSubtotalCoins();
                evaluateTotal();
            }
        });

        ibInc25cts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("plus", tvQty25cts, tvValueStep, 0.25f, tvTtl25cts);
                evaluateSubtotalCoins();
                evaluateTotal();
            }
        });

        ibDec25cts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("minus", tvQty25cts, tvValueStep, 0.25f, tvTtl25cts);
                evaluateSubtotalCoins();
                evaluateTotal();
            }
        });

        ibInc10cts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("plus", tvQty10cts, tvValueStep, 0.1f, tvTtl10cts);
                evaluateSubtotalCoins();
                evaluateTotal();
            }
        });

        ibDec10cts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("minus", tvQty10cts, tvValueStep, 0.1f, tvTtl10cts);
                evaluateSubtotalCoins();
                evaluateTotal();
            }
        });

        ibInc5cts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("plus", tvQty5cts, tvValueStep, 0.05f, tvTtl5cts);
                evaluateSubtotalCoins();
                evaluateTotal();
            }
        });

        ibDec5cts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performMoneycalc("minus", tvQty5cts, tvValueStep, 0.05f, tvTtl5cts);
                evaluateSubtotalCoins();
                evaluateTotal();
            }
        });

    }

    public void performMoneycalc(String operationToPerform, TextView quantityOfMoney, TextView stepValue, Float multiplierAmount, TextView totalValueOfMoney){
        if(operationToPerform.equals("plus")){
            Integer qntityRslt = Integer.parseInt(quantityOfMoney.getText().toString());
            qntityRslt += Integer.parseInt(stepValue.getText().toString());
            if(qntityRslt > 999){
                qntityRslt = 999;
            }
            String qntityDisp = String.format(Locale.getDefault(), "%d", qntityRslt);
            quantityOfMoney.setText(qntityDisp);
            Float moneyRslt = qntityRslt * multiplierAmount;
            String moneyDisp = String.format(Locale.FRENCH, "%.2f", moneyRslt);
            totalValueOfMoney.setText(moneyDisp);
        } else {
            Integer qntityRslt = Integer.parseInt(quantityOfMoney.getText().toString());
            qntityRslt -= Integer.parseInt(stepValue.getText().toString());
            if(qntityRslt < 0){
                qntityRslt = 0;
            }
            String qntityDisp = String.format(Locale.getDefault(), "%d", qntityRslt);
            quantityOfMoney.setText(qntityDisp);
            Float moneyRslt = qntityRslt * multiplierAmount;
            String moneyDisp = String.format(Locale.FRENCH, "%.2f", moneyRslt);
            totalValueOfMoney.setText(moneyDisp);
        }
    }

    public void evaluateSubtotalBills(){
        Float subtotalRslt = 0.0f;
        Float total200bks = Float.parseFloat(tvTtl200bks.getText().toString().replace(',','.'));
        Float total100bks = Float.parseFloat(tvTtl100bks.getText().toString().replace(',','.'));
        Float total50bks = Float.parseFloat(tvTtl50bks.getText().toString().replace(',','.'));
        Float total20bks = Float.parseFloat(tvTtl20bks.getText().toString().replace(',','.'));
        Float total10bks = Float.parseFloat(tvTtl10bks.getText().toString().replace(',','.'));
        Float total5bks = Float.parseFloat(tvTtl5bks.getText().toString().replace(',','.'));
        Float total2bks = Float.parseFloat(tvTtl2bks.getText().toString().replace(',','.'));
        subtotalRslt += total200bks + total100bks + total50bks + total20bks + total10bks + total5bks + total2bks;
        String subtotalDisp = String.format(Locale.FRENCH, "R$  %.2f", subtotalRslt);
        tvSubtotalBills.setText(subtotalDisp);
    }

    public void evaluateSubtotalCoins(){
        Float subtotalRslt = 0.0f;
        Float total100cts = Float.parseFloat(tvTtl100cts.getText().toString().replace(',','.'));
        Float total50cts = Float.parseFloat(tvTtl50cts.getText().toString().replace(',','.'));
        Float total25cts = Float.parseFloat(tvTtl25cts.getText().toString().replace(',','.'));
        Float total10cts = Float.parseFloat(tvTtl10cts.getText().toString().replace(',','.'));
        Float total5cts = Float.parseFloat(tvTtl5cts.getText().toString().replace(',','.'));
        subtotalRslt += total100cts + total50cts + total25cts + total10cts + total5cts;
        String subtotalDisp = String.format(Locale.FRENCH, "R$  %.2f", subtotalRslt);
        tvSubtotalCoins.setText(subtotalDisp);
    }

    public void evaluateTotal(){
        Float totalRslt = 0.0f;
        Float total200bks = Float.parseFloat(tvTtl200bks.getText().toString().replace(',','.'));
        Float total100bks = Float.parseFloat(tvTtl100bks.getText().toString().replace(',','.'));
        Float total50bks = Float.parseFloat(tvTtl50bks.getText().toString().replace(',','.'));
        Float total20bks = Float.parseFloat(tvTtl20bks.getText().toString().replace(',','.'));
        Float total10bks = Float.parseFloat(tvTtl10bks.getText().toString().replace(',','.'));
        Float total5bks = Float.parseFloat(tvTtl5bks.getText().toString().replace(',','.'));
        Float total2bks = Float.parseFloat(tvTtl2bks.getText().toString().replace(',','.'));
        Float total100cts = Float.parseFloat(tvTtl100cts.getText().toString().replace(',','.'));
        Float total50cts = Float.parseFloat(tvTtl50cts.getText().toString().replace(',','.'));
        Float total25cts = Float.parseFloat(tvTtl25cts.getText().toString().replace(',','.'));
        Float total10cts = Float.parseFloat(tvTtl10cts.getText().toString().replace(',','.'));
        Float total5cts = Float.parseFloat(tvTtl5cts.getText().toString().replace(',','.'));
        totalRslt += total200bks + total100bks + total50bks + total20bks + total10bks + total5bks + total2bks + total100cts + total50cts + total25cts + total10cts + total5cts;
        String totalDisp = String.format(Locale.FRENCH, "R$  %.2f", totalRslt);
        tvTotalValue.setText(totalDisp);
    }

}