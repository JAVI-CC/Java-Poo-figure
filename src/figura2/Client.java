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
public class Client {

    public static void main(String[] args) {
        /*
    Punto p1 = new Punto(5.9, 7.5);
    Punto p2 = new Punto(9.2, 2.4);
    Cuadrado c1 = new Cuadrado(5.0);
    Rectangulo r1 = new Rectangulo(8.5, 5.0);
    Triangulo t1 = new Triangulo(6, 6);
    Circulo cir1 = new Circulo(10);
         */

 /* Punto p1 = new Punto(8, 4);
        Punto p2 = new Punto(6, 5);
        
        System.out.println("Clase Punto:");
        System.out.println("Valor de la X: " + p1.getX() + " Valor de la Y: " + p1.getY());
        System.out.println("Distancia: " + p1.distancia(p2));
        p1.desplazar(4, 9);
        System.out.println("Desplazar: ");
        System.out.println("Valor de la X: " + p1.getX() + " Valor de la Y: " + p1.getY());
        System.out.println("String: " + p1.toString());
        
        System.out.println("------------------------------------------------------------");*/
       
         Punto origen;

        origen = Client.testPunto();
        Client.testCirculo(origen);

    }

    public static Punto testPunto() {
        Punto p = new Punto(3, 1);

        System.out.println(p);
        p.desplazar(4, 0);
        System.out.println(p);

        return p;
    }

    public static void testCirculo(Punto origen) {
        System.out.println(origen);
        Circulo c = new Circulo(origen, 3);
        origen.desplazar(3, 2);
        System.out.println(origen);
        Circulo c1 = new Circulo(origen, 4);

        System.out.println(c);
        System.out.println(c1);

        System.out.println(Figura.numFiguras());
        System.out.println(c1.perimetro());
        System.out.println("Distancia: " + c.distancia(c1));

        System.out.println("Area: " + c1.area());
        
        Cuadrado cu1 = new Cuadrado(origen, 5);
        System.out.println(cu1);
    }

}
