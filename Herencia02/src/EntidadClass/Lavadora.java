
package EntidadClass;

public class Lavadora extends Electro{

   private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
  /*creaMétodo crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.*/
    public Electro crearLavadora(Electro ele,int carga) {
        this.carga=carga;
        return super.crearElectro(ele); 
    }
   /* Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.*/
    @Override
    public void precioFinal(Electro ele) {
        super.precioFinal(ele); 
        if (carga>30) {
          ele.setPrecio(ele.getPrecio()+500);
        }
    }
    @Override
    public String toString() {
        return "Lavadora→" + "carga: " + carga;
    }
    @Override
    public String Mostras() {
        return super.Mostras(); 
    }

    


    
    
}