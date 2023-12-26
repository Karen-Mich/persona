
package com.mycompany.persona;

public class Profesor extends Persona{
    public String asignatura;
    public String titulo;
    
    public void Profesor (String n, String a, int e, String c, String t){
        Persona(n,a,e);
        this.asignatura=c;
        this.titulo=t;
    }
    public void  mostrardatos (){
        System.out.println("Su nombre es: "+getnombre());
        System.out.println("Su apellido es: "+getapellido());
        System.out.println("Su edad es: "+getedad());
        System.out.println("Su codigo es: "+asignatura);
        System.out.println("Su nota final es: "+titulo);
    }
    }
