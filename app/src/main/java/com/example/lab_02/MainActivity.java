package com.example.lab_02;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String operator ="";
    String oldNumber = "";
    Boolean isNew = true;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);

    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    public void clickNumber(View view) {
        if (isNew) {
            editText.setText("");

        }
        isNew = false;
        String number = editText.getText().toString();
        if (view.getId() == R.id.bu1) {
            editText.setText(number + "1");}
        if (view.getId() == R.id.bu2) {
            editText.setText(number + "2");}
        if (view.getId() == R.id.bu3) {
            editText.setText(number + "3");}

        if (view.getId() == R.id.bu4) {
            editText.setText(number + "4");}

        if (view.getId() == R.id.bu5) {
            editText.setText(number + "5");}

        if (view.getId() == R.id.bu6) {
            editText.setText(number + "6");}

        if (view.getId() == R.id.bu7) {
            editText.setText(number + "7");}

        if (view.getId() == R.id.bu8) {
            editText.setText(number + "8");}

        if (view.getId() == R.id.bu9) {
            editText.setText(number + "9");}

        if (view.getId() == R.id.bu0) {
            editText.setText(number + "0");}

        if (view.getId() == R.id.buDot) {
            editText.setText(number + ".");}




    }


    public void operation(View view) {
        isNew = true;
        oldNumber = editText.getText().toString();
        if (view.getId() == R.id.buMinus) {operator = "-";}

        if (view.getId() == R.id.buPlus) {operator = "+";}

        if (view.getId() == R.id.buDivide) {operator = "/";}
        if (view.getId() == R.id.buMultiply) {operator = "*";}
    }






    public void clickEqual(View view) {
        String newNumber = editText.getText().toString();
        double result = 0.0;
        switch (operator) {
            case "-": try {
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber) ;
            } catch (Exception e)
            {}

                break;
            case "+":try {
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber) ;
            } catch (Exception e)
            {} break;
            case "*": try {
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber) ;
            } catch (Exception e)
            {} break;
            case "/": try {
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber) ;
            } catch (Exception e)
            {} break;

        }

        editText.setText(result +"");
    }

    public void acClick(View view) {
        editText.setText("0");
        isNew = true;

    }
}