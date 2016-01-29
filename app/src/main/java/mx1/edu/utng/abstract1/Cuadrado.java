package mx1.edu.utng.abstract1;

/**
 * Created Diego on 27/1/2016.
 */
public class Cuadrado extends Figura{
    private float lado;

    public float calcularArea() {
        return (lado * lado);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado=lado;
    }
}
