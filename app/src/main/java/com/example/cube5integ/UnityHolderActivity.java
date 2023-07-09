package com.example.cube5integ;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.Manifest;

import com.unity3d.player.UnityPlayerActivity;

public class UnityHolderActivity extends AppCompatActivity {
    private static final int REQUEST_CAMERA_PERMISSION = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unity_holder);
        Intent intent = new Intent(UnityHolderActivity.this, UnityPlayerActivity.class);
        startActivity(intent);
    }
}