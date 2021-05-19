package com.example.license;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class view extends AppCompatActivity {

    private TextView firstn, lastn, midn, addl, nation1, birthdate, sexuality, htgt, wtgt;
    Button proceedbtn;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        proceedbtn = (Button) findViewById(R.id.finish);
        builder = new AlertDialog.Builder(this);
        proceedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Do you want to Edit your application form?");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        Toast.makeText(getApplicationContext(), "Thank You for using our System", Toast.LENGTH_SHORT).show();
                    }
                }); builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(), "Cancelled", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alert = builder.create();
                alert.setTitle("Confirmation");
                alert.show();
            }
        });

        firstn = findViewById(R.id.fname);
        lastn = findViewById(R.id.lname);
        midn = findViewById(R.id.mname);
        addl = findViewById(R.id.add);
        nation1 = findViewById(R.id.nation);
        birthdate = findViewById(R.id.bday);
        sexuality = findViewById(R.id.sex);
        htgt = findViewById(R.id.ht);
        wtgt = findViewById(R.id.wt);

        String firstname1 = getIntent().getStringExtra("keyfname");
        String middlename2 = getIntent().getStringExtra("keymname");
        String lastname3 = getIntent().getStringExtra("keylname");
        String address1 = getIntent().getStringExtra("keyadd");
        String nationality1 = getIntent().getStringExtra("keynat");
        String birth1 = getIntent().getStringExtra("keybirth");
        String sex1 = getIntent().getStringExtra("keysex");
        String hh = getIntent().getStringExtra("keyht");
        String ww = getIntent().getStringExtra("keywt");

        firstn.setText(firstname1);
        lastn.setText(lastname3);
        midn.setText(middlename2);
        addl.setText(address1);
        nation1.setText(nationality1);
        birthdate.setText(birth1);
        sexuality.setText(sex1);
        htgt.setText(hh);
        wtgt.setText(ww);


    }
    public void btnexit(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}