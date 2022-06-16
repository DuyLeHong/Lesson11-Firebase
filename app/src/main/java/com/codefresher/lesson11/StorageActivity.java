package com.codefresher.lesson11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class StorageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();

        Log.d("UserInfo", currentUser.getDisplayName());
        Log.d("UserInfo", currentUser.getEmail());
        Log.d("UserInfo", currentUser.getUid());

        FirebaseAuth.getInstance().signOut();
    }
}