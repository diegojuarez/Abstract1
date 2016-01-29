package mx1.edu.utng.abstract1;

/**
 * Created by Diego on 27/1/2016.
 */
public class Triangulo extends Figura {
    private float base;
    private float altura;
    private float res=0;
    @Override
    public float calcularArea() {

        res=(base* altura)/2;
        return res;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;

    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getRes() {
        return res;
    }

    public void setRes(float res) {
        this.res = res;
    }
}
