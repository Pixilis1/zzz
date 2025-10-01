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
public class EstudianteTrabajador extends Empleado implements IEstudiante {
   Estudiante estudiante;
   
   public EstudianteTrabajador(String nombre, int matricula, double nota, float salario){
       super(nombre, salario);
       this.estudiante = new Estudiante(nombre, matricula, nota);
   }
   
   public String toString(){
       return super.toString() + " " + this.estudiante.toString();
   }
}
