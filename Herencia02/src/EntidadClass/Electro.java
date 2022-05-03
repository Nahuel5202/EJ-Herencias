/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso
 */
package EntidadClass;

import java.util.Scanner;

/**
 *
 * @author monti
 */
public class Electro {

    protected int precio;
    protected String color;
    protected Character consumo;
    protected Double peso;

    public Electro() {
    }

    public Electro(int precio, String color, char consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.*/
    public String comprobarConsumoEnergetico(String letra) {

        if (letra.equals("a") || (letra.equals("A"))) {
            letra = "A";

        } else if (letra.equals("b") || (letra.equals("B"))) {
            letra = "B";
        } else if (letra.equals("c") || (letra.equals("C"))) {
            letra = "C";
        } else if (letra.equals("d") || (letra.equals("D"))) {
            letra = "D";
        } else if (letra.equals("e") || (letra.equals("E"))) {
            letra = "E";
        } else if (letra.equals("f") || (letra.equals("F"))) {
            letra = "F";

        } else {
            letra = "F";
            System.out.println(" F");
        }

        return letra;
    }

    /*  Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.*/
    public String compararColor(String color) {

        if (!color.equalsIgnoreCase("rojo") || !color.equalsIgnoreCase("azul")
                || !color.equalsIgnoreCase("gris")) {
            color = "blanco";
        }

        return color;
    }

    /* Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.*/
    public Electro crearElectro(Electro ele) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese el precio: ");
        int preci;
        do {
            System.out.println("(acuerdese que el monto tiene que superar los 1000)");
            preci = leer.nextInt();

        } while (preci < 1000);
        ele.setPrecio(preci);
        System.out.println("ingrese el el tipo de energia: ");
        ele.setConsumo(ele.comprobarConsumoEnergetico(leer.next()).charAt(0));
        System.out.println("ingrese el color: ");
        ele.setColor(ele.compararColor(leer.next()));
        System.out.println("ingrese el peso: ");
        ele.setPeso(leer.nextDouble());

        return ele;
    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:*/
    public void precioFinal(Electro ele) {
        if (ele.getConsumo() == "F".charAt(0)) {
            ele.setPrecio(ele.getPrecio() + 100);
        } else if (ele.getConsumo() == "E".charAt(0)) {
            ele.setPrecio(ele.getPrecio() + 300);
        } else if (ele.getConsumo() == "D".charAt(0)) {
            ele.setPrecio(ele.getPrecio() + 500);
        } else if (ele.getConsumo() == "C".charAt(0)) {
            ele.setPrecio(ele.getPrecio() + 600);
        } else if (ele.getConsumo() == "B".charAt(0)) {
            ele.setPrecio(ele.getPrecio() + 800);
        } else if (ele.getConsumo() == "A".charAt(0)) {
            ele.setPrecio(ele.getPrecio() + 1000);
        }
        
        
        if (ele.getPeso()>=1 && ele.getPeso()<=19) {
            ele.setPrecio(ele.getPrecio()+100);
        }else if (ele.getPeso()>=20 && ele.getPeso()<=49) {
             ele.setPrecio(ele.getPrecio()+500);
        }else if (ele.getPeso()>=50 && ele.getPeso()<=79) {
             ele.setPrecio(ele.getPrecio()+800);
        }else if (ele.getPeso()>=80) {
             ele.setPrecio(ele.getPrecio()+1000);
        }

    }

  
    public String Mostras() {
        return   ", precio: " + precio + ", color: " + color + ", consumo: " + consumo + ", peso: " + peso + '}';
    }

}
