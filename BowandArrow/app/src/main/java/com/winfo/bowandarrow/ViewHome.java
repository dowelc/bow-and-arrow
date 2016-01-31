package com.winfo.bowandarrow;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ViewHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.top_bar);
        setSupportActionBar(toolbar);

        String homeName = "Home name here";
        setTitle(homeName);

//        Home home = (Home) (getIntent().getExtras().getParcelable("com.winfo.bowandarrow.Home"));

//        TextView rooms = (TextView) findViewById(R.id.num_rooms_data);
//        Integer numBedrooms = home.getBedrooms();
//        if (numBedrooms != null) {
//            rooms.setText("" + numBedrooms);
//        }

//        TextView baths = (TextView) findViewById(R.id.num_baths_data);
//        Integer numBaths = home.getBathrooms();
//        if (numBaths != null) {
//            baths.setText("" + home.getBathrooms());
//        }

//        TextView managerPhone = (TextView) findViewById(R.id.manager_phone_data);
//        managerPhone.setText("" + home.getManagerPhone());

//        TextView managerEmail = (TextView) findViewById(R.id.manager_email_data);
//        managerEmail.setText("" + home.getManagerEmail());


        TextView managerPhoneNum = (TextView) findViewById(R.id.manager_phone_data);
        managerPhoneNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callPhoneNum(v);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.view_home_menu, menu);
        return true;
    }

    public void callPhoneNum(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:5038583754"));
        try {
            startActivity(callIntent);
        } catch (SecurityException e) {

        }
    }

}
