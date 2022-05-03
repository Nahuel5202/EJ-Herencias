/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
*/
package herencia01;


import Entiadad.Caballo;
import Entiadad.Gato;
import Entiadad.Perro;



public class Herencia01 {

   
    public static void main(String[] args) {
       
       
        Perro perre = new Perro("si","sora","dogui",5,"mestizo");
        
//        
//        perre.setAdopcion("si");
//        perre.setAlimento("dogui");
//        perre.setEdad(4);
//        perre.setNombre("sora");
//        perre.setRaza("mestizo");
        
        
        perre.alimentacion();
        
        
       Gato gato = new Gato("si","Michigan","Wiskas",3,"siames") ;
        
        gato.alimentacion();
        
        
        Caballo caba = new Caballo("no","Canela","pasto",5,"qcyo");
        
        caba.alimentacion();
        
    }
    
    
    
}
