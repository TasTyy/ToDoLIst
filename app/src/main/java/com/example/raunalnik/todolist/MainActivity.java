package com.example.raunalnik.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText dodaj_opravilo;
    private Button dodaj_button;
    private ListView display_opravila;

    private ArrayList<String> opravila;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dodaj_opravilo = findViewById(R.id.dodaj_text);
        dodaj_button = findViewById(R.id.dodaj_btn);
        display_opravila = findViewById(R.id.display_opravila);

        dodaj_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.dodaj_btn:
                String itemEntered = dodaj_opravilo.getText().toString();
                adapter.add(itemEntered);
                dodaj_opravilo.setText("");

                Toast.makeText(this, "Opravilo dodano", Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
