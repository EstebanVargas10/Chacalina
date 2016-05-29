
package farmacia;


public class Medicinas {

    String Mnombre, Mtipo;
    int Mprecio, Mcantdisp, Mcodigo;
   String a = "";

    public Medicinas(String Mnombre,String Mtipo,int Mcodigo, int Mprecio, int Mcantdisp) {
        this.Mnombre = Mnombre;
        this.Mtipo = Mtipo;
        this.Mprecio = Mprecio;
        this.Mcantdisp = Mcantdisp;
        this.Mcodigo = Mcodigo;
//        System.out.println(Datos());
    }
    
    public String Datos (){
     
       a ="Nombre: " +Mnombre+ "\nTipo: " +Mtipo+ "\nPrecio: " +Mprecio+
               "\nCantidad Disponible: " +Mcantdisp;   
       
       return a;
    }//fin del metodo
    
    

    public String getMnombre() {
        return Mnombre;
    }

    public void setMnombre(String Mnombre) {
        this.Mnombre = Mnombre;
    }

    public int getMcodigo() {
        return Mcodigo;
    }

    public void setMcodigo(int Mcodigo) {
        this.Mcodigo = Mcodigo;
    }

    public String getMtipo() {
        return Mtipo;
    }

    public void setMtipo(String Mtipo) {
        this.Mtipo = Mtipo;
    }

    public int getMprecio() {
        return Mprecio;
    }

    public void setMprecio(int Mprecio) {
        this.Mprecio = Mprecio;
    }

    public int getMcantdisp() {
        return Mcantdisp;
    }

    public void setMcantdisp(int Mcantdisp) {
        this.Mcantdisp = Mcantdisp;
    }

    public Medicinas() {
    }
    
    

}//final de la clase
