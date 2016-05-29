package farmacia;


public class Citas {
  String horario, doctor;
  String c= "";
  
  public String Datoscitas (){
      c= "Doctor: " +doctor+ "\nHorario: " +horario;
      return c;
  }
  
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public Citas(String doctor,String horario) {
        this.doctor = doctor;
        this.horario = horario;
    }

    public Citas() {
    }
  
  
  
}

