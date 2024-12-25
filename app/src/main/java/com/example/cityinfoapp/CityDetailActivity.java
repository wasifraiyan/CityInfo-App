
package com.example.cityinfoapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CityDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_detail);

        // Enable the Up button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView cityName = findViewById(R.id.city_name);
        ImageView cityImage = findViewById(R.id.city_image);
        TextView cityInfo = findViewById(R.id.city_info);

        String selectedCity = getIntent().getStringExtra("CITY_NAME");
        cityName.setText(selectedCity);

        switch (selectedCity) {
            case "Toronto":
                cityImage.setImageResource(R.drawable.toronto_image);
                cityInfo.setText("Population: 2.7M\nWeather: Humid Continental");
                break;
            case "Vancouver":
                cityImage.setImageResource(R.drawable.vancouver_image);
                cityInfo.setText("Population: 631K\nWeather: Oceanic");
                break;
            case "Montreal":
                cityImage.setImageResource(R.drawable.montreal_image);
                cityInfo.setText("Population: 1.7M\nWeather: Humid Continental");
                break;
            case "Ottawa":
                cityImage.setImageResource(R.drawable.ottawa_image);
                cityInfo.setText("Population: 934K\nWeather: Humid Continental");
                break;
            case "Calgary":
                cityImage.setImageResource(R.drawable.calgary_image);
                cityInfo.setText("Population: 1.3M\nWeather: Semi-arid");
                break;
            default:
                cityInfo.setText("Information not available.");
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle the Up button click
        if (item.getItemId() == android.R.id.home) {
            finish(); // Close the activity and return to the previous one
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

