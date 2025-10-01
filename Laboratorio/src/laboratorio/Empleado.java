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
public class Empleado extends Persona{
    public float salario;
    
    public Empleado(String nombre, float salario){
        super(nombre);
        this.salario = salario;
    }
    public String toString(){
        return this.nombre + " Salario:" + this.salario;
    }
}
