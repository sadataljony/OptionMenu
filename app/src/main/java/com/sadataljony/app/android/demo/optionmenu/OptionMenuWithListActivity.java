package com.sadataljony.app.android.demo.optionmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OptionMenuWithListActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_with_list);
        mTextView = findViewById(R.id.txt);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_with_list, menu);
        MenuItem menuItemFirst = menu.findItem(R.id.action_first);
        MenuItem menuItemSecond = menu.findItem(R.id.action_second);
        MenuItem menuItemThird = menu.findItem(R.id.action_third);
        menuItemFirst.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(OptionMenuWithListActivity.this, "First Selected...", Toast.LENGTH_LONG).show();
                mTextView.setText("First Selected...");
                return false;
            }
        });
        menuItemSecond.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(OptionMenuWithListActivity.this, "Second Selected...", Toast.LENGTH_LONG).show();
                mTextView.setText("Second Selected...");
                return false;
            }
        });
        menuItemThird.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(OptionMenuWithListActivity.this, "Third Selected...", Toast.LENGTH_LONG).show();
                mTextView.setText("Third Selected...");
                return false;
            }
        });
        return true;
    }
}
