package com.example.testujemygita;
import android.view.View;
import android.widget.TextView;
import java.util.Calendar;
import java.util.TimeZone;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public void ustaw_date(View v){
        int rok, miesiac, dzien, godzina, minuta, sekunda;
        Calendar calendar=Calendar.getInstance();
        rok=calendar.get(Calendar.YEAR);
        miesiac=calendar.get(Calendar.MONTH);
        dzien=calendar.get(Calendar.DAY_OF_MONTH);
        godzina=calendar.get(Calendar.HOUR_OF_DAY);
        minuta=calendar.get(Calendar.MINUTE);
        sekunda=calendar.get(Calendar.SECOND);

        TextView panel=(TextView) findViewById(R.id.tekst_1);
        panel.setText(rok+"-"+miesiac+"-"+dzien+"-"+godzina+"-"+minuta+"-"+sekunda);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}