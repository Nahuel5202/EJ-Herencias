/*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
 */
package Entiadad;


public final class Gato extends Animal {
    
    private String desparacitado;

    public Gato() {
    }

    public Gato(String desparacitado, String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.desparacitado = desparacitado;
    }

    public String getDesparacitado() {
        return desparacitado;
    }

    public void setDesparacitado(String desparacitado) {
        this.desparacitado = desparacitado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void alimentacion() {
         System.out.println("el gato "+ nombre +" come  : " + alimento);
    }
    
    
    
    
}
