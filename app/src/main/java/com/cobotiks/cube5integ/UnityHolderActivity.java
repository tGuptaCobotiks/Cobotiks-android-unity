package com.cobotiks.cube5integ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

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