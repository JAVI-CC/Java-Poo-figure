/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura2;

/**
 *
 * @author User
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(Punto origen, double base, double altura) {
        super(origen);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + super.toString() + ", base=" + this.base + ", altura=" + this.altura + '}';
    }
    
    @Override
    public double area() {
        return this.base * this.altura / 2;
    }

    @Override
    public double perimetro() {
        return Math.sqrt( Math.pow(this.altura, 2) + Math.pow(this.base / 2, 2) ) * 2 + this.base;
    }

    @Override
    public void escalar(double n) {
        this.base *= n;
        this.altura *= n;
    }
    
}