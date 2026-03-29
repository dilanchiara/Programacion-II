package com.mycompany.proyalgebravectorial;
public class AlgebraVectorial {
    //atrivutos
    private double x;
    private double y;
    //metodos
    public AlgebraVectorial() {
        this.x = 0;
        this.y = 0;
    }
    public AlgebraVectorial(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public AlgebraVectorial suma(AlgebraVectorial v) {
        return new AlgebraVectorial(this.x + v.x, this.y + v.y);
    }
    public AlgebraVectorial resta(AlgebraVectorial v) {
        return new AlgebraVectorial(this.x - v.x, this.y - v.y);
    }
    public double productoPunto(AlgebraVectorial v) {
        return this.x * v.x + this.y * v.y;
    }
    public double norma() {
        return Math.sqrt(x * x + y * y);
    }
    public boolean perpendicular(AlgebraVectorial v) {
        return this.productoPunto(v) == 0;
    }
    public boolean paralelo(AlgebraVectorial v) {
        return (this.x * v.y - this.y * v.x) == 0;
    }
    public AlgebraVectorial proyeccion(AlgebraVectorial b) {
        double escalar = this.productoPunto(b) / (b.norma() * b.norma());
        return new AlgebraVectorial(escalar * b.x, escalar * b.y);
    }
    public double componente(AlgebraVectorial b) {
        return this.productoPunto(b) / b.norma();
    }
}
