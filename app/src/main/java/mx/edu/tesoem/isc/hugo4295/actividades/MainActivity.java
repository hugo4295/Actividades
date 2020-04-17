package mx.edu.tesoem.isc.hugo4295.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = findViewById(R.id.txtNombre);
    }

    public void llamaSuma(View v){
        Intent MSuma = new Intent(this, SumaActivity.class);
        startActivity(MSuma);
    }

    public void llamaResta(View v){
        Intent intent = new Intent(this, RestaActivity.class);
        startActivity(intent);
        finish();
    }

    public void llamaMultiplica(View v){
        Intent intent = new Intent(this, MultiplicaActivity.class);
        startActivity(intent);
    }

    public void llamaDivide(View v){
        Intent intent = new Intent(this, DivideActivity.class);
        startActivity(intent);
    }

    public void llamaSaludo(View v){
        Intent intent = new Intent(this, SaludoActivity.class);
        intent.putExtra("Nombre", txtnombre.getText().toString());
        startActivity(intent);
    }


}
