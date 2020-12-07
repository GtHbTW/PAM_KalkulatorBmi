package com.example.kalkulatorbmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends MainActivity {

    // deklaracja zmiennych
    String wypiszWynik, opis;
    TextView wynik;
    EditText waga, wzrost;
    Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        wynik = (TextView) findViewById(R.id.wynik);   ////  podpinamy się pod miejsca/przyciski z pliku  xml
        waga = (EditText) findViewById(R.id.editText);
        wzrost = (EditText) findViewById(R.id.editText2);
        btnReset = (Button)findViewById(R.id.btnReset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                waga.setText("");
                wzrost.setText("");
                wynik.setText("");

            }
        });
    }


    //tworzymy klase obliczająca BMI
    public void calculateBMI(View view) {
        String S1 = waga.getText().toString();
        String S2 = wzrost.getText().toString();
        // sprawdźmy czy nie są "puste" w przeciwnym razie nic sie nie wykona
        if (S1 != null && !"".equals(S1) && S2 != null && !"".equals(S2)) {

            float weightValue = Float.parseFloat(S1);
            float heightValue = Float.parseFloat(S2) / 100;


            float bmi = weightValue / (heightValue * heightValue);


            if (bmi < 16) {
                opis = "Ciężka niedowaga";
            } else if (bmi < 18.5) {
                opis = "Niedowaga";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                opis = "Waga w normie";
            } else if (bmi >= 25 && bmi <= 29.9) {
                opis = "Nadwaga";
            } else {
                opis = "Otyłość";
            }


            wypiszWynik = +bmi + "\n " + opis;


            wynik.setText(wypiszWynik);
        }

    }

}


////////////////////


//
//
//

//
//
//        // niżej : jeśli wybrano mezczyzne - usuwa kobiete i na odwrót
//
//    }
//    private void calculateBMI() {  // wpisane dane liczbowe zmienimy teraz na Stringi
//        String wzrostString = wzrost.getText().toString();
//        String wagaString = wzrost.getText().toString();

//            float wzrostValue = Float.parseFloat(wzrostString) / 100;
//            float wagaValue = Float.parseFloat(wagaString);
//
//            float bmi = wagaValue / (wzrostValue * wzrostValue);
//
//
//            wynik.setText("BMI = " +bmi);
//
//
//            displayBMI(bmi);
//        }
//    }
//    private float displayBMI(float waga, float wzrost){
//            return waga/ (wzrost * wzrost);
//        }
//
