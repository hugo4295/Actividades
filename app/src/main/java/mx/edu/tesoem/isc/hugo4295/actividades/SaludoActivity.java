package mx.edu.tesoem.isc.hugo4295.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

    String Nombre;
    TextView lblsaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        lblsaludo = findViewById(R.id.lblsaludo);
        Bundle parametros = getIntent().getExtras();
        Nombre = parametros.getString("Nombre");
        lblsaludo.setText(Nombre + "Bienvenido a esta programacion");
    }
}
