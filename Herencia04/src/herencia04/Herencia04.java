/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
13
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package herencia04;

import Clase.Circulo;
import Clase.Rectangulo;


public class Herencia04 {

   
    public static void main(String[] args) {
        
        
        Circulo circu = new Circulo(3.5, 8);
        
        
        Rectangulo rec = new Rectangulo(4.3,5.1);
        
        System.out.println("el area y perimetro del circulo es  " + circu.Area() +" y "+  circu.Perimetro());
        
        
        System.out.println("el area y perimetro del rectangulo es " +rec.Area() +" y "+ rec.Perimetro());
        
        
    }
    
}
