package com.remake.earthianbeing.google;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO REMOVE
        OpenSearch();

        // Hide ActionBar
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().hide();
        }

        // Variables
        LinearLayout Search = findViewById(R.id.Search);

        LinearLayout ScreenDiscover = findViewById(R.id.ScreenDiscover);
        LinearLayout ScreenCollections = findViewById(R.id.ScreenCollections);

        LinearLayout TabDiscover = findViewById(R.id.TabDiscover);
        LinearLayout TabSearch = findViewById(R.id.TabSearch);
        LinearLayout TabCollections = findViewById(R.id.TabCollections);

        ImageView TabDiscoverIcon = findViewById(R.id.TabDiscoverIcon);
        ImageView TabSearchIcon = findViewById(R.id.TabSearchIcon);
        ImageView TabCollectionsIcon = findViewById(R.id.TabCollectionsIcon);

        TextView TabDiscoverText = findViewById(R.id.TabDiscoverText);
        TextView TabSearchText = findViewById(R.id.TabSearchText);
        TextView TabCollectionsText = findViewById(R.id.TabCollectionsText);

        // OnClick Listeners
        TabDiscover.setOnClickListener(view -> {
            TabDiscover.setBackgroundResource(R.drawable.option_enabled);
            TabSearch.setBackgroundResource(R.drawable.option_disabled);
            TabCollections.setBackgroundResource(R.drawable.option_disabled);

            TabDiscoverIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.star_enabled));
            TabDiscoverText.setTextColor(getResources().getColor(R.color.white));

            TabSearchIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.search_disabled));
            TabSearchText.setTextColor(getResources().getColor(R.color.icon_color_disable));

            TabCollectionsIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.collections_disabled));
            TabCollectionsText.setTextColor(getResources().getColor(R.color.icon_color_disable));

            // Change Screen
            ScreenCollections.setVisibility(View.GONE);
            ScreenDiscover.setVisibility(View.VISIBLE);
        });
        TabSearch.setOnClickListener(view -> {
            OpenSearch();
        });
        TabCollections.setOnClickListener(view -> {
            TabDiscover.setBackgroundResource(R.drawable.option_disabled);
            TabSearch.setBackgroundResource(R.drawable.option_disabled);
            TabCollections.setBackgroundResource(R.drawable.option_enabled);

            TabDiscoverIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.star_disabled));
            TabDiscoverText.setTextColor(getResources().getColor(R.color.icon_color_disable));

            TabSearchIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.search_disabled));
            TabSearchText.setTextColor(getResources().getColor(R.color.icon_color_disable));

            TabCollectionsIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.collections_enabled));
            TabCollectionsText.setTextColor(getResources().getColor(R.color.white));

            // Change Screen
            ScreenDiscover.setVisibility(View.GONE);
            ScreenCollections.setVisibility(View.VISIBLE);
        });
        Search.setOnClickListener(view -> OpenSearch());
    }

    private void OpenSearch()
    {
        startActivity(new Intent(this, SearchActivity.class));
    }
}