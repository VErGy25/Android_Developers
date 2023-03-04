package com.mirea.makhorkingrigoriyyurievich.layoutetype;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int i = 1;
    public void onMyButtonClick(View view)
    {
        // выводим сообщение
        //Toast.makeText(this, "Зачем вы нажали?", Toast.LENGTH_SHORT).show();
        TextView textView = findViewById(R.id.textView);
        if (i== 1) {
            textView.setText("Добро пожаловать");
            i=i-1;
        }else{
            textView.setText("Уходите прочь!");
            i=i+1;
        }
        CheckBox checkBox = findViewById(R.id.checkBox2);
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
        }
        else {
            checkBox.setChecked(true);
        }
    }


}