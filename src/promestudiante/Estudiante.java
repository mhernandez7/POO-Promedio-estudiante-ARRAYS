/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promestudiante;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Estudiante {
    
   private double promedio;
   private int codigo;
   private String nombre;

    public double getPromedio() {
        return promedio;
    }

    public String getNombre() {
        return nombre;
    }

   
   
    public Estudiante( String nombre, int codigo ,double promedio) {
        this.promedio = promedio;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void resultado(ArrayList<Estudiante>lista){
   
    double  promedioTT =0;
        for (int i=0; i<lista.size();i++){
        
            System.out.println("Los datos del estudiante son:  "+lista.get(i));
            promedioTT +=  + lista.get(i).getPromedio();
        
        }
        promedioTT = promedioTT /lista.size();
        System.out.println("El promedio total de los estudiantes es: "+promedioTT);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("promedio=").append(promedio);
        sb.append(", codigo=").append(codigo);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }

  
   
   
    
    
}
