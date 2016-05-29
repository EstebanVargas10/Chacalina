package farmacia;

public class Usuarios {
    String  Unombre, Ucontrasena;

  
    public String getUnombre() {
        return Unombre;
    }

    public void setUnombre(String Unombre) {
        this.Unombre = Unombre;
    }

    public String getUcontrasena() {
        return Ucontrasena;
    }

    public void setUcontrasena(String Ucontrasena) {
        this.Ucontrasena = Ucontrasena;
    }

    public Usuarios(String Unombre, String Ucontrasena) {
        this.Unombre = Unombre;
        this.Ucontrasena = Ucontrasena;
//        System.out.println(Unombre +" "+ Ucontrasena);
    }

    public Usuarios() {
    }
    
   

}//fin de la clase
