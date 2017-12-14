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

public class ENG extends AppCompatActivity {

    String[] faculty;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng);
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
        spinner = (Spinner) findViewById(R.id.spinner6);
        faculty = getResources().getStringArray(R.array.Faculty_name_ENG);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);
        final AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItem().equals("Dr. Towhid Bin Muzaffar")) {


                    //AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle("Dr. Towhid Bin Muzaffar");
                    dlgAlert.setMessage("Head of Department" + "\n" + "Room No : 8008" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: towhid@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                } else if (spinner.getSelectedItem().equals("Prof. Razia Sultana Khan")) {
                    dlgAlert.setTitle("Prof. Razia Sultana Khan");
                    dlgAlert.setMessage("Professor" + "\n" + "Room No : 8009" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: raziask@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Dr. Akimun Rahman")) {
                    dlgAlert.setTitle("Dr. Akimun Rahman");
                    dlgAlert.setMessage("Professor" + "\n" + "Room No : 8006" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: akimun@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Haroonuzzaman")) {
                    dlgAlert.setTitle("Haroonuzzaman");
                    dlgAlert.setMessage("Assistant Professor" + "\n" + "Room No : 8008" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: haroon@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Sayyeda -tun- Noor Sameera")) {
                    dlgAlert.setTitle("Sayyeda -tun- Noor Sameera");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 8010" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: sami@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Syed Mazharul Islam")) {
                    dlgAlert.setTitle("Syed Mazharul Islam");
                    dlgAlert.setMessage("Assistant Professor" + "\n" + "Room No : " + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: mazhar@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Md. Shaiful Islam")) {
                    dlgAlert.setTitle("Md. Shaiful Islam");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 8010" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: sayeef77@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Rezina Nazneen Rimi")) {
                    dlgAlert.setTitle("Ms. Rezina Nazneen Rimi");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 8005" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: rimi@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Saara Zabeen")) {
                    dlgAlert.setTitle("Ms. Saara Zabeen");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : " + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: saarazabeen@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Mithila Mahfuz")) {
                    dlgAlert.setTitle("Ms. Mithila Mahfuz");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 8005" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: mmithila@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Saara Zabeen")) {
                    dlgAlert.setTitle("Ms. Saara Zabeen");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : " + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: saarazabeen@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Naureen Rahnuma")) {
                    dlgAlert.setTitle("Naureen Rahnuma");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 8005" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Shaila Shams")) {
                    dlgAlert.setTitle("Ms. Shaila Shams");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 8005" + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();


                }
                else if (spinner.getSelectedItem().equals("Ms. Noora Shamsi Bahar")) {
                    dlgAlert.setTitle("Ms. Noora Shamsi Bahar");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : " + "\n" + "Level-6" + "\n" + "lift-6" + "\n" + "Email: ");
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
