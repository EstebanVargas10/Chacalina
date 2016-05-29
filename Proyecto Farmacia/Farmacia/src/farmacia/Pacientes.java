
package farmacia;


public class Pacientes {
String Pobserv, Pnombre;
int Pedad;
String b="", Pcedula;

public String DatosPac () {
    
    b= "Nombre: " +Pnombre+ "\nCedula: " +Pcedula+
            "\nEdad: " +Pedad+ "\nObservaciones: " +Pobserv;
    return b;
}


    public String getPobserv() {
        return Pobserv;
    }

    public void setPobserv(String Pobserv) {
        this.Pobserv = Pobserv;
    }

    public String getPnombre() {
        return Pnombre;
    }

    public void setPnombre(String Pnombre) {
        this.Pnombre = Pnombre;
    }


    public String getPcedula() {
        return Pcedula;
    }

    public void setPcedula(String Pcedula) {
        this.Pcedula = Pcedula;
    }

    public int getPedad() {
        return Pedad;
    }

    public void setPedad(int Pedad) {
        this.Pedad = Pedad;
    }

    public Pacientes(String Pnombre,String Pcedula, int Pedad, String Pobserv) {
        this.Pnombre = Pnombre;
        this.Pcedula = Pcedula;
        this.Pedad = Pedad;
        this.Pobserv = Pobserv;
    }

    public Pacientes() {
    }



        }//fin de clase


