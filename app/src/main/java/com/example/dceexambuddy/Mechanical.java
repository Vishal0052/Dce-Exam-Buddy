package com.example.dceexambuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.github.barteksc.pdfviewer.PDFView;

public class Mechanical extends AppCompatActivity {

    Spinner spinner;
    LinearLayout linearLayout;
    PDFView pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical);
        spinner=findViewById(R.id.spinner);
        linearLayout=findViewById(R.id.linearLayout);
        pdf=findViewById(R.id.pdf);

        String[] sem={"Select Year Wise","1st Year","2nd Year","3rd Year","4TH Year"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.spinnerlist_design,sem);
        adapter.setDropDownViewResource(R.layout.spinnerlist_design);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                int get_position= spinner.getSelectedItemPosition();
                if(get_position==1){

                    pdf.fromAsset("mech_1st_Year.pdf").load();
                    pdf.setFitsSystemWindows(true);
                }

                if(get_position==2){

                    pdf.fromAsset("mech_2nd_year.pdf").load();
                    pdf.setFitsSystemWindows(true);
                }

                if(get_position==3){

                    pdf.fromAsset("mech_3rd_year.pdf").load();
                    pdf.setFitsSystemWindows(true);
                }

                if(get_position==4){

                    pdf.fromAsset("mech_4th_year.pdf").load();
                    pdf.setFitsSystemWindows(true);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
    }
}