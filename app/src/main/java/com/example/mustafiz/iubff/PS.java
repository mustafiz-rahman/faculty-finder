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

public class PS extends AppCompatActivity {

    String[]faculty;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ps);
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

        spinner = (Spinner) findViewById(R.id.spinner4);
        faculty = getResources().getStringArray(R.array.Faculty_Name_PS);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);
        final AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItem().equals("Habib Bin Muzaffar")) {


                    //AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle("Habib Bin Muzaffar");
                    dlgAlert.setMessage("Associate Professor & Head" + "\n" + "Room No : 5009" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: habibbin@secs.iub.edu.bd  ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                } else if (spinner.getSelectedItem().equals("Prof. Mohammed Anwer")) {
                    dlgAlert.setTitle("Prof. Mohammed Anwer");
                    dlgAlert.setMessage("Professor" + "\n" + "Room No : 5008" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: manwer@secs.iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Shipra Banik")) {
                    dlgAlert.setTitle("Shipra Banik");
                    dlgAlert.setMessage("Associate Professor" + "\n" + "Room No : 6004-A" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: banik@secs.iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Mohammad Mostofa Kamal")) {
                    dlgAlert.setTitle("Mohammad Mostofa Kamal");
                    dlgAlert.setMessage("Assistant Professor" + "\n" + "Room No : 6005-A" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: amkamal@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Asma Begum")) {
                    dlgAlert.setTitle("Asma Begum");
                    dlgAlert.setMessage("Assistant Professor" + "\n" + "Room No : 6004" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: asma@secs.iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Dr. Rifat Ara Rouf")) {
                    dlgAlert.setTitle("Dr. Rifat Ara Rouf");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 6004-B" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: rifatara@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Dr.Farhad Alam")) {
                    dlgAlert.setTitle("Dr.Farhad Alam");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 6005-D" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: farhad@secs.iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Jewel Kumer Saha")) {
                    dlgAlert.setTitle("Jewel Kumer Saha");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 5010-D" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: jewelaha_sust@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("K.M.Ariful Kabir")) {
                    dlgAlert.setTitle("K.M.Ariful Kabir");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 5015-B" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: k.ariful@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Rumana Hossain")) {
                    dlgAlert.setTitle("Rumana Hossain");
                    dlgAlert.setMessage("Junior Lecturer" + "\n" + "Room No : 6004-C" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: rumana.iub@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Proma Anwar Khan")) {
                    dlgAlert.setTitle("Proma Anwar Khan");
                    dlgAlert.setMessage("Junior Lecturer" + "\n" + "Room No : 5007" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: proma_a@yahoo.com");
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
