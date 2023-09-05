/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosjava1;

/**
 *
 * @author JulietaMoon
 */
public class FundamentosJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear 3 variable, una para la edad, otra para el nombre, y una última para su salario
        int edad;
        String nombre = "Julieta";
        double salario = 200;
        
        edad = 38;
        
        //Mostrar por pantalla Soy <nombre> tengo <edad> y mi sueldo es de <salario>
        System.out.println("Soy "+nombre+", tengo "+edad+" años y mi sueldo es de "+salario+" $");
        
        //seguidos
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
        
        System.out.println("--------------------------");
        
        System.out.println("ESTRUCTURA DE CONTROL - CONDICIONALES");
        
        edad = 38;
        
        if (edad >= 18) {
            System.out.println("Es mayor de 18");
        }
        if (edad >= 38){
            System.out.println("No está en el rango de edad");
        }
        else {
            System.out.println("Es menor de 18");
        }
    }
    
}
