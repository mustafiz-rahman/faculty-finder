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

public class PH extends AppCompatActivity {
    String[] faculty;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ph);
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
        spinner = (Spinner) findViewById(R.id.spinner10);
        faculty = getResources().getStringArray(R.array.Faculty_name_PH);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);
        final AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItem().equals("Professor M. Omar Rahman")) {


                    //AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle("Professor M. Omar Rahman");
                    dlgAlert.setMessage("Dean of SPH" + "\n" + "Room No : " + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: orahman@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                } else if (spinner.getSelectedItem().equals("Dr. Nafisa Huq")) {
                    dlgAlert.setTitle("Dr. Nafisa Huq");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 10010" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: nafisa123@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Samia Aziz")) {
                    dlgAlert.setTitle("Ms. Samia Aziz");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 10008" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Dr. S M Raysul Haque")) {
                    dlgAlert.setTitle("Dr. S M Raysul Haque");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 10008" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Dr. Shabareen Tisha")) {
                    dlgAlert.setTitle("Dr. Shabareen Tisha");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 10008" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Tarzia Choudhury")) {
                    dlgAlert.setTitle("Ms. Tarzia Choudhury");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 10008" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: ");
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
