package com.mycompany.proyvector3d;
public class Vector3D {
    private double x, y, z;
    // Constructor vacío
    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    // Constructor con parámetros
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // Getters
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }
    public Vector3D suma(Vector3D v) {
        return new Vector3D(x + v.x, y + v.y, z + v.z);
    }
    public Vector3D resta(Vector3D v) {
        return new Vector3D(x - v.x, y - v.y, z - v.z);
    }
    public Vector3D escalar(double r) {
        return new Vector3D(r * x, r * y, r * z);
    }
    public double norma() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public double productoPunto(Vector3D v) {
        return x * v.x + y * v.y + z * v.z;
    }
    public Vector3D productoCruz(Vector3D v) {
        return new Vector3D(
            y * v.z - z * v.y,
            z * v.x - x * v.z,
            x * v.y - y * v.x
        );
    }
    public Vector3D proyeccion(Vector3D b) {
        double escalar = this.productoPunto(b) / Math.pow(b.norma(), 2);
        return b.escalar(escalar);
    }
    public double componente(Vector3D b) {
        return this.productoPunto(b) / b.norma();
    }
}
