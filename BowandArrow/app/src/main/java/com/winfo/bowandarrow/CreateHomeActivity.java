package com.winfo.bowandarrow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CreateHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Home home = new Home();
        Intent i = new Intent(this, EditHomeActivity.class);
        i.putExtra("com.winfo.bowandarrow.Home", home);
        startActivity(i);
    }

}