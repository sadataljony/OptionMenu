package com.sadataljony.app.android.demo.optionmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnOptionMenuWithLabel, mBtnOptionMenuWithIcon, mBtnOptionMenuWithList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnOptionMenuWithLabel = findViewById(R.id.buttonOptionMenuWithLabel);
        mBtnOptionMenuWithIcon = findViewById(R.id.buttonOptionMenuWithIcon);
        mBtnOptionMenuWithList = findViewById(R.id.buttonOptionMenuWithList);
        mBtnOptionMenuWithLabel.setOnClickListener(this);
        mBtnOptionMenuWithIcon.setOnClickListener(this);
        mBtnOptionMenuWithList.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mBtnOptionMenuWithLabel) {
            Toast.makeText(MainActivity.this, "Option Menu With Label", Toast.LENGTH_LONG).show();
            startActivity(new Intent(MainActivity.this, OptionMenuWithLabelActivity.class));
        }

        if (v == mBtnOptionMenuWithIcon) {
            Toast.makeText(MainActivity.this, "Option Menu With Icon", Toast.LENGTH_LONG).show();
            startActivity(new Intent(MainActivity.this, OptionMenuWithIconActivity.class));
        }

        if (v == mBtnOptionMenuWithList) {
            Toast.makeText(MainActivity.this, "Option Menu With List", Toast.LENGTH_LONG).show();
            startActivity(new Intent(MainActivity.this, OptionMenuWithListActivity.class));
        }
    }

}
