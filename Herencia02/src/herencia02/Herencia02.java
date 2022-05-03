/*

 */
package herencia02;

import EntidadClass.Electro;
import EntidadClass.Lavadora;
import EntidadClass.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class Herencia02 {

    public static void main(String[] args) {

        
        Scanner leer = new Scanner(System.in);

        Lavadora lava = new Lavadora();

        System.out.println("ingrese la carga del lavarropa");
        int carga = leer.nextInt();
        lava.crearLavadora(lava, carga);

        lava.precioFinal(lava);

        System.out.print(lava.toString() + lava.Mostras());
        System.out.println("    ");
        System.out.println("-------------------------------------------------------");

        Televisor tv = new Televisor();
        System.out.println("ingrese las pulgadas de la Tv: ");
        int pg = leer.nextInt();
        System.out.println("Tiene sintonizador TDT? si/no");
        String s;
        do {
            s = leer.next();
            System.out.println("__");
        } while (!s.equalsIgnoreCase("si") && !s.equalsIgnoreCase("no"));

        Boolean tdt = null;

        if (s.equalsIgnoreCase("si")) {
            tdt = true;
        } else if (s.equalsIgnoreCase("no")) {
            tdt = false;
        }

        tv.crearTelevisor(tv, pg, tdt);
        tv.precioFinal(tv);

        System.out.print(tv.toString() + tv.Mostras());
        System.out.println(" ----------------------- ");

        //----------------------------------------------------
      /*  Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor*/
      
      
        ArrayList<Electro> ArrayEle = new ArrayList<>();
        
        Lavadora l1 = new Lavadora(7, 1500, "gris", "B".charAt(0), 30.500);
        
        Lavadora l2 = new Lavadora(15, 5300, "azul", "E".charAt(0), 31.00);
        
        Televisor tv1 = new Televisor(55, true, 55000, "rojo", "a".charAt(0),30.00);
        
        Televisor tv2 = new Televisor(60, true, 57000, "teta", "f".charAt(0),32.500);
        
        ArrayEle.add(l1);
        ArrayEle.add(l2);
        ArrayEle.add(tv1);
        ArrayEle.add(tv2);
        
        int pp = 0;
        for (Electro aux : ArrayEle) {
            if (aux instanceof Lavadora) {
               lava.precioFinal(aux);
                System.out.println("precio de electro lavadora " +aux.getPrecio());
             pp+=  aux.getPrecio();
            }else {
                tv.precioFinal(aux);
                System.out.println("precio de tv " + aux.getPrecio());
             pp+= aux.getPrecio();
        }
        }
        System.out.println("el precio total es de "+ pp);
    }
}
