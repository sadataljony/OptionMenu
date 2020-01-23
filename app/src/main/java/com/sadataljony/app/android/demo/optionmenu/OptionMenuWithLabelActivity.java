package com.sadataljony.app.android.demo.optionmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OptionMenuWithLabelActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_with_label);
        mTextView = findViewById(R.id.txt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_with_label, menu);
        MenuItem menuItemSave = menu.findItem(R.id.action_save);
        menuItemSave.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(OptionMenuWithLabelActivity.this, "Label Menu Working...", Toast.LENGTH_LONG).show();
                mTextView.setText("Label Menu Working...");
                return false;
            }
        });
        return true;
    }

}
