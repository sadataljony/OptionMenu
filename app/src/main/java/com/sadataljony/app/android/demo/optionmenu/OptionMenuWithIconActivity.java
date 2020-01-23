package com.sadataljony.app.android.demo.optionmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OptionMenuWithIconActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_with_icon);
        mTextView = findViewById(R.id.txt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_with_icon, menu);
        MenuItem menuItemWithIcon = menu.findItem(R.id.action_menu_item_with_icon);
        menuItemWithIcon.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(OptionMenuWithIconActivity.this, "Icon Menu Working...", Toast.LENGTH_LONG).show();
                mTextView.setText("Icon Menu Working...");
                return false;
            }
        });
        return true;
    }
}
