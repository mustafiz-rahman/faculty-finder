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

public class EEE extends AppCompatActivity {

    String[]faculty;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);
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

        spinner = (Spinner) findViewById(R.id.spinner2);
        faculty = getResources().getStringArray(R.array.Fculty_Name_EEE);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);
        final AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                 if (spinner.getSelectedItem().equals("Dr. Shahriar Khan")) {
                    dlgAlert.setTitle("Dr. Shahriar Khan");
                    dlgAlert.setMessage("Dean of SECS & Professor" + "\n" + "Room No : 5009-C" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: khandhaka@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }

                if (spinner.getSelectedItem().equals("Dr. Khosru M. Salim")) {


                    //AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle("Dr. Khosru M. Salim");
                    dlgAlert.setMessage("Associate Professor & Head" + "\n" + "Room No : 5009-C" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: khosru@iub.edu.bd  ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                }
                else if (spinner.getSelectedItem().equals("Dr. Feroz Ahmed")) {
                    dlgAlert.setTitle("Dr. Feroz Ahmed");
                    dlgAlert.setMessage("Associate Professor" + "\n" + "Room No : 5009-B" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: fahmed@iub.edu.bd ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Dr. M. Abdur Razzak")) {
                    dlgAlert.setTitle("Dr. M. Abdur Razzak");
                    dlgAlert.setMessage("Associate Professor" + "\n" + "Room No : 5009-A" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: razzak@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Dr. Mustafa Habib Chowdhury")) {
                    dlgAlert.setTitle("Dr. Mustafa Habib Chowdhury");
                    dlgAlert.setMessage("Assistant Professor" + "\n" + "Room No : 5011-B" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: mchowdhury@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Ms. Afroza Sultana")) {
                    dlgAlert.setTitle("Ms. Afroza Sultana");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 6004-D" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: afroza@iub.edu.bd ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Ms. Nitu Syed")) {
                    dlgAlert.setTitle("Ms. Nitu Syed");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 6004-C" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: nitusyed@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Mr. Sameer A Khan Mojlish")) {
                    dlgAlert.setTitle("Mr. Sameer A Khan Mojlish");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : " + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: ameer_buet@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Ms. Saila Ishrat Annie")) {
                    dlgAlert.setTitle("Ms. Saila Ishrat Annie");
                    dlgAlert.setMessage("Junior Lecturer" + "\n" + "Room No : 5007-D" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: ishrat_annie@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Ms. Tahsin Ferdous Ara Nayna")) {
                    dlgAlert.setTitle("Ms. Tahsin Ferdous Ara Nayna");
                    dlgAlert.setMessage("Junior Lecturer" + "\n" + "Room No : 5007-B" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: nayna_08@outlook.com");
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
