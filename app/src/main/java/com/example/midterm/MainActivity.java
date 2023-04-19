package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ResultFragment resultFragment;
    EditText num1, num2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultFragment = new ResultFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.resultFragment, resultFragment).commit();

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnsub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(String.valueOf(num1.getText()));
                int number2 = Integer.parseInt(String.valueOf(num2.getText()));
                int sum = number1 + number2;
//                Toast.makeText(MainActivity.this, "sum" + sum, Toast.LENGTH_SHORT).show();
                resultFragment.getData(String.valueOf(sum));
                InputMethodManager imm=(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(num1.getWindowToken(),0);

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(String.valueOf(num1.getText()));
                int number2 = Integer.parseInt(String.valueOf(num2.getText()));
                int sum = number1 - number2;
//                Toast.makeText(MainActivity.this, "sum" - sum, Toast.LENGTH_SHORT).show();
                resultFragment.getData(String.valueOf(sum));
                InputMethodManager imm=(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(num1.getWindowToken(),0);

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(String.valueOf(num1.getText()));
                int number2 = Integer.parseInt(String.valueOf(num2.getText()));
                int sum = number1 * number2;
//                Toast.makeText(MainActivity.this, "sum" * sum, Toast.LENGTH_SHORT).show();
                resultFragment.getData(String.valueOf(sum));
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(num1.getWindowToken(),0);

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(String.valueOf(num1.getText()));
                int number2 = Integer.parseInt(String.valueOf(num2.getText()));
                int sum = number1 / number2;
//                Toast.makeText(MainActivity.this, "sum" / sum, Toast.LENGTH_SHORT).show();
                resultFragment.getData(String.valueOf(sum));
                InputMethodManager imm=(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(num1.getWindowToken(),0);
            }
        });
    }
}