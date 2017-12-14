package com.example.mustafiz.iubff;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MC extends AppCompatActivity {
    String[] faculty;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc);
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
        spinner = (Spinner) findViewById(R.id.spinner5);
        faculty = getResources().getStringArray(R.array.Faculty_name_MC);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);
        final AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItem().equals("Dr. Zakir Hossain Raju")) {


                    //AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle("Dr. Zakir Hossain Raju");
                    dlgAlert.setMessage(" Dean of SLASS" + "\n" + "Room No : 8000" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: zhraju@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                } else if (spinner.getSelectedItem().equals("Dr. G. M. Shahidul Alam")) {
                    dlgAlert.setTitle("Dr. G. M. Shahidul Alam");
                    dlgAlert.setMessage("Head,Media and Communication" + "\n" + "Room No : 7001" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: gmsalam@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Mr. Mohammad Masud Chowdhury")) {
                    dlgAlert.setTitle("Mr. Mohammad Masud Chowdhury");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 7008" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: cmasud@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Tasneem Shahrukh")) {
                    dlgAlert.setTitle("Ms. Tasneem Shahrukh");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 7007" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Fariya Hossain Khan")) {
                    dlgAlert.setTitle("Ms. Fariya Hossain Khan");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 7008" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: fariya@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Tazeen Ahmed")) {
                    dlgAlert.setTitle("Ms. Tazeen Ahmed");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 7008" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Momtaz Parvin")) {
                    dlgAlert.setTitle("Ms. Momtaz Parvin");
                    dlgAlert.setMessage("Lecture" + "\n" + "Room No : 7007" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Jessica Tartila Suma")) {
                    dlgAlert.setTitle("Ms. Jessica Tartila Suma");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 7007" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Aditi Ahmed")) {
                    dlgAlert.setTitle("Ms. Aditi Ahmed");
                    dlgAlert.setMessage("Junior Lecturer" + "\n" + "Room No : 7007" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Raisa Rasheeka")) {
                    dlgAlert.setTitle("Ms. Raisa Rasheeka");
                    dlgAlert.setMessage("Junior Lecturer" + "\n" + "Room No : 7008" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: ");
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
