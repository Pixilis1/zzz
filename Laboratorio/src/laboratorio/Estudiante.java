/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author estudiante
 */
public class Estudiante extends Persona{
    public int matricula;
    public double nota;
    
    public Estudiante(String nombre, int matricula, double nota){
        super(nombre);
        this.matricula = matricula;
        this.nota = nota;
    }
    public String toString(){
        return " Matricula:" + this.matricula + " Nota:" + this.nota;
        
    }
}
