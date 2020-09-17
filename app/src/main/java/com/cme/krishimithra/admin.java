package com.cme.krishimithra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class admin extends AppCompatActivity {
    Button b3,b4;
    EditText E1,E2;

    public void Init() {
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {

               Intent l = new Intent(admin.this, admin_control_panel.class);
                startActivity(l);
            }
        });
    }
    public void Init1() {
        b4 = (Button) findViewById(R.id.loginasnew);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {

                Intent l = new Intent(admin.this, admindata.class);
                startActivity(l);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Init();
        Init1();

    }
}
