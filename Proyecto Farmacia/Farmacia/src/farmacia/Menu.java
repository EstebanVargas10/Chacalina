
package farmacia;

import javax.swing.*;


public class Menu {
    Pacientes paciente []=new Pacientes[5];
    Medicinas medicamentos []= new Medicinas[25];
    Usuarios empleados [] =new Usuarios[3];
    Citas inyecciones []= new Citas[5];
boolean condicion, continuar;

 public Menu() {//menu de medicinas
    medicamentos[0]=new Medicinas("Paxil","Antidepresivo",0,250,25);
    medicamentos[1]= new Medicinas("Acetaminofen", "Analgesico",1, 100,25);  
    medicamentos[2]=new Medicinas("Pioglitazona","Antidiabetico",2,350,25);
    medicamentos[3]=new Medicinas("Cataflam","Analgesico",3,3500,25);
    medicamentos[4]=new Medicinas("Dextametasona","Inyeccion",4,1000,25);
    medicamentos[5]=new Medicinas("Penicilina","Inyeccion",5,5000,25);
    medicamentos[6]=new Medicinas("Ampigrin","Inyeccion",6,3000,25);
    medicamentos[7]=new Medicinas("Voltaren","Inyeccion",7,7000,25);
    medicamentos[8]=new Medicinas("Morfina","Inyeccion",8,9500,25);
    medicamentos[9]=new Medicinas("Tdap","Inyeccion",9,5520,25);
    medicamentos[10]=new Medicinas("Peptobizmol","Jarabe",10,4560,25);
    medicamentos[11]=new Medicinas("Alka Ad","Antidiarreico",11,8525,25);
    medicamentos[12]=new Medicinas("Atenolol","Pastilla Hipertension",12,5478,25);
    medicamentos[13]=new Medicinas("Tabcin","Antigripal",13,8555,25);
    medicamentos[14]=new Medicinas("Buscapina","Analgésico",14,7890,25);
    medicamentos[15]=new Medicinas("Berosolvon","Jarabe",15,9550,25);
    medicamentos[16]=new Medicinas("Alka Gástric","Analgésico",16,2560,25);
    medicamentos[17]=new Medicinas("Abrilar","Jarabe",17,5500,25);
    medicamentos[18]=new Medicinas("Sertal Compuesto Forte","Analgesico",18,9860,25);
    medicamentos[19]=new Medicinas("Citalopram","Antidepresivo",19,5560,25);
    medicamentos[20]=new Medicinas("Diuréticos","Píldora",20,790,25);
    medicamentos[21]=new Medicinas("Metildigoxina","Cardiotónicos",21,4580,25);
    medicamentos[22]=new Medicinas("Voriconazol","Antifúngico",22,10200,25);
    medicamentos[23]=new Medicinas("Bifonazol","Spray",23,7850,25);
    medicamentos[24]=new Medicinas("Emulsión Scott","Jarabe",24,2460,25);

    //opcion de horario de inyecciones
    
     inyecciones[0]=new Citas("Dr. Esquivel","Lunes 9 a.m.");   
     inyecciones[1]=new Citas("Dr. Pereira","Martes 9 a.m."); 
     inyecciones[2]=new Citas("Dr. Esquivel","Miércioles 9 a.m.");
     inyecciones[3]=new Citas("Dr. Pereira","Jueves 9 a.m.");
     inyecciones[4]=new Citas("Dr. Esquivel","Viernes 9 a.m.");
     
     empleados [0]= new Usuarios("a", "a");
//     System.out.println("datos");
     paciente [0] = new Pacientes ("Juan Ramos", "1 2345 6789", 23, "Alérgico a la penicilina");
     paciente [1] = new Pacientes ("Ana González", "1 1609 8542", 40, "No es alérgica");
     paciente [2] = new Pacientes ("Segismundo Villanueva", "1 1560 7001", 18, "Alérgico al polvo");
    }//fin de constructor menu

   
    //primer menu que aparece 
    public void menup(){
        
    String menuinicial="1.  Registro de Usuarios"
            + "\n2. Iniciar Sesión "
            + "\n3. Salir";
       do{
    int opcion=demeNumero(menuinicial);
         
    switch(opcion){
    case 1://registro de usuario
         continuar=true;
    int i=1;
        
        do{
     
       empleados[i]=new Usuarios(JOptionPane.showInputDialog("Digite el nombre del nuevo usuario"),JOptionPane.showInputDialog("Digite la contraseña"));
       String cond=JOptionPane.showInputDialog(null, "¿Desea registrar otro usuario?(s/n)");
       if("s".equals(cond)){
           condicion=true;
       }
       else{
           condicion=false;
           menu2();
       }//fin del else
        i++;
         }while((condicion)&&(i<empleados.length)); 
        break;
        
    case 2://iniciar sesion y pasar al menu 2
          continuar=true;
         do{
         String nom=JOptionPane.showInputDialog("Digite su nombre de usuario");
         String contr=JOptionPane.showInputDialog("Digite su contraseña");
         for (int j=0; j<empleados.length;j++){
        if((nom.equals(empleados[j].getUnombre())) && (contr.equals(empleados[j].getUcontrasena()))){ 
            condicion=true;
           menu2();
        } //fin de if
        else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas");
            menup();
           condicion=false;
        }//fin de else
         }//fin del for
    }while(!condicion);
        break;
        
    case 3://salir
    System.exit(0);
        break;
        
}//fin de switch
       }while(continuar);
    }//fin de metodo
    
  
    //menu de los otras opciones, estando en el sistema
     public void menu2(){
         String menu2= "1. Búsqueda de medicamentos"
            + "\n2.Registro de Pacientes"
            + "\n3.Información de citas"
            + "\n4.Caja"
            + "\n5.Cerrar Sesión";
       do{  
          int opcion2=demeNumero(menu2);
   
         switch(opcion2){
                case 1://busqueda de medicamentos
                    continuar=true;
                    do{
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del medicamento que desea buscar"));
                    JOptionPane.showMessageDialog(null, medicamentos[num].Datos());
                    String cond=JOptionPane.showInputDialog(null, "¿Desea realizar otra búsqueda?(s/n)");
                    condicion = "s".equals(cond); //fin del else
       }while(condicion);
                    break;
                case 2://registro de pacientes
                     continuar=true;
                    //for(int i=3; i<paciente.length;i++){
                    int k=3;
                    do{    
                        paciente[k]= new Pacientes(JOptionPane.showInputDialog("Digite el nombre del paciente")
                                ,JOptionPane.showInputDialog("Digite la cédula")
                                ,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"))
                                ,JOptionPane.showInputDialog("Escriba las observaciones"));
                        JOptionPane.showMessageDialog(null, paciente[k].DatosPac());
                        String condi=JOptionPane.showInputDialog(null, "¿Desea registrar otro paciente?(s/n)");
                        condicion = "s".equals(condi);
                  k++;             
                    }while((condicion)&&(k<paciente.length));
                    break;
                    
                case 3://informacion de citas
                     continuar=true;
                     int h=0;
                      String cita= "Horario de citas para inyectables:"
                            + "\n1.Lunes 9 a.m con el Dr. Esquivel"
                            + "\n2.Martes 9 a.m con el Dr. Pereira"
                            + "\n3.Miércoles 9 a.m con el Dr. Esquivel"
                            + "\n4.Jueves 9 a.m con el Dr. Pereira"
                            + "\n5.Viernes 9 a.m con el Dr. Esquivel";
                    do{
                    String ced=JOptionPane.showInputDialog("Ingrese la cedula del paciente que solicita información");
                    
                    if(ced.equals(paciente[h].getPcedula())){
                          int hor=demeNumero(cita);
                         //System.out.println(ced + paciente[i].getPcedula());   
//                        System.out.println(ced);
                        switch (hor){
                            case 1: 
                               JOptionPane.showMessageDialog(null, "La información del paciente es: \n"+paciente[h].DatosPac()+ "\n\nEl horario elegido es:\n" +inyecciones [0].Datoscitas()); 
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "La información del paciente es: \n"+paciente[h].DatosPac()+ "\n\nEl horario elegido es:\n" +inyecciones [1].Datoscitas());
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "La información del paciente es: \n"+paciente[h].DatosPac()+ "\n\nEl horario elegido es:\n" +inyecciones [2].Datoscitas());
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "La información del paciente es: \n"+paciente[h].DatosPac()+ "\n\nEl horario elegido es:\n" +inyecciones [3].Datoscitas());
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "La información del paciente es: \n"+paciente[h].DatosPac()+ "\n\nEl horario elegido es:\n" +inyecciones [4].Datoscitas());
                                condicion=false;
                                break;
                        
                        }//fin del switch
                        }//fin del if nom 
                    else {
                        JOptionPane.showMessageDialog(null, "Paciente no encontrado");
                    }//fin del else
                    
                    h++;
                     }while(condicion);
                   
                  
                      break;    
                    
                case 4://caja
                     continuar=true;
                   
                     int w=0;
                    do{
                    int cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto"));
                    int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea comprar"));
                       if(cant<medicamentos[w].getMcantdisp()){                  
                        int Total=medicamentos[w].getMprecio()*cant;
                         medicamentos[w].setMcantdisp(medicamentos[w].getMcantdisp()-cant);
                         
                         JOptionPane.showMessageDialog(null, "Producto: "+ medicamentos[cod].Mnombre+ "\nPrecio: "+medicamentos[cod].Mprecio+
                                 "\nUnidades a comprar: "+cant+"\nTotal a pagar: "+Total);
                         String condic=JOptionPane.showInputDialog(null, "¿Desea realizar otra compra?(s/n)");
                         condicion = "s".equals(condic);
                         
                    }//fin del if
                       else{
                           JOptionPane.showMessageDialog(null, "Error. Cantidad insuficiente de producto para la venta");
                       }
                       w++;
                    }while((w<medicamentos.length)&&(condicion));
                    break;
                    
                case 5://Cerrar Sesion
                    System.exit(0);
                    break;
             
                 
             }//fin del switch
       }while(continuar);
    }//fin de metodo menu 2
       //linea que ahce funcionar las opciones de menu
    public int demeNumero(String mensaje){
            
            String s=JOptionPane.showInputDialog(null, mensaje);
            int n = Integer.parseInt(s);                    
            return n;
        }//fin de demeNumero
          }//fin de clase


