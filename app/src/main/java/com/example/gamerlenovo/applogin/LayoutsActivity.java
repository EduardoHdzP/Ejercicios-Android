package com.example.gamerlenovo.applogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class LayoutsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);
        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            switch (bundle.getInt("layout")){
                case 1:
                    setContentView(R.layout.linear_layout);
                    break;
                case 2:
                    setContentView(R.layout.table_layout);
                    break;
                case 3:
                    setContentView(R.layout.relative_layout);
                    break;
                case 4:
                    setContentView(R.layout.absolute_layout);
                    break;
                case 5:
                    setContentView(R.layout.constraint_layout);
                    break;
                case 6:
                    setContentView(R.layout.frame_layout);
                    break;
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.accion_salir){
            Intent intent=new Intent(getApplicationContext(),VaciaActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
