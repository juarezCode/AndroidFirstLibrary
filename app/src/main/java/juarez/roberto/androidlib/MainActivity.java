package juarez.roberto.androidlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import juarez.roberto.myloglibrary.Calculate;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculate.log("funciona mi libreria");
        Calculate.log("result: " + Calculate.sumar(10, 5));
        Calculate.log("result: " + Calculate.restar(10, 5));
        Calculate.log("result: " + Calculate.multiplicar(10, 5));
        Calculate.log("result: " + Calculate.dividir(10, 5));
    }
}