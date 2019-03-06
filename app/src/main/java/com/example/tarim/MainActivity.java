package com.example.tarim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    Button listele;
    double pHDegeri;
    int sicaklik;
    int nem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText girilenDeger = findViewById(R.id.editText3);
        final EditText girilenDegerS = findViewById(R.id.editText);
        final EditText girilenDegerNem = findViewById(R.id.editText2);


        listele = findViewById(R.id.button);
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.iller, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);


        listele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    pHDegeri = Double.parseDouble(girilenDeger.getText().toString());
                    sicaklik = Integer.parseInt(girilenDegerS.getText().toString());
                    nem = Integer.parseInt(girilenDegerNem.getText().toString());
                    if (pHDegeri >= 5.0 && pHDegeri <= 7.5 && sicaklik >= 5 && sicaklik <= 45&&nem >= 0 && sicaklik <= 100 ) {
                        Intent intent = new Intent(MainActivity.this, TarimEkranList.class);
                        intent.putExtra("il", spinner.getSelectedItem().toString());
                        intent.putExtra("pH", (double) pHDegeri);
                        startActivity(intent);
                    }else{

                        Toast.makeText(getApplicationContext(), "Lütfen Girdiğiniz Değerleri Kontrol Ediniz!!!", Toast.LENGTH_LONG).show();
                    }


                } catch (Exception e) {
                    e.printStackTrace();

                }


            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
