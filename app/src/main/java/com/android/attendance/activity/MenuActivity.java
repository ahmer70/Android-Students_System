package com.android.attendance.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.androidstudentsystem.R;

public class MenuActivity extends Activity {

    Button addStudent;
    Button viewStudent;
    Button logout;
    Button attendancePerStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        addStudent = (Button) findViewById(R.id.buttonaddstudent);
        viewStudent = (Button) findViewById(R.id.buttonViewstudent);
        logout = (Button) findViewById(R.id.buttonlogout);

        addStudent.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuActivity.this, AddStudentActivity.class);
                startActivity(intent);
            }
        });




        viewStudent.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuActivity.this, ViewStudentActivity.class);
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuActivity.this, LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}