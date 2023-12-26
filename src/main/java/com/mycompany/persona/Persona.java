
package com.mycompany.persona;

public class Persona {
        private String nombre;
        private String apellido;
        private int edad;
    
       public void Persona (String n, String a, int e){
        this.nombre=n;
        this.apellido=a;
        this.edad=e;
}
     
        public String getnombre(){
            return nombre;
        }
        public String getapellido(){
            return apellido;
        }
        public int getedad(){
            return edad;
        }
        
}
