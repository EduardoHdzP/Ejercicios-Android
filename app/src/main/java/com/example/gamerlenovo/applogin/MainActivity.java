package com.example.gamerlenovo.applogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsuario;
    private EditText editTextPassword;

    private Button buttonEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUsuario=findViewById(R.id.editTextUsuario);
        editTextPassword=findViewById(R.id.editTextPassword);

        buttonEntrar=findViewById(R.id.buttonEntrar);

        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            Toast toast;
            @Override
            public void onClick(View v) {
                if(!entradasVacias()){
                    if (editTextUsuario.getText().toString().equals("root") && editTextPassword.getText().toString().equals("12345")){
                        Intent intent=new Intent(getApplicationContext(),VaciaActivity.class);
                        startActivity(intent);
                    }else{
                        toast.makeText(getApplicationContext(),"Los datos no son correctos",Toast.LENGTH_LONG).show();
                        editTextPassword.setText("");
                        editTextUsuario.setText("");
                    }
                }else{
                    toast.makeText(getApplicationContext(),"Ingrese los datos necesarios",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public boolean entradasVacias(){
        return editTextUsuario.getText().toString().isEmpty() && editTextPassword.getText().toString().isEmpty();
    }
}
