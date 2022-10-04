package com.remake.earthianbeing.google;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Hide ActionBar
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().hide();
        }

        // Variables
        EditText SearchBar = findViewById(R.id.SearchBar);

        // Focus on search bar
        SearchBar.requestFocus();
        InputMethodManager manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        manager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }
}