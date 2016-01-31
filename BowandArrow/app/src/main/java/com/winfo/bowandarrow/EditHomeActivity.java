package com.winfo.bowandarrow;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EditHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        Home home = getIntent().getExtras().getParcelable("com.winfo.bowandarrow.Home");

        EditText address = (EditText) findViewById(R.id.address);
        EditText nickname = (EditText) findViewById(R.id.nickname);
        EditText bathrooms = (EditText) findViewById(R.id.bathrooms);
        EditText bedrooms = (EditText) findViewById(R.id.bedrooms);
        EditText price = (EditText) findViewById(R.id.price);

        if (home.getAddress() != null) {
            address.setText(home.getAddress());
        }

        if (home.getNickname() != null) {
            nickname.setText(home.getNickname());
        }

        if (home.getBathrooms() != null) {
            bathrooms.setText(home.getBathrooms());
        }

        if (home.getBedrooms() != null) {
            bedrooms.setText(home.getBedrooms());
        }

        if (home.getPrice() != null) {
            price.setText("" + home.getPrice());
        }
    }

    public void submit(View view) {
        
    }

}
