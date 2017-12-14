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

public class LAW extends AppCompatActivity {
    String[] faculty;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);
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
        spinner = (Spinner) findViewById(R.id.spinner8);
        faculty = getResources().getStringArray(R.array.Faculty_name_LAW);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);
        final AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItem().equals("Mr. Liton Chandra Biswas")) {


                    //AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle("Mr. Liton Chandra Biswas");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 10023" + "\n" + "Level-8" + "\n" + "lift-7" + "\n" + "Email: lcb@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                } else if (spinner.getSelectedItem().equals("Nahid Sultana Jenny")) {
                    dlgAlert.setTitle("Nahid Sultana Jenny");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 10023" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: nahidjenny@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Syeda Sakina Mumtaz Huq")) {
                    dlgAlert.setTitle("Ms. Syeda Sakina Mumtaz Huq");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 10023" + "\n" + "Level-8" + "\n" + "lift-8" + "\n" + "Email: sakina@iub.edu.bd");
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
