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

public class ENV extends AppCompatActivity {
    String[] faculty;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_env);
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
        spinner = (Spinner) findViewById(R.id.spinner9);
        faculty = getResources().getStringArray(R.array.Faculty_name_ENV);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);
        final AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItem().equals("Prof. Dr. M. Ali Hossain")) {


                    //AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle("Prof. Dr. M. Ali Hossain");
                    dlgAlert.setMessage("Dean of SESM" + "\n" + "Room No : 9000" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email:mahossain@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                } else if (spinner.getSelectedItem().equals("Prof. Haroun Er Rashid")) {
                    dlgAlert.setTitle("Prof. Haroun Er Rashid");
                    dlgAlert.setMessage("Head of EM" + "\n" + "Room No : 9010" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Prof. Dr. Lutfor Rahman")) {
                    dlgAlert.setTitle("Prof. Dr. Lutfor Rahman");
                    dlgAlert.setMessage("Professor" + "\n" + "Room No : 9012" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: lrahmankush@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Dr. Abdul Khaleque")) {
                    dlgAlert.setTitle("Dr. Abdul Khaleque");
                    dlgAlert.setMessage("Associate Professor" + "\n" + "Room No : 9005" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: akhaleque@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Dr. Md. Hafizur Rahman")) {
                    dlgAlert.setTitle("Dr. Md. Hafizur Rahman");
                    dlgAlert.setMessage("Assistant Professor" + "\n" + "Room No : 9011" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: hrahman@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Mr. Ahmed Shahnewaj Chowdhury")) {
                    dlgAlert.setTitle("Mr. Ahmed Shahnewaj Chowdhury");
                    dlgAlert.setMessage("Senior Lecturer," + "\n" + "Room No : 9009" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: princeor@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Shohana Huq")) {
                    dlgAlert.setTitle("Ms. Shohana Huq");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 9007" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Mr. Chowdhury Kamrul Hasan")) {
                    dlgAlert.setTitle("Mr. Chowdhury Kamrul Hasan");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : " + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: chowdhury.hasan@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Kazi Sunzida Lisa")) {
                    dlgAlert.setTitle("Ms. Kazi Sunzida Lisa");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 9007" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: sunzida@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Mr. Tanvir Ahmed Haroon")) {
                    dlgAlert.setTitle("Mr. Tanvir Ahmed Haroon");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 9007" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: taharoon@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Mr. Abdul Baten")) {
                    dlgAlert.setTitle("Mr. Abdul Baten");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 9009" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: a.baten@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Mr. Musfique Ahmed")) {
                    dlgAlert.setTitle("Mr. Musfique Ahmed");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 9006" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Nabila Rahman")) {
                    dlgAlert.setTitle("Ms. Nabila Rahman");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : " + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: ");
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
