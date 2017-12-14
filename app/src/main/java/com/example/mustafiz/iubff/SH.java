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

public class SH extends AppCompatActivity {


    String[] faculty;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sh);
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
        spinner = (Spinner) findViewById(R.id.spinner7);
        faculty = getResources().getStringArray(R.array.Faculty_name_SH);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);
        final AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItem().equals("Dr. Mahbub Alam")) {


                    //AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle("Dr. Mahbub Alam");
                    dlgAlert.setMessage("Head of Department" + "\n" + "Room No : 8003" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: mahbubalam@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                } else if (spinner.getSelectedItem().equals("Dr. Manzurul Mannan")) {
                    dlgAlert.setTitle("Dr. Manzurul Mannan");
                    dlgAlert.setMessage("Associate Professor" + "\n" + "Room No : 7009" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: mannanmm@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Nazir Ahmed")) {
                    dlgAlert.setTitle("Nazir Ahmed");
                    dlgAlert.setMessage("Assistant Professor" + "\n" + "Room No : 7006-A" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: nazir@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Dr. Talim Hossain")) {
                    dlgAlert.setTitle("Dr. Talim Hossain");
                    dlgAlert.setMessage("Assistant Professor" + "\n" + "Room No : " + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: talim@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Sharmeen Ahmed")) {
                    dlgAlert.setTitle("Ms. Sharmeen Ahmedn");
                    dlgAlert.setMessage("" + "\n" + "Room No : 8004" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: disha@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Mr. Mohammad Mahfuzul Islam")) {
                    dlgAlert.setTitle("Mr. Mohammad Mahfuzul Islam");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 8004" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: mahfuz1699@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Mahbuba Dewan")) {
                    dlgAlert.setTitle("Ms. Mahbuba Dewan");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 8010" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: mahbuba@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Mr. Obydullah Al Marjuk")) {
                    dlgAlert.setTitle("Mr. Obydullah Al Marjuk");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 7007" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: ");
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
