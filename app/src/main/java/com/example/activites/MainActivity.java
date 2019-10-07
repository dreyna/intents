package com.example.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edt1;
    private Button btn1;
    public final static String EXTRA_NOMBRE = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText)findViewById(R.id.txtnombre);
        btn1 =(Button) findViewById(R.id.btnenviar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = edt1.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                intent.putExtra(EXTRA_NOMBRE, nombre);
                startActivity(intent);
            }
        });

    }
}
