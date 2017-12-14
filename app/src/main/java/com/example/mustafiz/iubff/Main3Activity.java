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

public class Main3Activity extends AppCompatActivity {

    String[]faculty;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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

        spinner = (Spinner) findViewById(R.id.spinner3);
        faculty = getResources().getStringArray(R.array.Faculty_Name_CSE);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);
        final AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                 if (spinner.getSelectedItem().equals("Dr. Farruk Ahmed")) {
                    dlgAlert.setTitle("Dr. Farruk Ahmed");
                    dlgAlert.setMessage("Professor" + "\n" + "Room No : " + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: professor.farruk.googlepages.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }

                if (spinner.getSelectedItem().equals("Dr. Ali Shihab Sabbir")) {


                    //AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle("Dr. Ali Shihab Sabbir");
                    dlgAlert.setMessage("Associate Professor" + "\n" + "Room No : 6001" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: asabbir@iub.edu.bd ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                }
                else if (spinner.getSelectedItem().equals("Dr. Mahady Hasan")) {
                    dlgAlert.setTitle("Dr. Mahady Hasan");
                    dlgAlert.setMessage("Assistant Professor & Head" + "\n" + "Room No : 5011-A" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: mahadyh@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Dr. Md. Ashraful Amin")) {
                    dlgAlert.setTitle("Dr. Md. Ashraful Amin");
                    dlgAlert.setMessage("Associate Professor" + "\n" + "Room No : 6003-B" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: aminmdashraful@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Dr. Mahbub Murshed")) {
                    dlgAlert.setTitle("Dr. Mahbub Murshed");
                    dlgAlert.setMessage("Assistant Professor" + "\n" + "Room No : 6006-B" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: murshed@iub.edu.bd ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Mohammad Noor Nabi")) {
                    dlgAlert.setTitle("Mohammad Noor Nabi");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 6005-B" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: mnnabi@iub.edu.bd ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Subrata K. Dey")) {
                    dlgAlert.setTitle("Subrata K. Dey");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 6005-C" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: subrata@iub.edu.bd ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Javed Hossain")) {
                    dlgAlert.setTitle("Javed Hossain");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 5010-A" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: javedhossain2033@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Md. Raihan Bin Rafique")) {
                    dlgAlert.setTitle("Md. Raihan Bin Rafique");
                    dlgAlert.setMessage("Junior Lecturer" + "\n" + "Room No : 5010-D" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: raihan.bin.rafique@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }

                else if (spinner.getSelectedItem().equals("Rakibul Alam")) {
                    dlgAlert.setTitle("Rakibul Alam");
                    dlgAlert.setMessage("Junior Lecturer" + "\n" + "Room No : 5010-D" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Shabnam Shahreen Sifat")) {
                    dlgAlert.setTitle("Shabnam Shahreen Sifat");
                    dlgAlert.setMessage("Junior Lecturer" + "\n" + "Room No : 5007-B" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: shabnam@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Aunnoy K Mutasim")) {
                    dlgAlert.setTitle("Aunnoy K Mutasim");
                    dlgAlert.setMessage("Junior Lecturer" + "\n" + "Room No : 5010-D" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: aunnoy@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Ahammed Ullah")) {
                    dlgAlert.setTitle("Ahammed Ullah");
                    dlgAlert.setMessage("Junior Lecturer" + "\n" + "Room No : 5010-B" + "\n" + "Level-4" + "\n" + "lift-4" + "\n" + "Email: ahammedullah@iub.edu.bd ");
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
