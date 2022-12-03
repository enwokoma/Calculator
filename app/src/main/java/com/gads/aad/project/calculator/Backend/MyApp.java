package com.gads.aad.project.calculator.Backend;

import android.app.Application;

import com.gads.aad.project.calculator.Constants;
import com.google.firebase.database.FirebaseDatabase;

public class MyApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        //offline activation
        FirebaseDatabase.getInstance(Constants.FIREBASE_LINK).setPersistenceEnabled(true);
    }
}

