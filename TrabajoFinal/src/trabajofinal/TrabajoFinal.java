/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author RICHAR
 */
public class TrabajoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean agregarMasNombres = true;
        
        while (agregarMasNombres) {
            System.out.print("Ingresa un nombre: ");
            String nombre = scanner.nextLine();
            
            nombres.add(nombre);
            
            System.out.print("¿Deseas agregar otro nombre? (S/N): ");
            String respuesta = scanner.nextLine();
            
            if (!respuesta.equalsIgnoreCase("S")) {
                agregarMasNombres = false;
            }
        }
        
        System.out.println("\nListado de Nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        System.out.println("¡Hasta luego!");
 
        

// TODO code application logic here
    }
    
}
