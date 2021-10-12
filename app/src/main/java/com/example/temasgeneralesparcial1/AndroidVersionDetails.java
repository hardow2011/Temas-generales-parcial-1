package com.example.temasgeneralesparcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class AndroidVersionDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_version_details);

        Intent intent = getIntent();

        TextView details_text_view = findViewById(R.id.details_text_view);
        details_text_view.setText(intent.getStringExtra("details_text_view"));

        TextView internal_code_text_view = findViewById(R.id.internal_code_text_view);
        internal_code_text_view.setText(intent.getStringExtra("internal_code_text_view"));

        TextView version_text_view = findViewById(R.id.version_text_view);
        version_text_view.setText(intent.getStringExtra("version_text_view"));

        TextView release_date_text_view = findViewById(R.id.release_date_text_view);
        release_date_text_view.setText(intent.getStringExtra("release_date_text_view"));

        CheckBox is_supported_check_box = findViewById(R.id.is_supported_check_box);
        is_supported_check_box.setChecked(false);
        if((Boolean) intent.getExtras().getBoolean("is_supported_check_box") == true) {
            is_supported_check_box.setChecked(true);
        }

    }
}