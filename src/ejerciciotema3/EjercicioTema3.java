/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.
Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
 */
package ejerciciotema3;

/**
 *
 * @author victor
 */
public class EjercicioTema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        suma(2,4,5);
        
        Coche miCoche = new Coche();
        miCoche.incrementoPuertas();
        miCoche.incrementoPuertas();
        miCoche.incrementoPuertas();
        System.out.println("Cantidad de puertas de " + "miCoche" + ":");
        System.out.println(miCoche.puertas);
        
    }
    public static void suma(int a, int b, int c){
            int resultado = a+b+c;
            System.out.println("El resultado de la suma es: "+resultado);
        }
}

class Coche {
    public int puertas = 0;
    
    public void incrementoPuertas(){
        puertas ++;
    }
}