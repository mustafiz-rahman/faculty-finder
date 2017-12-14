package com.example.mustafiz.iubff;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Economics extends AppCompatActivity {
    String[] faculty;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economics);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Send Feedback : mustafiz.iub@gmail.com", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        spinner = (Spinner) findViewById(R.id.spinner13);
        faculty = getResources().getStringArray(R.array.Faculty_Name_Economic);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);
        final AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItem().equals("Prof. Aminur Rahman")) {


                    //AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle("Prof. Aminur Rahman");
                    dlgAlert.setMessage(" Professor & Head of Economics Dept." + "\n" + "Room No : 4007-A" + "\n" + "Level-2" + "\n" + "lift-2" + "\n" + "Email: aminur@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                } else if (spinner.getSelectedItem().equals("Dr. Mohammad Osman Gani")) {
                    dlgAlert.setTitle("Dr. Mohammad Osman Gani");
                    dlgAlert.setMessage("Associate Professor" + "\n" + "Room No : 4007" + "\n" + "Level-2" + "\n" + "lift-2" + "\n" + "Email: ganiosman@hotmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                } else if (spinner.getSelectedItem().equals("Shamil M. Al-Islam")) {
                    dlgAlert.setTitle("Shamil M. Al-Islam");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 4005" + "\n" + "Level-2" + "\n" + "lift-2" + "\n" + "Email: shamil@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                } else if (spinner.getSelectedItem().equals("Tapas Kumar Paul")) {
                    dlgAlert.setTitle("Tapas Kumar Paul");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 3001" + "\n" + "Level-2" + "\n" + "lift-2" + "\n" + "Email: tapaspaul@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                } else if (spinner.getSelectedItem().equals("Khwaja Saifur Rahman")) {
                    dlgAlert.setTitle("Khwaja Saifur Rahman");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 3001" + "\n" + "Level-2" + "\n" + "lift-2" + "\n" + "Email:");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                } else if (spinner.getSelectedItem().equals("Mr.Md. Kamrul Islam")) {
                    dlgAlert.setTitle("Mr.Md. Kamrul Islam");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 3001" + "\n" + "Level-2" + "\n" + "lift-2" + "\n" + "Email: kamrul@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                } else if (spinner.getSelectedItem().equals("Ms. Anita Fairuz")) {
                    dlgAlert.setTitle("Ms. Anita Fairuz");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 3001" + "\n" + "Level-2" + "\n" + "lift-2" + "\n" + "Email: anita@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                } else if (spinner.getSelectedItem().equals("Ms. Mumtahina Islam")) {
                    dlgAlert.setTitle("Ms. Mumtahina Islam");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 4004" + "\n" + "Level-2" + "\n" + "lift-2" + "\n" + "Email: mumtahina@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}