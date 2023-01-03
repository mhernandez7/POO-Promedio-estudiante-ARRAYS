/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promestudiante;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class PromEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        short validacion=0;
        double promedio =0;
        int codigo =0;
        String nombre="";
        Estudiante alumno;
        ArrayList<Estudiante> lista= new ArrayList<>();
        
        do{
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre = read.next();
            System.out.println("Ingrese el Codigo del estudiante: ");
            codigo = read.nextInt();
            System.out.println("Ingrese el Promedio del estudiante: ");
            promedio = read.nextDouble();
            alumno = new Estudiante(nombre,codigo,promedio);
            lista.add(alumno);
            System.out.println("Desea ingresar otro estudiante para si presione 1 en caso contrario 2");
            validacion = read.nextShort();
            
        }while(validacion != 2);
                
        alumno.resultado(lista);
        
    }
    
}
