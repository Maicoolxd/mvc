package org.maicol.mvc.mvc.modelo;

public class Rectangulo {

    private int base;
    private int altura;
    //Creamos el constructo vacio

    public Rectangulo() {

    }
    //Creamos el constructor para inicializar los parametros
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //implementamos lo metodos gett and sett
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getArea() {
        return base*altura;
    }
}
