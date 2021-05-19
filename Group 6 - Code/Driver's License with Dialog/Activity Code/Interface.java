package com.example.license;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Interface extends AppCompatActivity {

    private EditText name1, name2, name3, add1, nat1, sex1, heit, weit, bday;
    private Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);

        name1 = findViewById(R.id.f1);
        name2 = findViewById(R.id.f2);
        name3 = findViewById(R.id.f3);
        add1 = findViewById(R.id.f4);
        nat1 = findViewById(R.id.f5);
        sex1 = findViewById(R.id.f7);
        bday = findViewById(R.id.f6);
        heit = findViewById(R.id.f8);
        weit = findViewById(R.id.f9);
        btnsubmit = findViewById(R.id.submit);

           btnsubmit.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   String firstname = name1.getText().toString();
                   String middlename = name2.getText().toString();
                   String lastname = name3.getText().toString();
                   String address = add1.getText().toString();
                   String nationality = nat1.getText().toString();
                   String sexual = sex1.getText().toString();
                   String birth = bday.getText().toString();
                   String htg = heit.getText().toString();
                   String wtg = weit.getText().toString();

                   Intent intent = new Intent(Interface.this, view.class);
                   intent.putExtra("keyfname", firstname);
                   intent.putExtra("keymname", middlename);
                   intent.putExtra("keylname", lastname);
                   intent.putExtra("keyadd", address);
                   intent.putExtra("keynat", nationality);
                   intent.putExtra("keysex", sexual);
                   intent.putExtra("keybirth", birth);
                   intent.putExtra("keyht", htg);
                   intent.putExtra("keywt", wtg);

                   if(firstname.isEmpty()){
                       alert("Please Insert Data!!!");
                   }
                   else if(middlename.isEmpty()){
                       alert("Please Insert Data!!!");
                   }
                   else if(lastname.isEmpty()){
                       alert("Please Insert Data!!!");
                   }
                   else if(address.isEmpty()){
                       alert("Please Insert Data!!!");
                   }
                   else if(nationality.isEmpty()){
                       alert("Please Insert Data!!!");
                   }
                   else if(sexual.isEmpty()){
                       alert("Please Insert Data!!!");
                   }
                   else if(birth.isEmpty()){
                       alert("Please Insert Data!!!");
                   }
                   else if(htg.isEmpty()){
                       alert("Please Insert Data!!!");
                   }
                   else if(wtg.isEmpty()){
                       alert("Please Insert Data!!!");
                   }
                   else
                   startActivity(intent);
               }
           });
    }
    private void  alert(String message){
        AlertDialog dlg = new AlertDialog.Builder(Interface.this)
                .setTitle("Message")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        dlg.show();
    }
}
