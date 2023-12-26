
package com.mycompany.persona;

public class Estudiante extends Persona {
    
    public int codigo;
    public float notafinal;
    
    public void Estudiate (String n, String a, int e, int c, float t){
        Persona(n,a,e);
        this.codigo=c;
        this.notafinal=t;
    }
    public int getcodigo (){
        return codigo;
    }
    public float getnotafinal(){
        return notafinal;
    }
    public void  mostrardatos (){
        System.out.println("Su nombre es: "+getnombre());
        System.out.println("Su apellido es: "+getapellido());
        System.out.println("Su edad es: "+getedad());
        System.out.println("Su codigo es: "+getcodigo());
        System.out.println("Su nota final es: "+getnotafinal());
    }
    
}
