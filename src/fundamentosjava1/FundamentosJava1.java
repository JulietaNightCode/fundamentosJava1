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
        System.out.println("BUCLE FOR");
        //El bucle FOR se utiliza cuando sabemos de antemano cuantas
        //veces queremos que se ejecute un bloque de código
        /*
        for (inicializacion; condicion; actualizacion) {
            BLOQUE DE CÓDIGO
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero: " + i);
        }
        //Crear un bucle que inicie en 1 y muestre hasta el número 5
        for (int i=1; i <= 5; i++) {
            System.out.println("Número: "+i);
        }
        */
        //Estudiar estructura de un arreglo en JAVA:
        //como acceder a sus posiciones, agregar y borrar datos.
        System.out.println("---------------------------");
        int[] numeros = {1,2,3,4,5};
        for (int j = 0; j <numeros.length; j++){
            System.out.println("Elemento" + j + ": " + numeros[j]);
        }
        System.out.println("---------------------------");
        System.out.println("BUCLE WHILE");
        /*
        El bucle While se utiliza cuando NO sabemos de antemano cuantas veces
        debe ejecutarse el bloque de código; Depende de una condicion
        para detenerse
        */
        /*ESTRUCTURA
        while (condicion){
            BLOQUE DE CÓDIGO
        }
        */
        int contador = 0;
        /*
        while (contador <= 5){
            System.out.println("Numero: "+contador);
            contador++;
        }
        */
        //Recorrer arreglo numeros con while
        while (contador < numeros.length) {
            System.out.println("Posicion: "+contador+": "+numeros[contador]);
            contador++;
        }
        
    }   
    
}
