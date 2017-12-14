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

public class LS extends AppCompatActivity {
    String[] faculty;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ls);
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
        spinner = (Spinner) findViewById(R.id.spinner11);
        faculty = getResources().getStringArray(R.array.Faculty_name_LS);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);
        final AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItem().equals("Dr. Rita Yusuf")) {


                    //AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle("Dr. Rita Yusuf");
                    dlgAlert.setMessage("Dean of SLS" + "\n" + "Room No : 10006" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: ritayusuf@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                } else if (spinner.getSelectedItem().equals("Dr. Ashrafus Safa")) {
                    dlgAlert.setTitle("Dr. Ashrafus Safa");
                    dlgAlert.setMessage("Assitant Professor" + "\n" + "Room No : 10013" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: mrpsafa@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Noshin Azra Rahman")) {
                    dlgAlert.setTitle("Ms. Noshin Azra Rahman");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : " + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: rahman.noshin@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Mariz Sintaha")) {
                    dlgAlert.setTitle("Ms. Mariz Sintaha");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : " + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: sintu.bmb@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Mr. Ahsan Habib Polash")) {
                    dlgAlert.setTitle("Mr. Ahsan Habib Polash");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 10012" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: paulahsan@ iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Zajeba Tabashsum")) {
                    dlgAlert.setTitle("Ms. Zajeba Tabashsum");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 10012" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: zajeba25@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Tasnimul Ferdous")) {
                    dlgAlert.setTitle("Ms. Tasnimul Ferdous");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 10007" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: shammo.tasnim@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Mahina Tabassum Mitul")) {
                    dlgAlert.setTitle("Ms. Mahina Tabassum Mitul");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 10007" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: mahina18@gmail.com");
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
