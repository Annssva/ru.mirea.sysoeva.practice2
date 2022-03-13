package ru.mirea.sysoeva.rumireasysoevapractice2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate()");
        TextView editText = (TextView) findViewById(R.id.EditText);
        editText.setText("вызван метод onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
        TextView editText = (TextView) findViewById(R.id.EditText);
        editText.setText("приложение запущено с помощью onStart()");
    }
}