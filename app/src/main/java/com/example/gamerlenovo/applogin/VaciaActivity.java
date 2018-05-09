package com.example.gamerlenovo.applogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class VaciaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacia);

        final Spinner spinner=findViewById(R.id.spinnerLayouts);
        Button buttonVisualizar=findViewById(R.id.btnVisualizar);
        buttonVisualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                int layout=(int)spinner.getSelectedItemId();
                switch (layout){
                    case 0:
                        Toast.makeText(getApplicationContext(),"Seleccione alguna opcion",Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        intent=new Intent(getApplicationContext(),LayoutsActivity.class);
                        intent.putExtra("layout",layout);
                        startActivity(intent);
                        break;
                    case 2:
                        intent=new Intent(getApplicationContext(),LayoutsActivity.class);
                        intent.putExtra("layout",layout);
                        startActivity(intent);
                        break;
                    case 3:
                        intent=new Intent(getApplicationContext(),LayoutsActivity.class);
                        intent.putExtra("layout",layout);
                        startActivity(intent);
                        break;
                    case 4:
                        intent=new Intent(getApplicationContext(),LayoutsActivity.class);
                        intent.putExtra("layout",layout);
                        startActivity(intent);
                        break;
                    case 5:
                        intent=new Intent(getApplicationContext(),LayoutsActivity.class);
                        intent.putExtra("layout",layout);
                        startActivity(intent);
                        break;
                    case 6:
                        intent=new Intent(getApplicationContext(),LayoutsActivity.class);
                        intent.putExtra("layout",layout);
                        startActivity(intent);
                        break;

                }
            }
        });

    }
}
