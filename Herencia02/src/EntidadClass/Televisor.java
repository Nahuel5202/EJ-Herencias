/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
 */
package EntidadClass;

public class Televisor extends Electro{
    
    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, int precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    


    
    public Electro crearTelevisor(Electro ele,int pg,Boolean tdt) {
        this.TDT=tdt;
        this.resolucion=pg;
        return super.crearElectro(ele); 
    }

   
    @Override
    public void precioFinal(Electro ele) {
        super.precioFinal(ele);
        if ( this.resolucion > 40) {
         ele.setPrecio((int)(ele.getPrecio()*1.3));   
        }
        if (this.TDT == true) {
         ele.setPrecio(ele.getPrecio()+500);
        }
    }

    @Override
    public String toString() {
        return "Televisor→" + "resolucion :" + resolucion + ", TDT : " + TDT ;
    }

  
    @Override
    public String Mostras() {
        return super.Mostras(); 
    }
    
    
    
    
}
