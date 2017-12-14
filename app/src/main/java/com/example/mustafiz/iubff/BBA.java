package com.example.mustafiz.iubff;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class BBA extends AppCompatActivity {
    String[]faculty;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bb);
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


        spinner = (Spinner) findViewById(R.id.spinner12);
        faculty = getResources().getStringArray(R.array.faculty_name_business);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);
        final AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItem().equals("Dr Sarwar Uddin Ahmed")) {


                    //AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
                    dlgAlert.setTitle("Dr Sarwar Uddin Ahmed");
                    dlgAlert.setMessage("Dean of SB & Professor" + "\n" + "Room No : 2001" + "\n"+"Level-1"+"\n"+"lift-1"+"\n" + "Email: sahmed@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();
                } else if (spinner.getSelectedItem().equals("Dr. Dilip Kumar Sen")) {
                    dlgAlert.setTitle("Dr. Dilip Kumar Sen");
                    dlgAlert.setMessage("Professor" + "\n" + "Room No : 4003-A" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: prof_dilipsen@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                } else if (spinner.getSelectedItem().equals("Dr. Nadim Jahangir")) {
                    dlgAlert.setTitle("Dr. Nadim Jahangir");
                    dlgAlert.setMessage("Professor" + "\n" + "Room No : " + "\n"+"Level-"+"\n"+"lift-"+"\n" + "Email: njahangir@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Aminur Rahman")) {
                    dlgAlert.setTitle("Aminur Rahman");
                    dlgAlert.setMessage("Professor" + "\n" + "Room No : 4007-A" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: aminur@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Dr. Mohammad Osman Gani")) {
                    dlgAlert.setTitle("Dr. Mohammad Osman Gani");
                    dlgAlert.setMessage("Associate Professor" + "\n" + "Room No : 4007" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: ganiosman@hotmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Dr. A. N. M. Shibly Noman Khan")) {
                    dlgAlert.setTitle("Dr. A. N. M. Shibly Noman Khan");
                    dlgAlert.setMessage("Associate Professor" + "\n" + "Room No : 4008-A" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: khan_Shibly@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Abul Bashar")) {
                    dlgAlert.setTitle("Abul Bashar");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 3006" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: bashar@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Hanif Mahtab")) {
                    dlgAlert.setTitle("Hanif Mahtab");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 3007-D" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: hanif@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Mohammed Sohel Islam")) {
                    dlgAlert.setTitle("Mohammed Sohel Islam");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 4009-C" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: eehamtaj@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Saquib Shahriar")) {
                    dlgAlert.setTitle("Saquib Shahriar");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 3007" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: sunvi@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Dr. Samiul Parvez Ahmed")) {
                    dlgAlert.setTitle("Dr. Samiul Parvez Ahmed");
                    dlgAlert.setMessage("Assistant Professor" + "\n" + "Room No : 2007" + "\n"+"Level-1"+"\n"+"lift-1"+"\n" + "Email: samiul@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Sumita Das")) {
                    dlgAlert.setTitle("Sumita Das");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 3006" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: sumita.sdas@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Mohammad Ali Arafat")) {
                    dlgAlert.setTitle("Mohammad Ali Arafat");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 3007-A" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: arafat@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Abu Bakr Emran Salahuddin")) {
                    dlgAlert.setTitle("Abu Bakr Emran Salahuddin");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 4004-B" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: emrans@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Md. Latiful Khabir")) {
                    dlgAlert.setTitle("DMd. Latiful Khabir");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 3007-C" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email:latiful@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Md Rajib Rahman")) {
                    dlgAlert.setTitle("Md Rajib Rahman");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 4004-E" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: rajib@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Abul Khair Jyote")) {
                    dlgAlert.setTitle("Abul Khair Jyote");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 3006-A" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: kj.iub@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Monzoor Morshed")) {
                    dlgAlert.setTitle("Monzoor Morshed");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 4004" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: ");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Parvez Ahmed Sharif")) {
                    dlgAlert.setTitle("Parvez Ahmed Sharif");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 4004" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: pasharif@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Sadia Haque")) {
                    dlgAlert.setTitle("Sadia Haque");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 3007-C" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: sadiahaque@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Maqbool Kader Quraishi")) {
                    dlgAlert.setTitle("Maqbool Kader Quraishi");
                    dlgAlert.setMessage("Lecturer" + "\n" + "Room No : 4009-C" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: quraishmk@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Iftekhar Mahfuz")) {
                    dlgAlert.setTitle("Iftekhar Mahfuz");
                    dlgAlert.setMessage("Lecture" + "\n" + "Room No : 2007" + "\n"+"Level-1"+"\n"+"lift-1"+"\n" + "Email: Parel.iftekhar@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Suman Prosad Saha")) {
                    dlgAlert.setTitle("Suman Prosad Saha");
                    dlgAlert.setMessage("Lecture" + "\n" + "Room No : 3006" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email:  suman.p.saha@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Mohammad Fahad Noor")) {
                    dlgAlert.setTitle("Mohammad Fahad Noor");
                    dlgAlert.setMessage("Lecture" + "\n" + "Room No : " + "\n"+"Level-"+"\n"+"lift-"+"\n" + "Email: sfahad.noor@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("G.M. Wali Ullah")) {
                    dlgAlert.setTitle("G.M. Wali Ullah");
                    dlgAlert.setMessage("Lecture" + "\n" + "Room No : 4004" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: wali@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Md. Aynul Hoque")) {
                    dlgAlert.setTitle("Md. Aynul Hoque");
                    dlgAlert.setMessage("Lecture" + "\n" + "Room No : 2007" + "\n"+"Level-1"+"\n"+"lift-1"+"\n" + "Email: aynulsae@gmail.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Naheem Mahtab")) {
                    dlgAlert.setTitle("Naheem Mahtab");
                    dlgAlert.setMessage("Lecture" + "\n" + "Room No : 4009" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: naheem@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Zakia Binte Jamal")) {
                    dlgAlert.setTitle("Zakia Binte Jamal");
                    dlgAlert.setMessage("Lecture" + "\n" + "Room No : 2007" + "\n"+"Level-1"+"\n"+"lift-1"+"\n" + "Email:zakiajamal@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Shafiqul Alam")) {
                    dlgAlert.setTitle("Shafiqul Alam");
                    dlgAlert.setMessage("Lecture" + "\n" + "Room No : 2007" + "\n"+"Level-1"+"\n"+"lift-1"+"\n" + "Email: kshafiq2004@yahoo.com");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Ms. Sariat Rafa Khan")) {
                    dlgAlert.setTitle("Ms. Sariat Rafa Khan");
                    dlgAlert.setMessage("Lecture" + "\n" + "Room No : 4004" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: sariat@iub.edu.bd");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                }
                else if (spinner.getSelectedItem().equals("Dr. Ikramul Hasan")) {
                    dlgAlert.setTitle("Dr. Ikramul Hasan");
                    dlgAlert.setMessage("Senior Lecturer" + "\n" + "Room No : 4004" + "\n"+"Level-2"+"\n"+"lift-2"+"\n" + "Email: ");
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



