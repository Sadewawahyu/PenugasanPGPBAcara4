package com.example.penugasanacara4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    private TextView tvUsername, tvEmail, tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Initialize views
        tvUsername = findViewById(R.id.tvUsername);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhone = findViewById(R.id.tvPhone);

        // Retrieve data from SharedPreferences
        SharedPreferences prefs = getSharedPreferences("UserData", MODE_PRIVATE);
        String username = prefs.getString("USERNAME", "");
        String email = prefs.getString("EMAIL", "");
        String phone = prefs.getString("PHONE", "");

        // Set the retrieved data to TextViews
        tvUsername.setText(username);
        tvEmail.setText(email);
        tvPhone.setText(phone);
    }
}