package com.example.lesson_5nav;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        getSupportActionBar().setTitle("Gallery");
    }
}