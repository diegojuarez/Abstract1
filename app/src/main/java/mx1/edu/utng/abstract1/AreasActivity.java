package mx1.edu.utng.abstract1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created Diego on 27/1/2016.
 */
public class AreasActivity  extends Activity {
    private  Cuadrado cuadrado;
    private Triangulo tringulo;
    private EditText edtLado;
    private EditText edtbase;
    private EditText edtaltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_loyout);
        cuadrado = new Cuadrado();
        edtLado= (EditText)findViewById(R.id.edtlado);
        tringulo= new Triangulo();
        edtbase= (EditText)findViewById(R.id.edtbase);
        edtaltura= (EditText)findViewById(R.id.edtaltura);
    }

    public void calcular (View view){
        float lado=Float.parseFloat(edtLado.getText().toString());

        cuadrado.setLado(lado);
        Toast.makeText(this, "Area de cuadrado: " + cuadrado.calcularArea(), Toast.LENGTH_SHORT).show();

    }

    public void CalcularTriangulo (View view){
        float base= Float.parseFloat(edtbase.getText().toString());
        float altura= Float.parseFloat(edtaltura.getText().toString());
        tringulo.setBase(base);
        tringulo.setAltura(altura);
        Toast.makeText(this, "Area del Triangulo: "+tringulo.calcularArea(),Toast.LENGTH_SHORT).show();
    }
}
