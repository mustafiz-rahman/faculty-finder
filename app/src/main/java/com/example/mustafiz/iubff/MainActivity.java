package com.example.mustafiz.iubff;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[]faculty;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        spinner = (Spinner) findViewById(R.id.sp);
        faculty = getResources().getStringArray(R.array.select_department);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, faculty);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinner.getSelectedItem().equals("Department of BBA")) {

                    Intent intent1 = new Intent(getApplicationContext(),BBA.class);
                    startActivity(intent1 );
                }
                if (spinner.getSelectedItem().equals("Department of Economics")) {

                    Intent intent2 = new Intent(getApplicationContext(),Economics.class);
                    startActivity(intent2 );
                }
                if (spinner.getSelectedItem().equals("Computer Science and Engineering")) {

                    Intent intent3 = new Intent(getApplicationContext(),Main3Activity.class);
                    startActivity(intent3 );
                }
                if (spinner.getSelectedItem().equals("Department of EEE and ETE")) {

                    Intent intent4 = new Intent(getApplicationContext(),EEE.class);
                    startActivity(intent4 );
                }
                if (spinner.getSelectedItem().equals("Physical Science and Mathematics")) {

                    Intent intent5 = new Intent(getApplicationContext(),PS.class);
                    startActivity(intent5 );
                }
                if (spinner.getSelectedItem().equals("Media and Communication")) {

                    Intent intent6 = new Intent(getApplicationContext(),MC.class);
                    startActivity(intent6 );
                }
                if (spinner.getSelectedItem().equals("English and Modern Language")) {

                    Intent intent7 = new Intent(getApplicationContext(),ENG.class);
                    startActivity(intent7 );
                }
                if (spinner.getSelectedItem().equals("Social Science and Humanities")) {

                    Intent intent8 = new Intent(getApplicationContext(),SH.class);
                    startActivity(intent8 );
                }
                if (spinner.getSelectedItem().equals("Department of Law")) {

                    Intent intent9 = new Intent(getApplicationContext(),LAW.class);
                    startActivity(intent9 );
                }
                if (spinner.getSelectedItem().equals("Environmental Science and Management")) {

                    Intent intent10 = new Intent(getApplicationContext(),ENV.class);
                    startActivity(intent10 );
                }
                if (spinner.getSelectedItem().equals("Department of Public Health")) {

                    Intent intent11 = new Intent(getApplicationContext(),PH.class);
                    startActivity(intent11 );
                }
                if (spinner.getSelectedItem().equals("Department of Life Science")) {

                    Intent intent12 = new Intent(getApplicationContext(),LS.class);
                    startActivity(intent12 );
                }




            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        final AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            //dlgAlert.setTitle("Dr Sarwar Uddin Ahmed");
            dlgAlert.setMessage("Select Department from the list>Select Faculty name"+"\n"+"   Thank You!");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
