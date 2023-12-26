
package com.mycompany.persona;

public class Principal {
    public static void main(String[] args) {
      
   // Persona Juan = new Persona ();
   // Juan.Persona();
    
       // System.out.println("Su apellido es:"+Juan.getapellido());
    
         
      //Estudiante estudiante = new Estudiante();
       Estudiante estu = new Estudiante();
       
      estu.Estudiate("Pablo","Lara",5,1,9.5f);
      
      estu.mostrardatos();
      
      Profesor profe = new Profesor();
       
      profe.Profesor("Pablo","Lara",5,"Mate","Inge");
      
      profe.mostrardatos();
     
    }
}
